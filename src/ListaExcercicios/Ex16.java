package ListaExcercicios;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de horas:");
        double horasTrabalhadas = sc.nextDouble();
        System.out.println("Valor por hora:");
        double valorHora = sc.nextDouble();
        double salarioTotal = horasTrabalhadas*valorHora;
        System.out.println("Salário total: " + salarioTotal);
    }
}
