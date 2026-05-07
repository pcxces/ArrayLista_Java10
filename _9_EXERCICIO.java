package lista10_java;

import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letra = new char[15];
        int vogais = 0;
        String listaVogais = "AEIOUaeiou";

        for (int i = 0; i < 15; i++) {
            System.out.println("Informe a " + (i + 1) + "° letra: ");
            letra[i] = sc.next().charAt(0);

            if (listaVogais.indexOf(letra[i]) != -1) {
                vogais++;
            }
        }
        System.out.println("Quantidade de vogais digitados: " +vogais);
    }
}
