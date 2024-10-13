/*
Um comerciante deseja fazer um levantamento do 
lucro das 20 mercadorias que comercializa. Para 
cada mercadoria ele tem o nome, o preço de compra
 (PC) e o preço de venda (PV). Descreva 
 um algoritmo que:

escreva quantas mercadorias proporcionam: (lucro < 10%), (10% <= lucro <= 20%) e (lucro > 20%), onde o percentual de lucro é calculado da seguinte forma: % = (PV - PC) / PC * 100;
determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.
 */

import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Variáveis para armazenar contagens e totais
        int countMenos10 = 0; // Mercadorias com lucro < 10%
        int count10a20 = 0; // Mercadorias com 10% <= lucro <= 20%
        int countMais20 = 0; // Mercadorias com lucro > 20%

        double totalCompra = 0; // Valor total de compra
        double totalVenda = 0; // Valor total de venda
        double totalLucro = 0; // Lucro total

        // Loop para ler dados de 20 mercadorias
        for (int i = 1; i <= 20; i++) {
            System.out.println("Mercadoria " + i + ":");
            System.out.print("Nome: ");
            String nome = teclado.next(); // Lê o nome da mercadoria
            System.out.print("Preço de Compra (PC): ");
            double precoCompra = teclado.nextDouble(); // Lê o preço de compra
            System.out.print("Preço de Venda (PV): ");
            double precoVenda = teclado.nextDouble(); // Lê o preço de venda

            // Calcula o lucro percentual
            double lucro = (precoVenda - precoCompra) / precoCompra * 100;

            // Contagem das mercadorias em faixas de lucro
            if (lucro < 10) {
                countMenos10++;
            } else if (lucro >= 10 && lucro <= 20) {
                count10a20++;
            } else {
                countMais20++;
            }

            // Atualiza os totais de compra, venda e lucro
            totalCompra += precoCompra;
            totalVenda += precoVenda;
            totalLucro += (precoVenda - precoCompra);
        }

        // Exibe os resultados
        System.out.println("\nResultados:");
        System.out.println("Mercadorias com lucro < 10%: " + countMenos10);
        System.out.println("Mercadorias com 10% <= lucro <= 20%: " + count10a20);
        System.out.println("Mercadorias com lucro > 20%: " + countMais20);
        System.out.printf("Valor total de compra: R$ %.2f%n", totalCompra);
        System.out.printf("Valor total de venda: R$ %.2f%n", totalVenda);
        System.out.printf("Lucro total: R$ %.2f%n", totalLucro);

        teclado.close(); // Fecha o scanner
    }
}