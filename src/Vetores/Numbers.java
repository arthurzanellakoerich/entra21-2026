package Vetores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++){
            System.out.println("Digite o " + (i + 1) + " número:");
            int num = sc.nextInt();
            numeros.add(num);
        }

        Collections.sort(numeros);
        System.out.println("Números digitados em ordem crescente:");
        System.out.println(numeros);
    }
}
