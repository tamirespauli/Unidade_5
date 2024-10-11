/*
Descreva um algoritmo que calcula e escreva a soma da seguinte série de 100 termos:

\tamanho normal&espaço;\frac{1}{1}+\frac{1}{2}+\frac{1}{3}+\frac{1}{4}+\cdots+\frac{1}{100
 */

 public class Uni5Exe03 {
    public static void main(String[] args) {
      double soma = 0;
      for (int i = 1; i <= 100; i++) {
        soma = soma + (1.0 / i);
      }
      System.out.println("Soma: " + soma);
    }
  }