/*
 O número 3025 possui a seguinte característica:

\normalsize&space;30+25=55\rightarrow55^2=3025

Escreva um programa que pesquise e imprima os 10 primeiros números naturais que apresentam tal propriedade. Outros exemplos:

\normalsize&space;20+25=45\rightarrow45^2=2025
 */

public class Uni5Exe10 {
    public static void main(String[] args) {
        int contador = 0; // Contador para controlar os 10 primeiros números encontrados

        // Usamos um for para iterar a partir de 1000, um número suficientemente grande
        for (int numero = 1000; contador < 10; numero++) {
            int parte1 = numero / 100; // Primeira parte (dezenas)
            int parte2 = numero % 100; // Segunda parte (unidades)

            // Verifica se a soma das partes ao quadrado resulta no número original
            if (Math.pow(parte1 + parte2, 2) == numero) {
                System.out.println(numero + " possui a propriedade.");
                contador++; // Incrementa o contador a cada número encontrado
            }
        }
    }
}