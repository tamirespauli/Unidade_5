/*
Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metros 
e cresce 3 centímetros por ano. Construa um algoritmo que calcule e imprima quantos 
anos serão necessários para que Zé seja maior que Chico.
 */


public class Uni5Exe21 {
    public static void main(String[] args) {
        double alturaChico = 1.50;
        double alturaZe = 1.10;

        double crescimentoChico = 0.02;
        double crescimentoZe = 0.03;
        
        // Contador de anos
        int anos = 0;

        // Enquanto Zé não for maior que Chico, continuar o loop
        while (alturaZe <= alturaChico) {
            // Chico e Zé crescem a cada ano
            alturaChico += crescimentoChico;
            alturaZe += crescimentoZe;
            anos++; // Incrementa o número de anos
        }

        // Exibe o resultado final
        System.out.println("Serão necessários " + anos + " anos para que Zé seja maior que Chico.");
        System.out.printf("Altura final de Chico: %.2f metros%n", alturaChico);
        System.out.printf("Altura final de Zé: %.2f metros%n", alturaZe);
        
    }
    
}
