package ListaExcercicios;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero decimal:");
        double decimal = sc.nextDouble();
        double somaDecimal = decimal*2;
        System.out.println("TOTAL DECIMAL: " + somaDecimal);
    }
}
