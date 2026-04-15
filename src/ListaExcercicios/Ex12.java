package ListaExcercicios;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salario:");
        double salario = sc.nextDouble();
        double novoSalario = salario*1.15;
        System.out.println("Seu novo salario: " + novoSalario);

    }
}
