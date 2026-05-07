package Lista10_JavaFlowgorithm;

import java.util.Scanner;

public class _6_EXERCICIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Vetor A [" +i+ "]: ");
            vetorA[i] = sc.nextInt();
        }
        System.out.println("Digite multiplicador (X): ");
        int x = sc.nextInt();

        System.out.println("Vetor B Resultante: ");
        for (int i = 0; i < 10; i++) {
            vetorB[i] = vetorA[i] * x;
            System.out.println(vetorB[i] + " ");
        } sc.close();
    }
}
