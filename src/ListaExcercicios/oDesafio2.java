package ListaExcercicios;

import java.util.Scanner;

public class oDesafio2 {
    public static void main(String[] args) {
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
}
