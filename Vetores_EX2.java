//2) Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela:
//- todos os números pares
//- a quantidade de números pares

package program;

import java.util.Scanner;

public class EX_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] vet = new int[N];
        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextInt();
        }
        int npar = 0;

        for (int i = 0; i < N; i++) {
            if (vet[i] % 2 == 0) {
                System.out.println(vet[i]);
                npar = npar + 1;
            }
        }

        System.out.println(npar);
        sc.close();
    }
}

