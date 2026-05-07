package lista10_java;

import java.util.Random;
import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] og = new int[20];
        int[] partemp = new int[20];
        int contpar = 0;
        Random gerador = new Random();

        System.out.print("Vetor original: ");
        for (i = 0; i < 20; i++) {
            og[i] = gerador.nextInt(100); //Numeros de 0 a 99
            System.out.println(og[i] + " ");

            if (og[i] % 2 == 0) {
                partemp[contpar] = og[i];
                contpar++;
            }
            System.out.println("/n/n Vetor de pares: ");
            for (i = 0; i < contpar; i++) {
                System.out.println(partemp[i] + " ");
            }
        }
    }
}
