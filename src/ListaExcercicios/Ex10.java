package ListaExcercicios;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da LARGURA:");
        double largura = sc.nextDouble();
        System.out.println("Digite o valor da ALTURA:");
        double altura = sc.nextDouble();
        double valorTotal = largura*altura;
        System.out.println("AREA DO RETANGULO: " + valorTotal);

    }
}
