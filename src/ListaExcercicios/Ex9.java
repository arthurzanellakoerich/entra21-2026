package ListaExcercicios;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do produto:");
        double valorProduto = sc.nextDouble();
        double valorDesconto = valorProduto*0.9;
        System.out.println("Valor com desconto: " + valorDesconto);
    }
}
