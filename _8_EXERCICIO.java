import java.util.Scanner;

public class TrocaMetades {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = leitor.nextInt();
        }

        // Troca os elementos (0 com 6, 1 com 7, etc)
        for (int i = 0; i < 6; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[i + 6];
            vetor[i + 6] = temp;
        }

        System.out.print("\nVetor Resultante: ");
        for (int num : vetor) System.out.print(num + " ");
    }
}
