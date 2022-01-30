//4) Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar a soma dos elementos acima da diagonal principal.

import java.util.Scanner;

public class EX_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] mat = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int soma = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                soma = soma + mat[i][j];
            }
        }

        System.out.println(soma);
        sc.close();
    }
}
