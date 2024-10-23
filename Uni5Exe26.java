/*
Astolfo resolveu fazer uma viagem para conhecer o nosso país Ele pretende visitar várias cidades, dividindo assim a viagem em vários trechos. Entretanto Astolfo se nega a passar por estradas cujo custo do pedágio exceda um determinado valor. Faça um programa que leia inicialmente o valor do pedágio ao qual Astolfo se nega a pagar. A seguir leia várias duplas de valores representando respectivamente o custo do pedágio e a distância (em Km) do trecho. Calcular e escrever:

quantos trechos da viagem possuem um valor de pedágio acima do qual Astolfo nega­se a pagar;
quantos trechos foram informados;
quantos trechos acima de 150Km de distância possuem um valor de pedágio que Astolfo concorda em pagar.
OBS: O programa será encerrado ao ser fornecido um valor de pedágio negativo. Neste caso a leitura da distância não deve ser executada. Os resultados devem ser impressos no final do programa.

Exemplo de entrada:

Valor máximo de pedágio: 7,00
 */

import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Valor máximo de pedágio: ");
        double valorMaximo = teclado.nextDouble();

        int trechosAcimaValorNegado = 0;
        int totalTrechos = 0;
        int trechosDistanciaAceita = 0;

        while (true) {
            System.out.print("Pedágio: R$ ");
            double valorPedagio = teclado.nextDouble();
            if (valorPedagio < 0) {
                break;
            }
            System.out.print("Distância (Km): ");
            double distanciaTrecho = teclado.nextDouble();
            totalTrechos++;
            if (valorPedagio > valorMaximo) {
                trechosAcimaValorNegado++;
            }
            if (distanciaTrecho > 150 && valorPedagio <= valorMaximo) {
                trechosDistanciaAceita++;
            }
        }
        System.out.println(trechosAcimaValorNegado + " trechos com valor acima do qual ele nega-se a pagar;");
        System.out.println(totalTrechos + " trechos foram informados;");
        System.out.println(trechosDistanciaAceita + " trechos acima de 150Km com valor aceito por ele.");

        teclado.close();

    }
}
