//6) Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Depois, mostrar na tela o nome da pessoa mais velha.

package program;

import java.util.Scanner;

public class EX_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] nome = new String[N];
        int[] idade = new int[N];

        for (int i = 0; i < N; i++) {
            nome[i] = sc.next();
            idade[i] = sc.nextInt();
        }

        int maiorIdade = 0;
        int posicaoMaior = 0;

        for (int i = 0; i < N; i++) {
            if (idade[i] > maiorIdade) {
                maiorIdade = idade[i];
                posicaoMaior = i;
            }
        }

        System.out.println("Pessoa mais velha: " + nome[posicaoMaior] + " " + idade[posicaoMaior] + " anos");
    }
}
