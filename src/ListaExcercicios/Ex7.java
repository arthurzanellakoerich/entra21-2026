package ListaExcercicios;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero:");
        int numero1 = sc.nextInt();
        System.out.println("Informe outro numero:");
        int numero2 = sc.nextInt();
        int soma = numero1+numero2;
        System.out.println("Soma total: " + soma);
    }
}
