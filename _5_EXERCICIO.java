package Lista10_JavaFlowgorithm;

import java.util.Scanner;

public class _5_EXERCICIO {
    public static void main(String[] args) {
        int[] dados = {10, 25, 30, 42, 55, 68, 71, 89, 93, 100};
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número para pesquisar: ");
        int busca = leitor.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < dados.length; i++) {
            if (dados[i] == busca) {
                System.out.println("Número encontrado no índice: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) System.out.println("O número não foi encontrado.");
    }
}





