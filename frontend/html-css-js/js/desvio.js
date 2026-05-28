// Desvio condicional - verificação de números

function classificarNumero(numero) {
    if (numero < 0) {
        console.log(numero + ' é negativo')
    } else if (numero === 0) {
        console.log(numero + ' é zero')
    } else {
        console.log(numero + ' é positivo')
    }
}

classificarNumero(10)
classificarNumero(-20)
classificarNumero(30)
classificarNumero(0)
classificarNumero(-3)
