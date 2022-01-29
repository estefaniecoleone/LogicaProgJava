//5) Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média aritmética somente
//dos números pares lidos.package program;

import java.util.Scanner;

public class EX_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] vet = new int[N];
      
        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextInt();
        }
      
        double soma = 0;
        for (int i = 0; i < N; i++) {
            if (vet[i] % 2 == 0) {
                soma = soma + vet[i];
            }
        }
      
        for (int i = 0; i < N; i++) {
            System.out.println(vet[i]);
        }

    }
}
