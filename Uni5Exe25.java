/*
Em uma disputa de pingue-pongue os pontos são anotados como D,
 ponto para o jogador do lado direito, e E, ponto para o jogador do lado esquerdo da mesa. 
 Descreva um algoritmo que leia o código do ponto de cada jogada e determine o vencedor. A partida encerra quando:

um dos jogadores chegar a 21 pontos e a diferença de pontos entre os jogadores for maior ou igual a dois;
o jogador com mais de 21 pontos conseguir uma diferença de dois pontos sobre o adversário, caso a primeira condição não seja atendida.
 */



import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int pontosD = 0; 
        int pontosE = 0;

        while (true) {
            System.out.print("Digite o código do ponto (D para o jogador da direita, E para o jogador da esquerda): ");
            char codigoPonto = teclado.next().charAt(0);
            if (codigoPonto == 'D' || codigoPonto == 'd') {
                pontosD++;
            } else if (codigoPonto == 'E' || codigoPonto == 'e') {
                pontosE++;
            } else {
                System.out.println("Código inválido! Digite 'D' ou 'E'.");
                continue; // ignora o restante da iteração se o código for inválido
            }
            // Verifica as condições de vitória
            if ((pontosD >= 21 && (pontosD - pontosE) >= 2) || (pontosE >= 21 && (pontosE - pontosD) >= 2)) {
                break; // Encerra o loop se algum jogador vencer
            }
        }

        // Determina e exibe o vencedor
        if (pontosD > pontosE) {
            System.out.println("O jogador da direita venceu com " + pontosD + " pontos!");
        } else {
            System.out.println("O jogador da esquerda venceu com " + pontosE + " pontos!");
        }

        teclado.close();

    }
}
