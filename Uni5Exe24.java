/*
Os regulamentos de uma competição de pesca impõem um limite no peso total de pesca de um dia.
 Descreva um algoritmo que leia o limite diário (em quilogramas) e então leia o peso (em gramas)
  de cada peixe e escreva o peso total da pesca obtido até aquele ponto. Quando o limite diário 
  for excedido escreva uma mensagem e encerre a execução do algoritmo. Para prosseguir com a entrada 
  de dados de pesos de cada peixe o algoritmo deve apresentar a seguinte mensagem: “deseja informar o
   peso de mais um peixe: s (SIM) / n (NÃO)?”.
 */




import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Lê o limite diário em quilogramas
        System.out.print("Digite o limite diário de pesca (em kg): ");
        double limiteDiarioKg = teclado.nextDouble();
        double limiteDiarioGramas = limiteDiarioKg * 1000; // Converte o limite para gramas

        double pesoTotal = 0.0; // Inicializa o peso total

        boolean continuar = true;
        while (continuar) {
            // Lê o peso do peixe em gramas
            System.out.print("Digite o peso do peixe (em gramas): ");
            double pesoPeixe = teclado.nextDouble();

            // Atualiza o peso total
            pesoTotal += pesoPeixe;

            // Exibe o peso total da pesca até o momento
            System.out.printf("Peso total da pesca até agora: %.2f g%n", pesoTotal);

            // Verifica se o limite diário foi excedido
            if (pesoTotal > limiteDiarioGramas) {
                System.out.println("Limite diário de pesca excedido! Encerrando a execução.");
                break; // Encerra o loop se o limite for excedido
            }

            // Pergunta se deseja informar o peso de mais um peixe
            System.out.print("Deseja informar o peso de mais um peixe? (s/N): ");
            char resposta = teclado.next().charAt(0);
            teclado.nextLine(); // Limpa o buffer do scanner

            if (resposta == 'n' || resposta == 'N') {
                continuar = false; // Encerra o loop se o usuário não quiser continuar
            }
        }

    }
}
