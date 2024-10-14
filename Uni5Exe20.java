/*
Um determinado material radioativo perde metade de sua massa a cada 50 segundos. 
Dada a sua massa inicial em Kg, descreva um algoritmo que determine o tempo necessário
 para que essa massa se torne menor que 0,5 gramas. Escreva a massa inicial, a massa
final e o tempo.


 */

import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
          // Solicita a massa inicial em Kg
          System.out.print("Informe a massa inicial (em Kg): ");
          double massaInicial = teclado.nextDouble();
          
          // Variáveis para calcular a massa e o tempo
          double massaAtual = massaInicial;
          double tempo = 0;
         double massaLimite = 0.0005; // 0.5 gramas em Kg
  
          // Loop para calcular o tempo até a massa ficar menor que 0.5 gramas
          while (massaAtual >= massaLimite) {
              massaAtual /= 2; // A massa reduz para metade
              tempo += 50; // A cada iteração, 50 segundos
          }
          
          // A massa final é a última massa atual que foi calculada
          // Exibe os resultados
          System.out.printf("Massa inicial: %.4f Kg%n", massaInicial);
          // Ajuste na impressão da massa final
          System.out.printf("Massa final: %.4f Kg%n", massaAtual);
          System.out.printf("Tempo necessário: %.0f segundos%n", tempo);
          
        teclado.close();

    }
}
