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

        int trechosAcimaValorNegado = 0; // Trechos com pedágio acima do valor que Astolfo se nega a pagar
        int totalTrechos = 0;            // Total de trechos informados
        int trechosDistanciaAceita = 0;  // Trechos acima de 150Km com pedágio que Astolfo concorda em pagar

        while (true) {
            // Lê o valor do pedágio
            System.out.print("Pedágio: R$ ");
            double valorPedagio = teclado.nextDouble();

            // Verifica se o valor do pedágio é negativo, encerra o programa se for
            if (valorPedagio < 0) {
                break;
            }

            // Lê a distância do trecho
            System.out.print("Distância (Km): ");
            double distanciaTrecho = teclado.nextDouble();

            // Atualiza o número total de trechos informados
            totalTrechos++;

            // Verifica se o valor do pedágio é maior do que Astolfo aceita pagar
            if (valorPedagio > valorMaximo) {
                trechosAcimaValorNegado++;
            }

            // Verifica se o trecho tem mais de 150Km e o pedágio é aceitável
            if (distanciaTrecho > 150 && valorPedagio <= valorMaximo) {
                trechosDistanciaAceita++;
            }
        }

        // Exibe os resultados
        System.out.println(trechosAcimaValorNegado + " trechos com valor acima do qual ele nega-se a pagar;");
        System.out.println(totalTrechos + " trechos foram informados;");
        System.out.println(trechosDistanciaAceita + " trechos acima de 150Km com valor aceito por ele.");

        teclado.close();

        
    }
}
