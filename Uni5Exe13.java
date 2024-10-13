/*
Um motorista acaba de voltar de um feriado prolongado. Antes de sair de viagem e imediatamente após retornar,
 o motorista encheu o tanque do veículo e registrou as medidas do odômetro. Em cada parada feita durante a viagem,
  foi registrado o valor do odômetro e a quantidade de combustível comprado para reabastecer o veículo (suponha que o 
  tanque foi enchido a cada parada). Descreva um algoritmo que leia o número total de reabastecimentos feitos e os dados 
  registrados relativos à compra de combustível. Calcule e escreva:

a quilometragem obtida por litro de combustível em cada parada;
a quilometragem média obtida por litro de combustível em toda a viagem
 */

import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Lê o número total de reabastecimentos
        System.out.println("Digite o número total de reabastecimentos feitos:");
        int numReabastecimentos = teclado.nextInt();

        double totalQuilometragem = 0; // Armazena a quilometragem total
        double totalCombustivel = 0; // Armazena a quantidade total de combustível
        double quilometragemAnterior = 0; // Armazena a quilometragem do último reabastecimento

        // Loop para ler dados de cada reabastecimento
        for (int i = 1; i <= numReabastecimentos; i++) {
            System.out.println("Reabastecimento " + i + ":");
            System.out.print("Digite a quilometragem (odômetro) na parada: ");
            double quilometragemAtual = teclado.nextDouble();
            System.out.print("Digite a quantidade de combustível comprado (em litros): ");
            double combustivelComprado = teclado.nextDouble();

            // Calcula a quilometragem obtida por litro nesta parada
            double quilometragemPorLitro = (quilometragemAtual - quilometragemAnterior) / combustivelComprado;

            // Exibe a quilometragem por litro para esta parada
            System.out.printf("Quilometragem obtida por litro na parada %d: %.2f km/l%n", i, quilometragemPorLitro);

            // Atualiza a quilometragem total e a quantidade total de combustível
            totalQuilometragem += (quilometragemAtual - quilometragemAnterior);
            totalCombustivel += combustivelComprado;

            // Atualiza a quilometragem anterior para a próxima iteração
            quilometragemAnterior = quilometragemAtual;
        }

        // Calcula a quilometragem média por litro de combustível em toda a viagem
        double quilometragemMedia = totalQuilometragem / totalCombustivel;
        System.out.printf("Quilometragem média obtida por litro durante toda a viagem: %.2f km/l%n",
                quilometragemMedia);

        teclado.close(); // Fecha o scanner
    }
}