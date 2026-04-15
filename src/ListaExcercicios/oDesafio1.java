package ListaExcercicios;

import java.util.Scanner;

public class oDesafio1 {
    public static void main(String[] args) {
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
}
