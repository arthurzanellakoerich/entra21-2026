package ListaExcercicios;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        int idade = sc.nextInt();
        int futuraIdade = idade+10;
        System.out.println("Daqui 10 anos você terá " + futuraIdade + " anos");
    }
}
