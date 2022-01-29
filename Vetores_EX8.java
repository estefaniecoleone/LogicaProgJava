// 8) Tem-se um conjunto de dados contendo a altura e o sexo (M, F) de N pessoas. Fazer um programa que calcule e escreva:
// a maior e a menor altura do grupo
// a média de altura das mulheres
// o número de homens

package program;

import java.util.Locale;
import java.util.Scanner;

public class EX_8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double[] altura = new double[N];
        char[] sexo = new char[N];

        for (int i = 0; i < N; i++) {
            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);
        }
        double maiorAltura = altura[0];
        double menorAltura = altura[0];
        double mediaAlturaF = 0;

        int qtdM = 0, qtdF = 0;

        for (int i = 1; i < N; i++) {
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
        }
        for (int i = 1; i < N; i++) {
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }
        for (int i = 0; i < N; i++) {
            if (sexo[i] == 'F') {
                mediaAlturaF = mediaAlturaF + altura[i];
                qtdF = qtdF + 1;
            }
        }

        for (int i = 0; i < N; i++) {
            if (sexo[i] == 'M') {
                qtdM = qtdM + 1;
            }
        }
        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.println("Media das alturas das mulheres = " + mediaAlturaF / qtdF);
        System.out.println("Numero de homens = " + qtdM);

    }
}
