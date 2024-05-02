import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        //Criar um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //Declarar um array para armazenar os 10 números reais
        double[] reais = new double[10];

        //Solicitar ao usuário que insira 10 números reais
        System.out.println("Digite 10 números reais:");

        //Ler os números reais fornecidos pelo usuário e armazená-los no vetor
        for (int i = 0; i < reais.length; i++) {
            System.out.print("Digite o número real " + (i + 1) + ": ");
            reais[i] = scanner.nextDouble();
        }

        //Exibir o vetor de números reais e as posições dos números negativos
        System.out.println("Vetor de números reais:");
        for (int i = 0; i < reais.length; i++) {
            System.out.print(reais[i] + " ");
            // Verificar se o número é negativo e exibir sua posição
            if (reais[i] < 0) {
                System.out.println("(Posição " + i + ")");
            }
        }

        //Fechar o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}