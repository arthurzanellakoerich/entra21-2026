package ListaExcercicios;

import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
    }

    static void ex1(){
        int x = 10;
        System.out.printf("Valor de x: " +  x);
    }

    static void ex2(){
        String nome = "Arthur";
        int idade = 21;
        double altura = 1.88;

        System.out.println("Nome: " + nome + " Idade " + idade + " Altura " + altura);
    }

    static void ex3(){
        int x = 10;
        int y = 5;
        int total = x+y;

        System.out.println("TOTAL SOMA:" + total);
    }

    static void ex4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o preço do produto?");
        double preco = sc.nextDouble();
        System.out.print("PREÇO DO PRODUTO:");
        System.out.println(preco);
    }

    static void ex5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome = sc.nextLine();
        System.out.println("----BEM VINDO----");
        System.out.println(nome);
    }

    static void ex6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        int idade = sc.nextInt();
        int futuraIdade = idade+10;
        System.out.println("Daqui 10 anos você terá " + futuraIdade + " anos");
    }

    static void ex7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero:");
        int numero1 = sc.nextInt();
        System.out.println("Informe outro numero:");
        int numero2 = sc.nextInt();
        int soma = numero1+numero2;
        System.out.println("Soma total: " + soma);
    }

    static void ex8(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero decimal:");
        double decimal = sc.nextDouble();
        double somaDecimal = decimal*2;
        System.out.println("TOTAL DECIMAL: " + somaDecimal);
    }

    static void ex9(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do produto:");
        double valorProduto = sc.nextDouble();
        double valorDesconto = valorProduto*0.9;
        System.out.println("Valor com desconto: " + valorDesconto);
    }

    static void ex10(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da LARGURA:");
        double largura = sc.nextDouble();
        System.out.println("Digite o valor da ALTURA:");
        double altura = sc.nextDouble();
        double valorTotal = largura*altura;
        System.out.println("AREA DO RETANGULO: " + valorTotal);
    }

    static void ex11(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota 1:");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a nota 2:");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a nota 3:");
        double nota3 = sc.nextDouble();
        double totalNotas = nota1+nota2+nota3;
        double mediaFinal = totalNotas/3;
        System.out.printf("MEDIA: %.2f%n", mediaFinal);
    }

    static void ex12(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salario:");
        double salario = sc.nextDouble();
        double novoSalario = salario*1.15;
        System.out.println("Seu novo salario: " + novoSalario);

    }

    static void ex13(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    static void ex14(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero1 = sc.nextInt();
        System.out.println("Digite outro numero:");
        int numero2 = sc.nextInt();
        System.out.println("Soma = " + (numero1+numero2));
        System.out.println("Subtração = " + (numero1-numero2));
        System.out.println("Multiplicação = " + (numero1*numero2));
        System.out.println("Divisão = " + (numero1/numero2));
    }

    static void ex15(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius:");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperatura em Fahrenheit:" + fahrenheit);
    }

    static void ex16(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de horas:");
        double horasTrabalhadas = sc.nextDouble();
        System.out.println("Valor por hora:");
        double valorHora = sc.nextDouble();
        double salarioTotal = horasTrabalhadas*valorHora;
        System.out.println("Salário total: " + salarioTotal);
    }

    static void desafio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite 3 números:");
        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();
        double numero3 = sc.nextDouble();
        double soma = numero1+numero2+numero3;
        double mediaFinal = soma/3;

        if (mediaFinal >7){
            System.out.println("--------------------");
            System.out.println("PARABÉNS " + nome);
            System.out.printf("MÉDIA FINAL: %.2f%n", mediaFinal);
            System.out.println("VOCÊ FOI APROVADO!!!");
        } else {
            System.out.println("---------------------");
            System.out.printf("MÉDIA FINAL: %.2f%n", mediaFinal);
            System.out.println("INFELIZMENTE VOCÊ FOI REPROVADO.");
        }
    }

    static void desafio2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nomep = sc.nextLine();
        sc.nextLine();
        System.out.println("Preço do produto:");
        double preco = sc.nextDouble();
        System.out.println("Quantidade:");
        int quantidade = sc.nextInt();
        double valorTotal = quantidade*preco;
        System.out.println("VALOR TOTAL DE = " + valorTotal);
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
        desafio();
        desafio2();
         */

}
