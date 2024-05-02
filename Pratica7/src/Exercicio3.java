import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        //Criar um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //Declarar um array para armazenar os 10 números reais
        double[] numeros = new double[10];
        
        //Inicializar as variáveis para armazenar o menor e o maior número
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        //Solicitar ao usuário que insira 10 números reais
        System.out.println("Digite 10 números reais:");

        //Ler os números reais fornecidos pelo usuário e encontrar o menor e o maior número
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número real " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            
     // Atualizar o menor número, se necessário
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            
     // Atualizar o maior número, se necessário
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

    //Exibir o vetor de números reais, o menor e o maior número
        System.out.println("Vetor de números reais:");
        for (double num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println("\nMenor número: " + menor);
        System.out.println("Maior número: " + maior);

     //Fechar o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}