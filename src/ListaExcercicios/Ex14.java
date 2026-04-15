package ListaExcercicios;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
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
}
