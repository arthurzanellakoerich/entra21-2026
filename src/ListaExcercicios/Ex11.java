package ListaExcercicios;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
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
}
