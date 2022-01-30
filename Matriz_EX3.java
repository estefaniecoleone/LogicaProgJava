//3) Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar qual o maior elemento de cada linha. Suponha não haver empates.

import java.util.Scanner;

public class EX_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] mat = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            int maior = 0;
            for (int j = 0; j < N; j++) {
                if (maior < mat[i][j]) {
                    maior = mat[i][j];
                }
            }
            System.out.println(maior);
        }
        sc.close();
    }
}
