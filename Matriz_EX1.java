import java.util.Scanner;

public class EX_1 {
    public EX_1() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] mat = new int[M][N];

        int i;
        int j;
        for (i = 0; i < M; ++i) {
            for (j = 0; j < N; ++j) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("VALORES NEGATIVOS: ");

        for (i = 0; i < M; ++i) {
            for (j = 0; j < N; ++j) {
                if (mat[i][j] < 0) {
                    System.out.println(mat[i][j]);
                }
            }
        }
        sc.close();
    }
}
