package lista10_java;

import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        char[] questao = {'A', 'B', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E'};
        char[]nota = new char[10];
        int acerto = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Resposta da questão:" + (i + 1) + ": ");
            nota[i] = leitor.next().toUpperCase().charAt(0);

            if (nota[i] == questao[i]) {
                acerto++;
            }

        }
        System.out.println("\nTotal de acertos: " + acerto);
    }
}
