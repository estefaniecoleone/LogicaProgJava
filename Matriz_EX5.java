//Fazer um programa para ler duas matrizes de números inteiros A e B, contendo de M linhas e N colunas cada. Depois,
//gerar uma terceira matriz C onde cada elemento desta é a soma dos elementos correspondentes das matrizes originais.
//Imprimir na tela a matriz gerada.

import java.util.Scanner;

public class EX_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] matA = new int[M][N];
        int[][] matB = new int[M][N];
        int[][] matC = new int[M][N];

        int i;
        int j;
        for (i = 0; i < M; ++i) {
            for (j = 0; j < N; ++j) {
                matA[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < M; ++i) {
            for (j = 0; j < N; ++j) {
                matB[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < M; ++i) {
            for (j = 0; j < N; ++j) {
                matC[i][j] = matA[i][j] + matB[i][j];
            }
        }

        for (i = 0; i < M; ++i) {
            for (j = 0; j < N; ++j) {
                System.out.print(matC[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
