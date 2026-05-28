// Entrada de dados do usuário

let nome = prompt('Qual é o seu nome?')

if (nome && nome.trim() !== '') {
    console.log('Olá,', nome + '!')
} else {
    console.log('Nenhum nome informado.')
}
