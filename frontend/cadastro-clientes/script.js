/* =========================
   SALVAR E CARREGAR DO localStorage
========================= */
function carregarClientes() {
  return JSON.parse(localStorage.getItem('clientes') || '[]');
}

function salvarClientes(clientes) {
  localStorage.setItem('clientes', JSON.stringify(clientes));
}

/* =========================
   MENSAGEM DE FEEDBACK
========================= */
function mostrarMsg(texto, tipo) {
  const el = document.getElementById('msg');
  if (!el) return;

  el.textContent = texto;
  el.className = 'msg ' + tipo;

  // Apaga a mensagem depois de 3 segundos
  setTimeout(() => {
    el.className = 'msg';
  }, 3000);
}

/* =========================
   BUSCA DE CEP (CADASTRO)
========================= */
function buscarCEP() {
  const cepInput = document.getElementById('cep');
  if (!cepInput) return;

  const cep = cepInput.value.replace(/\D/g, ''); // Remove tudo que não for número
  if (cep.length !== 8) return;


  const msgCep = document.getElementById('msg-cep');
  if (msgCep) msgCep.style.display = 'block';

  fetch(`https://viacep.com.br/ws/${cep}/json/`)
    .then(res => res.json())
    .then(data => {
      if (msgCep) msgCep.style.display = 'none';
      if (data.erro) {
        mostrarMsg('CEP não encontrado.', 'erro');
        return;
      }

      document.getElementById('rua').value    = data.logradouro || '';
      document.getElementById('bairro').value = data.bairro     || '';
      document.getElementById('cidade').value = data.localidade || '';
      document.getElementById('estado').value = data.uf         || '';
    });
}

/* =========================
   CADASTRAR CLIENTE
========================= */
function cadastrar() {
  const nome     = document.getElementById('nome').value.trim();
  const email    = document.getElementById('email').value.trim();
  const telefone = document.getElementById('telefone').value.trim();
  const cep      = document.getElementById('cep').value.trim();
  const rua      = document.getElementById('rua').value.trim();
  const bairro   = document.getElementById('bairro').value.trim();
  const cidade   = document.getElementById('cidade').value.trim();
  const estado   = document.getElementById('estado').value.trim();

  // Validação: nome e email obrigatórios
  if (!nome || !email) {
    mostrarMsg('Preencha pelo menos o nome e o email.', 'erro');
    return;
  }

  // Validação do email: precisa ter @ e pelo menos 3 caracteres antes do @
  const emailValido = email.includes('@') && email.split('@')[0].length >= 3;
  if (!emailValido) {
    mostrarMsg('Email inválido. Ex: ana@email.com', 'erro');
    return;
  }

  const clientes = carregarClientes();

  clientes.push({ nome, email, telefone, cep, rua, bairro, cidade, estado });

  salvarClientes(clientes);
  mostrarMsg('Cliente cadastrado com sucesso!', 'sucesso');

  // Limpa os campos
  document.getElementById('nome').value     = '';
  document.getElementById('email').value    = '';
  document.getElementById('telefone').value = '';
  document.getElementById('cep').value      = '';
  document.getElementById('rua').value      = '';
  document.getElementById('bairro').value   = '';
  document.getElementById('cidade').value   = '';
  document.getElementById('estado').value   = '';
}

/* =========================
   RENDERIZAR LISTA DE CLIENTES
========================= */
function renderLista() {
  const clientes = carregarClientes();
  const lista = document.getElementById('lista');
  if (!lista) return;

  if (clientes.length === 0) {
    lista.innerHTML = '<p class="vazio">Nenhum cliente cadastrado ainda.</p>';
    return;
  }

  lista.innerHTML = clientes.map((c, i) => `
    <div class="card-cliente">

      <div class="card-info">
        <p><strong>Nome:</strong> ${c.nome}</p>
        <p><strong>Email:</strong> ${c.email}</p>
        <p><strong>Telefone:</strong> ${c.telefone || 'Não informado'}</p>

        <!-- Detalhes do endereço (oculto por padrão, somente leitura) -->
        <div id="detalhes-${i}" class="detalhes">

          <div class="campo-detalhe">
            <label>CEP</label>
            <input type="text" value="${c.cep || ''}" readonly>
          </div>

          <div class="campo-detalhe">
            <label>Rua</label>
            <input type="text" value="${c.rua || ''}" readonly>
          </div>

          <div class="campo-detalhe">
            <label>Bairro</label>
            <input type="text" value="${c.bairro || ''}" readonly>
          </div>

          <div class="campo-detalhe">
            <label>Cidade</label>
            <input type="text" value="${c.cidade || ''}" readonly>
          </div>

          <div class="campo-detalhe">
            <label>Estado</label>
            <input type="text" value="${c.estado || ''}" readonly>
          </div>

        </div>
      </div>

      <div class="card-botoes">
        <button onclick="toggleDetalhes(${i})">Endereço</button>
        <button onclick="abrirModal(${i})"> Editar</button>
        <button class="btn-excluir" onclick="excluir(${i})">Excluir</button>
      </div>

    </div>
  `).join('');
}

/* =========================
   MOSTRAR/ESCONDER ENDEREÇO
========================= */
function toggleDetalhes(i) {
  const el = document.getElementById(`detalhes-${i}`);

  if (el.style.display === 'block') {
    el.style.display = 'none';
  } else {
    el.style.display = 'block';
  }
}

/* =========================
   EXCLUIR CLIENTE (sem confirmação)
========================= */
function excluir(i) {
  const clientes = carregarClientes();
  clientes.splice(i, 1);
  salvarClientes(clientes);
  renderLista();
  mostrarMsg('Cliente excluído.', 'sucesso');
}

/* =========================
   MODAL - ABRIR / FECHAR
========================= */
let editandoIndex = null;

function abrirModal(i) {
  const clientes = carregarClientes();
  const c = clientes[i];

  editandoIndex = i;

  document.getElementById('editNome').value     = c.nome      || '';
  document.getElementById('editEmail').value    = c.email     || '';
  document.getElementById('editTelefone').value = c.telefone  || '';
  document.getElementById('editCep').value      = c.cep       || '';
  document.getElementById('editRua').value      = c.rua       || '';
  document.getElementById('editBairro').value   = c.bairro    || '';
  document.getElementById('editCidade').value   = c.cidade    || '';
  document.getElementById('editEstado').value   = c.estado    || '';

  document.getElementById('modal').classList.add('aberto');
}

function fecharModal() {
  document.getElementById('modal').classList.remove('aberto');
}

/* =========================
   SALVAR EDIÇÃO
========================= */
function salvarEdicao() {
  const clientes = carregarClientes();

  clientes[editandoIndex] = {
    ...clientes[editandoIndex],
    nome:     document.getElementById('editNome').value,
    email:    document.getElementById('editEmail').value,
    telefone: document.getElementById('editTelefone').value,
    cep:      document.getElementById('editCep').value,
    rua:      document.getElementById('editRua').value,
    bairro:   document.getElementById('editBairro').value,
    cidade:   document.getElementById('editCidade').value,
    estado:   document.getElementById('editEstado').value,
  };

  salvarClientes(clientes);
  fecharModal();
  renderLista();
  mostrarMsg('Cliente atualizado com sucesso!', 'sucesso');
}

/* =========================
   BUSCA DE CEP (EDIÇÃO)
========================= */
function buscarCEPEdicao() {
  const cepInput = document.getElementById('editCep');
  if (!cepInput) return;

  const cep = cepInput.value.replace(/\D/g, '');
  if (cep.length !== 8) return;

  const msgCep = document.getElementById('msg-cep-edicao');
  if (msgCep) msgCep.style.display = 'block';

  fetch(`https://viacep.com.br/ws/${cep}/json/`)
    .then(res => res.json())
    .then(data => {
      if (msgCep) msgCep.style.display = 'none';
      if (data.erro) return;

      document.getElementById('editRua').value    = data.logradouro || '';
      document.getElementById('editBairro').value = data.bairro     || '';
      document.getElementById('editCidade').value = data.localidade || '';
      document.getElementById('editEstado').value = data.uf         || '';
    });
}

/* =========================
   INICIAR A PÁGINA
========================= */
renderLista();
