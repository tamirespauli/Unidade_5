import java.util.Scanner; 

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma = 0;
        System.out.print("Quantidade de números que deseja inserir: ");
        int n = teclado.nextInt();

        System.out.print("1° número: ");
        int maiorNumero = teclado.nextInt();
        for (int i = 2; i <= n; i++) {
            System.out.print(i + "° número: ");
            int numero = teclado.nextInt();

            if (n < 0 && numero > maiorNumero) {
                maiorNumero = numero;
                
            } else if (numero > 0) {
                soma += numero + maiorNumero;
            }
           
        }
        double media = soma / n+1;
        System.out.println("Média dos números é: " + media);   
        System.out.println("O menor número é: " + maiorNumero);

        teclado.close();
    }
}
