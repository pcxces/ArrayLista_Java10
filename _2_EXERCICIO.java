package Lista10_JavaFlowgorithm;

import java.util.Scanner;

public class _2_EXERCICIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double[] valores = new Double[15];

        for (int i = 0; i < 15; i++) {
            System.out.println("Informe o " +i+"° número: ");
            valores[i] = sc.nextDouble();
        }
        int posMaior = 0, posMenor = 0;

        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > valores[posMaior]) posMaior = i;
            if (valores[i] < valores[posMenor]) posMenor = i;
            }
        System.out.println("Maior valor: " +valores[posMaior]+ " no índice: " +posMaior);
        System.out.println("Menor valor: " +valores[posMenor]+ " no índice: " +posMenor);
        sc.close();
        }
    }