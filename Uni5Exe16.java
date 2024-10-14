/*
Dado um determinado grupo de pessoas, descreva
 um algoritmo que a partir da altura e do gênero
  (gênero = 'M' ou gênero = 'm' para masculino; gênero =
   'F' e gênero = 'f' para feminino ou gênero = 'O' ou gênero = 'o' para outro) de cada pessoa informe a média da altura das mulheres e a média de altura do grupo. A leitura deve ser finalizada ao digitar 0 para a altura.




 // entrada: 
 
 altura e genero (M, F, O)
 * 
 * 
 processo 

 media altura mulhere e media alturas grupo 
 * 
 soma m/ n° m 

 soma m,f, o/ n° grupo 

 * 
 SAINDA 

 Media da altura das mulheres e media das altura do grupo 
 0 na altura para finalizar 
 * 
 */

import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        int contM = 0;
        double contMaltura = 0;
        int contF = 0;
        double contFaltura = 0;
        int contO = 0;
        double contOaltura = 0;
        while (true) {
            cont++;
            System.out.println("Digite 0 para encerrar");
            System.out.print("Digite o gênero da " + cont + "° pessoa (M, F, O): ");
            char genero = teclado.next().charAt(0);
            System.out.print("Digite a altura da " + cont + "° pessoa: ");
            double altura = teclado.nextDouble();
            System.out.println("");
            if (altura == 0) {
                break; // Encerra o loop se o nome for "fim"
            }
            if (genero == 'M' || genero == 'm') {
                contM++;
                contMaltura += altura;
            } else if (genero == 'F' || genero == 'f') {
                contF++;
                contFaltura += altura;
            } else if (genero == 'o' || genero == 'O') {
                contO++;
                contOaltura += altura;
            } else {
                System.out.println("Digite o genero correto");
            }
           
        }
        double mediaF = contFaltura/contF;
        double mediaGrupo =   (contMaltura +  contFaltura +  contOaltura) / (contM + contF + contO++ );
        System.out.println( "Media da altura das Mulheres: " + mediaF);
        System.out.println("Media da altura do grupo: " + mediaGrupo);
        teclado.close();

    }
}
