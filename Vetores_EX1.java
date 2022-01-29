//1) Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número
//do vetor (supor não haver empates). Mostrar também a posição do maior elemento.

package program;

import java.util.Scanner;

public class EX_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] vet = new int[N];

        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextInt();
        }

        int maior = vet[0];
        int posMaior = 0;

        for (int i = 0; i < N; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
                posMaior = i;
            }
        }

        System.out.println(maior);
        System.out.println(posMaior);
        sc.close();
    }
}
