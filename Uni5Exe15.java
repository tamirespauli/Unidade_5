import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        String nome = "";

        while (!nome.equals("fim")) {
            cont++;
            System.out.println("Digite fim para encerrar");
            System.out.println("Nome do " + cont + "° aluno: ");
            nome = teclado.next(); // Lê o nome do aluno

            if (nome.equals("fim")) {
                break; // Encerra o loop se o nome for "fim"
            }

            // Se o nome não for "fim", continua com o restante do código
            System.out.println("1° nota: ");
            double nota1 = teclado.nextDouble();
            System.out.println("2° nota: ");
            double nota2 = teclado.nextDouble();
            double media = (nota1 + nota2) / 2;
            System.out.println("Média: " + media);
        }

        teclado.close();
    }
}