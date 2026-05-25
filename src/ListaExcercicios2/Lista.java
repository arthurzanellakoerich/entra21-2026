package ListaExcercicios2;

import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
    }

    static void ex1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("NÚMERO PAR");
        } else {
            System.out.println("NÚMERO IMPAR");
        }
    }

    static void ex2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int n1 = sc.nextInt();
        System.out.println("Digite outro numero");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("Numero: " + n1 + " É o maior.");
        } else {
            System.out.println("Numero: " + n2 + " É o maior.");
        }
    }

    static void ex3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("NUMERO: " + numero + " É NEGATIVO.");
        } else if (numero > 0) {
            System.out.println("NÚMERO " + numero + "É POSITIVO");
        } else {
            System.out.println("NUMERO É 0");
        }

    }

    static void ex4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1 número:");
        double numero1 = sc.nextDouble();

        if (numero1 > 6) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }

    static void ex5() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade");
        double numero1 = sc.nextDouble();

        if (numero1 >= 16) {
            System.out.println("PODE VOTAR");
        } else {
            System.out.println("NAO PODE VOTAR");
        }
    }

    static void ex6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n1 = sc.nextInt();
        System.out.println("Digite outro número:");
        int n2 = sc.nextInt();
        System.out.println("Digite mais um número:");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("MAIOR NÚMERO: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("MAIOR NÚMERO: " + n2);
        } else {
            System.out.println("MAIOR NÚMERO: " + n3);
        }

    }

    static void ex7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua nota:");
        double nota = sc.nextDouble();

        if (nota >= 0 && nota <= 4) {
            System.out.println("Insuficiente");
        } else if (nota <= 6) {
            System.out.println("Regular");
        } else if (nota <= 8) {
            System.out.println("BOM");
        } else {
            System.out.println("Excelente");
        }

    }

    static void ex8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro lado:");
        double x = sc.nextDouble();

        System.out.println("Segundo lado:");
        double y = sc.nextDouble();

        System.out.println("Terceiro lado:");
        double z = sc.nextDouble();

        if (x + y > z && x + z > y && y + z > x) {
            System.out.println("Os lados formam um triângulo.");
        } else {
            System.out.println("Os lados NÃO formam um triângulo.");
        }
    }

    static void ex9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o lado A: ");
        double a = sc.nextDouble();

        System.out.print("Digite o lado B: ");
        double b = sc.nextDouble();

        System.out.print("Digite o lado C: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }

        } else {
            System.out.println("Os valores NÃO formam um triângulo.");
        }
    }

    static void ex10() {
        Scanner sc = new Scanner(System.in);

        String usuario;
        String senha;
        String usuarioAcesso = "adminstrador";
        String senhaAcesso = "12345";

        System.out.print("Digite o usuário: ");
        usuario = sc.nextLine();

        System.out.print("Digite a senha: ");
        senha = sc.nextLine();

        if (usuario.equals(usuarioAcesso) && senha.equals(senhaAcesso)) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }
    }

    static void ex11() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Não é bissexto");
        }
    }

    static void ex12() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double resultado;

        if (op == '+') {
            resultado = n1 + n2;
            System.out.println("Resultado: " + resultado);

        } else if (op == '-') {
            resultado = n1 - n2;
            System.out.println("Resultado: " + resultado);

        } else if (op == '*') {
            resultado = n1 * n2;
            System.out.println("Resultado: " + resultado);

        } else if (op == '/') {
            if (n2 != 0) {
                resultado = n1 / n2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Erro: divisão por zero!");
            }

        } else {
            System.out.println("Operação inválida!");
        }
    }

    static void ex13() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();

        double imposto = 0;

        if (salario <= 2500) {
            imposto = 0;

        } else if (salario <= 3500) {
            imposto = salario * 0.10;

        } else if (salario <= 5500) {
            imposto = salario * 0.15;

        } else {
            imposto = salario * 0.20;
        }

        System.out.println("Imposto: R$ " + imposto);

    }

    static void ex14() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valor = sc.nextDouble();

        double desconto = 0;

        if (valor <= 100) {
            desconto = 0;

        } else if (valor <= 500) {
            desconto = valor * 0.10;

        } else {
            desconto = valor * 0.20;
        }

        double valorFinal = valor - desconto;

        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);
    }

    static void ex15() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Criança");

        } else if (idade <= 17) {
            System.out.println("Adolescente");

        } else if (idade <= 59) {
            System.out.println("Adulto");

        } else if (idade > 60) {
            System.out.println("Idoso");

        } else {
            System.out.println("Idade inválida");
        }
    }

    static void ex16() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite 3 números:");
        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();
        double numero3 = sc.nextDouble();
        double soma = numero1 + numero2 + numero3;
        double mediaFinal = soma / 3;

        if (mediaFinal >= 7) {
            System.out.println("--------------------");
            System.out.println("PARABÉNS " + nome);
            System.out.printf("MÉDIA FINAL: %.2f%n", mediaFinal);
            System.out.println("VOCÊ FOI APROVADO!!!");
        } else if (mediaFinal >= 5) {
            System.out.println("VOCÊ ESTÁ EM RECUPERAÇÃO:");
        } else {
            System.out.println("---------------------");
            System.out.printf("MÉDIA FINAL: %.2f%n", mediaFinal);
            System.out.println("INFELIZMENTE VOCÊ FOI REPROVADO.");
        }
    }

    static void ex17() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário: R$ ");
        double salario = sc.nextDouble();

        System.out.print("Digite o valor da parcela: R$ ");
        double parcela = sc.nextDouble();

        double limite = salario * 0.35;

        if (parcela <= limite) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo negado!");
        }

    }

    static void ex18() {
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = 9;

        System.out.print("Digite seu palpite: ");
        int palpite = sc.nextInt();

        if (palpite < numeroSecreto) {
            System.out.println("O número secreto é maior");
        } else if (palpite > numeroSecreto) {
            System.out.println("O número secreto é menor");
        } else {
            System.out.println("Parabéns! Você acertou");
        }

    }

    static void ex19() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso:");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }

    }

    static void ex20() {
        Scanner sc = new Scanner(System.in);

        String usuarioAcesso = "administrador";
        String senhaAcesso = "12345";

        int tentativas = 0;
        boolean acessoPermitido = false;

        while (tentativas < 3 && !acessoPermitido) {

            System.out.print("Digite o usuário: ");
            String usuario = sc.nextLine();

            System.out.print("Digite a senha: ");
            String senha = sc.nextLine();

            if (usuario.equals(usuarioAcesso) && senha.equals(senhaAcesso)) {
                System.out.println("Acesso permitido");
                acessoPermitido = true;
            } else {
                tentativas++;
                System.out.println("Acesso negado. Tentativa " + tentativas + " de 3.");
            }
        }

        if (!acessoPermitido) {
            System.out.println("Número máximo de tentativas atingido. Acesso bloqueado.");
        }
    }
     /*
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
        ex9();
        ex10();
        ex11();
        ex12();
        ex13();
        ex14();
        ex15();
        ex16();
        ex17();
        ex18();
        ex19();
        ex20();
         */

}

