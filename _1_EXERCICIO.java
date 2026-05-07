package lista10_java;

import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int [10];
        int soma = 0;
        int i;
        double media;

        for (i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "° número: ");
            n[i] = sc.nextInt();
            soma+=n[i];
        }
        media = soma/10.0;
        System.out.println("\n Soma total: " +soma);
        System.out.println("Media aritmetica: " +media);


    }
}
