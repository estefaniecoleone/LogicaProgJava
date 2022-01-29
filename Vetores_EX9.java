//9) Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto, mandou digitar
//um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de venda das mesmas. Fazer um
//programa que leia tais dados e determine e escreva quantas mercadorias proporcionaram:
// lucro< 10%
// 10% ≤ lucro ≤ 20%
// lucro> 20%
//Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como o lucro total

package program;

import java.util.Locale;
import java.util.Scanner;

public class EX_9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[] nome = new String[N];
        double[] valorCompra = new double[N];
        double[] valorVenda = new double[N];

        for (int i = 0; i < N; i++) {
            nome[i] = sc.next();
            valorCompra[i] = sc.nextDouble();
            valorVenda[i] = sc.nextDouble();
        }

        int qtd_10 = 0, qtd_10_20 = 0, qtd_20 = 0;
        double valorTotalCompra = 0, valorTotalVenda = 0, lucroTotal = '0';

        for (int i = 0; i < N; i++) {
            double lucro = valorVenda[i] - valorCompra[i];

            valorTotalCompra = valorTotalCompra + valorCompra[i];
            valorTotalVenda = valorTotalVenda + valorVenda[i];

            if (lucro / valorCompra[i] < 0.10) {
                qtd_10 = qtd_10 + 1;
            }
            if (lucro / valorCompra[i] >= 0.10 && lucro / valorCompra[i] <= 0.20) {
                qtd_10_20 = qtd_10_20 + 1;
            }
            if (lucro / valorCompra[i] > 0.20) {
                qtd_20 = qtd_20 + 1;
            }

        }
        lucroTotal = valorTotalVenda - valorTotalCompra;

        System.out.println("Lucro abaixo de 10%: " + qtd_10);
        System.out.println("Lucro entre 10% e 20%: " + qtd_10_20);
        System.out.println("Lucro acima de 20%: " + qtd_20);
        System.out.println("Valor total de compra: " + valorTotalCompra);
        System.out.println("Valor total de venda: " + valorTotalVenda);
        System.out.println("Lucro total: " + lucroTotal);
    }
}
