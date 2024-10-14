/*
 Descreva um algoritmo que leia o número de inscrição e a altura de um atleta em uma competição e informe:

o número de inscrição e a altura do atleta mais alto;
o número de inscrição e a altura do atleta mais baixo;
a altura média do grupo de atletas.
A leitura deve ser finalizada ao digitar 0 para o número de inscrição.


entrada 

 número de inscrição 
 número de inscrição 

 processo

 separar altura e incrição do atleta mais baixo 
 separar altura e incrição do atleta mais alto
  altura média do grupo de atletas.

 saida 
 
número de inscrição e a altura do atleta mais alto;
o número de inscrição e a altura do atleta mais baixo;
a altura média do grupo de atletas.
A leitura deve ser finalizada ao digitar 0 para o número de inscrição.
 
 

 * 
 */
import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numInscricao, numInscricaoMaisAlto = 0, numInscricaoMaisBaixo = 0;
        double altura, alturaMaisAlto = 0, alturaMaisBaixo = Double.MAX_VALUE;
        double somaAlturas = 0;
        int totalAtletas = 0;
        int cont = 0;; 
        
        while (true) {
            cont++;
            System.out.print("Digite o número de inscrição do " + cont + "° atleta (0 para encerrar): ");
            numInscricao = teclado.nextInt();
            
            if (numInscricao == 0) {
                break;  // Encerra o loop quando o número de inscrição for 0
            }
            
            System.out.print("Digite a altura do " + cont + "° atleta: ");
            altura = teclado.nextDouble();
            System.out.println("");
            
            // Verifica o atleta mais alto
            if (altura > alturaMaisAlto) {
                alturaMaisAlto = altura;
                numInscricaoMaisAlto = numInscricao;
            }
            
            // Verifica o atleta mais baixo
            if (altura < alturaMaisBaixo) {
                alturaMaisBaixo = altura;
                numInscricaoMaisBaixo = numInscricao;
            }
            
            // Soma as alturas e conta o número de atletas
            somaAlturas += altura;
            totalAtletas++;
        }
        
        // Calcula a média de altura do grupo
        double alturaMedia = somaAlturas / totalAtletas;
        
        // Exibe os resultados
        System.out.println("Atleta mais alto: Inscrição " + numInscricaoMaisAlto + " com altura de " + alturaMaisAlto + " metros");
        System.out.println("Atleta mais baixo: Inscrição " + numInscricaoMaisBaixo + " com altura de " + alturaMaisBaixo + " metros");
        System.out.println("Altura média dos atletas: " + alturaMedia + " metros");
        
        teclado.close();
    }
}