//Um dos exercícios que o sargento Silva realiza com o pelotão é o exercício "girar fila", que consiste em dizer o número de uma fila, 
//de modo que os soldados desta fila devem se mover para a direita, e o último soldado da direita vai para a
//posição mais à esquerda. Você deve fazer um programa para ler a formação do pelotão e executar o exercício "girar fila".
//Entrada:
//A entrada consiste em um inteiro M representando o número de filas, um inteiro N representado a quantidade de soldados
//por fila, as M filas de soldados (cada soldado é representado por um número inteiro), e o número inteiro para o exercício
//"girar fila"

import java.util.Locale;
import java.util.Scanner;

public class EX_7 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(); //NUMERO DE FILAS
        int N = sc.nextInt(); // QUANTIDADE DE SOLDADOS
        int[][] fila = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                fila[i][j] = sc.nextInt();
            }
        }

        int numeroFila = sc.nextInt();

        for (int i = 0; i < M; i++) {
            if (i == numeroFila -1) {
                int ultimo = fila[i][N - 1];

                for (int j = N - 1; j > 0; j--) {
                    fila[i][j] = fila[i][j - 1];
                }
                fila[i][0] = ultimo;
            }
        }
      
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(fila[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
