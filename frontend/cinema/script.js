/* =========================
   CONFIGURAÇÕES DA SALA
========================= */

// Letras das fileiras
const fileiras = ['A', 'B', 'C', 'D', 'E', 'F', 'G'];

// Número de assentos por fileira
const assentosPorFileira = 10;

// Preço por assento
const precoPorAssento = 28.00;

// Assentos já ocupados (gerados aleatoriamente)
const ocupados = gerarOcupados();

// Assentos que o usuário selecionou
let selecionados = [];

/* =========================
   GERAR ASSENTOS OCUPADOS
========================= */
function gerarOcupados() {
  const lista = [];

  // Sorteia cerca de 20 assentos aleatórios como ocupados
  fileiras.forEach(f => {
    for (let n = 1; n <= assentosPorFileira; n++) {
      if (Math.random() < 0.25) { // 25% de chance de estar ocupado
        lista.push(f + n);
      }
    }
  });

  return lista;
}


function montarSala() {
  const sala = document.getElementById('sala');
  sala.innerHTML = '';

  fileiras.forEach(letra => {
    // Cria a linha da fileira
    const fileira = document.createElement('div');
    fileira.className = 'fileira';

    // Rótulo da fileira (A, B, C...)
    const label = document.createElement('span');
    label.className = 'fileira-label';
    label.textContent = letra;
    fileira.appendChild(label);


    for (let n = 1; n <= assentosPorFileira; n++) {


      if (n === 6) {
        const espaco = document.createElement('div');
        espaco.className = 'espaco';
        fileira.appendChild(espaco);
      }

      const id = letra + n;
      const btn = document.createElement('button');
      btn.className = 'assento';
      btn.textContent = n;
      btn.id = 'assento-' + id;

      // Define o estado do assento
      if (ocupados.includes(id)) {
        btn.classList.add('ocupado');
        btn.disabled = true;
      } else {
        btn.classList.add('livre');
        btn.onclick = () => toggleAssento(id);
      }

      fileira.appendChild(btn);
    }

    sala.appendChild(fileira);
  });
}

function toggleAssento(id) {
  const btn = document.getElementById('assento-' + id);

  if (selecionados.includes(id)) {
    // Desseleciona
    selecionados = selecionados.filter(s => s !== id);
    btn.classList.remove('selecionado');
    btn.classList.add('livre');
  } else {
    // Seleciona
    selecionados.push(id);
    btn.classList.remove('livre');
    btn.classList.add('selecionado');
  }

  atualizarResumo();
}

function atualizarResumo() {
  const textoResumo  = document.getElementById('texto-resumo');
  const textoTotal   = document.getElementById('texto-total');
  const btnConfirmar = document.getElementById('btn-confirmar');

  if (selecionados.length === 0) {
    textoResumo.textContent  = 'Nenhum assento selecionado.';
    textoTotal.textContent   = '';
    btnConfirmar.disabled    = true;
    return;
  }

  // Monta a lista de assentos ex: A1, A2, B5
  const lista  = selecionados.sort().join(', ');
  const total  = (selecionados.length * precoPorAssento).toFixed(2).replace('.', ',');

  textoResumo.textContent = `Assentos: ${lista}`;
  textoTotal.textContent  = `Total: R$ ${total}`;
  btnConfirmar.disabled   = false;
}

function confirmar() {
  const lista = selecionados.sort().join(', ');
  const total = (selecionados.length * precoPorAssento).toFixed(2).replace('.', ',');

  selecionados.forEach(id => {
    ocupados.push(id);
  });

  selecionados = [];
  montarSala();

  const resumo = document.getElementById('texto-resumo');
  const textoTotal = document.getElementById('texto-total');
  const btnConfirmar = document.getElementById('btn-confirmar');

  resumo.innerHTML = `✅ Compra confirmada! <br> Assentos: <strong>${lista}</strong>`;
  textoTotal.textContent = `Total pago: R$ ${total} `;
  btnConfirmar.disabled = true;

  setTimeout(() => {
    atualizarResumo();
  }, 4000);
}

/* =========================
   INICIAR
========================= */
montarSala();
