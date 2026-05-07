import java.util.Scanner;

public class _10_EXERCICIO {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] v = new int[10];
        int[] s = new int[10];
        int acumulador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("V[" + i + "]: ");
            v[i] = leitor.nextInt();

            acumulador += v[i];
            s[i] = acumulador;
        }

        System.out.print("\nVetor S (Acumulado): ");
        for (int num : s) System.out.print(num + " ");
    }
}
