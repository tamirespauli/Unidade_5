/*
 Uma loja de departamentos oferece para seus clientes um determinado desconto de acordo com
  o valor da compra efetuada. O desconto é de 20% caso o valor da compra seja maior que
  R$ 500,00 e de 15% caso seja menor ou igual. Descreva um algoritmo que leia o valor da 
  compra e escreva o total a pagar a cada compra. Informe também o valor total recebido pela 
  loja ao final do dia. A leitura deve ser finalizada com a leitura 0 para o valor da compra

  entrada 

  valor da compra 

  processo 

  desconto de acordo com o valor da compra

  saida 

  valor com desconto 

  valo final do dia 


 */

import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double contTotalDia = 0;
        double desconto20 = 0.2;
        double desconto15 = 0.15;
        double valor = 500;
        while (true) {
            System.out.print("Valor da compra: ");
            double valorCompra = teclado.nextDouble();

            if (valorCompra == 0) {
                break; // Encerra
            }
            if (valorCompra > valor) {
                double valor20 = valorCompra - (valorCompra * desconto20);
                contTotalDia += valor20;
                System.out.println("Valor da compra com 20%OFF: R$" + valor20);
                System.out.println("");
            } else {
                double valor15 =  valorCompra - (valorCompra * desconto15) ;
                contTotalDia += valor15;
                System.out.println("Valor da compra com 15%OFF: R$" + valor15);
                System.out.println("");
            }

        }
        System.out.println("Valor final do dia: R$: " + contTotalDia);
        teclado.close();

    }

}
