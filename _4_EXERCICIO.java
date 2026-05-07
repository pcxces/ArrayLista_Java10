package Lista10_JavaFlowgorithm;

import java.util.Scanner;

public class _4_EXERCICIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] aluno = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome do " + (i + 1) + "° aluno: ");
            aluno[i] = sc.nextLine();
        }
        System.out.println("Nomes dos alunos em lista inversa é: ");
        for (int i = 9; i >= 0; i--) {
            System.out.println(aluno[i]);
        } sc.close();
    }
}
