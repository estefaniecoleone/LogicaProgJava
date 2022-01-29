//4) Fazer um programa para ler um vetor de N números reais. Em seguida, mostrar na tela a média aritmética de todos
//elementos. Depois mostrar todos os elementos do vetor que estejam abaixo da média.package program;

import java.util.Scanner;

public class EX_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] vet = new double[N];
        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < N; i++) {
            soma = soma + vet[i];
        }

        double media = soma / N;
        System.out.println(media);

        for (int i = 0; i < N; i++) {
            if (vet[i] < media){
                System.out.println(vet[i]);}
        }
        }
}
