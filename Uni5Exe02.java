/*
 Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos 
 números ímpares entre 1 e 100.
 */
import java.util.Scanner;

public class Uni5Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int somaPares = 0;
        int somaImpares = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0 ){
                somaPares += i; 
            } else {
                somaImpares +=i; 
            }
        }
        System.out.println("Soma dos números Pares de 1 até 100: " + somaPares);
        System.out.println("Soma dos número Ímpares de 1 até 100: " + somaImpares);

        teclado.close();
        
    }
}
