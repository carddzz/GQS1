import java.util.Scanner; // 

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criei um Scanner
        int[][] matriz = new int[5][5]; // Criei uma matriz 5x5

        // Ler valores para a matriz
        System.out.println("Digite os valores da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt(); // Armazena cada entrada na matriz
            }
        }

        // Imprime elementos com índice de linha par e coluna ímpar
        System.out.println("Elementos em posições de linha par e coluna ímpar:");
        for (int i = 0; i < 5; i += 2) { // Incrementa i em 2 para linhas pares
            for (int j = 1; j < 5; j += 2) { // Incrementa j em 2 começando de 1 para colunas ímpares
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Criei e imprimi uma matriz transposta
        int[][] transposta = new int[5][5];
        System.out.println("Matriz Transposta:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                transposta[j][i] = matriz[i][j]; // Troca linhas por colunas
                System.out.print(transposta[j][i] + " ");
            }
            System.out.println();
        }

        // Troca os elementos da diagonal principal com a secundária
        System.out.println("Matriz após troca de diagonais:");
        for (int i = 0; i < 5; i++) {
            int temp = matriz[i][i];
            matriz[i][i] = matriz[i][4 - i]; // Troca com a diagonal secundária
            matriz[i][4 - i] = temp;
        }

        // Imprime a matriz após a troca das diagonais
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close(); // Fechei o scanner
    }
}