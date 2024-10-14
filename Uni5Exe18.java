/* 
Foi feita uma pesquisa de audiência de canal de TV em n casas de um determinado bairro de uma cidade, 
em um certo dia do mês. Na pesquisa foi utilizado um coletor de dados portátil. Para cada casa visitada,
foi fornecido o número do canal (4, 5, 9, 12) e o número de pessoas que estavam assistindo a TV naquele
horário, considerando que em cada casa só existia uma televisão. Em casas onde a televisão estava desligada,
foi registrado zero para o número do canal e para o número de pessoas. Baseado nisto descreva um algoritmo 
que calcule e escreva, para cada emissora, o percentual de audiência. A leitura deve ser finalizada quando
for informado canal 0.

entrada 
canal 4, 5 ,9, 12 
numero de pessoas

processo 
separar a emissora e quant de audiencia de cada 

saida 

o percentual de audiência de cada emissoira

 */

 import java.util.Scanner;

 public class Uni5Exe18 {
     public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         
         int canal;
         int pessoas;
         int totalPessoas = 0;
         int pessoasCanal4 = 0, pessoasCanal5 = 0, pessoasCanal9 = 0, pessoasCanal12 = 0;
 
         // Loop para leitura dos dados de cada casa
         while (true) {
             System.out.print("Digite o número do canal (4, 5, 9, 12) ou 0 para encerrar: ");
             canal = teclado.nextInt();
             
             if (canal == 0) {
                 break; // Encerra a leitura quando o canal for 0
             }
             
             System.out.print("Digite o número de pessoas assistindo esse canal: ");
             pessoas = teclado.nextInt();
             
             // Somando o número de pessoas ao canal correspondente
             if (canal == 4) {
                 pessoasCanal4 += pessoas;
             } else if (canal == 5) {
                 pessoasCanal5 += pessoas;
             } else if (canal == 9) {
                 pessoasCanal9 += pessoas;
             } else if (canal == 12) {
                 pessoasCanal12 += pessoas;
             } else {
                 System.out.println("Canal inválido. Tente novamente.");
                 continue; // Volta para a próxima iteração do loop
             }
             
             // Soma o número de pessoas assistindo TV ao total geral
             totalPessoas += pessoas;
         }
 
         // Verifica se houve audiência
         if (totalPessoas == 0) {
             System.out.println("Nenhuma pessoa assistindo TV.");
         } else {
             // Cálculo dos percentuais de audiência
             double percentualCanal4 =  pessoasCanal4 / totalPessoas * 100;
             double percentualCanal5 =  pessoasCanal5 / totalPessoas * 100;
             double percentualCanal9 =  pessoasCanal9 / totalPessoas * 100;
             double percentualCanal12 = pessoasCanal12 / totalPessoas * 100;
 
             // Exibindo os percentuais de audiência de cada canal
             System.out.println("Percentual de audiência do canal 4: " + percentualCanal4 + "%");
             System.out.println("Percentual de audiência do canal 5: " + percentualCanal5 + "%");
             System.out.println("Percentual de audiência do canal 9: " + percentualCanal9 + "%");
             System.out.println("Percentual de audiência do canal 12: " + percentualCanal12 + "%");
         }
 
         teclado.close();
     }
 }