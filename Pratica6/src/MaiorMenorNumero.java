// Importa a classe JOptionPane do pacote javax.swing, que permite a exibição de caixas de diálogo
import javax.swing.JOptionPane;

// Declaração da classe MaiorMenorNumero
public class MaiorMenorNumero {

    // Método principal que inicia a execução do programa
    public static void main(String[] args) {
        // Chama o método encontrarMaiorMenor
        encontrarMaiorMenor();
    }
    
    // Método que encontra o maior e o menor número digitado pelo usuário
    public static void encontrarMaiorMenor() {
        // Declara e inicializa as variáveis 'maior' e 'menor' com os valores máximo e mínimo de um inteiro, respectivamente
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        String input; // Variável para armazenar a entrada do usuário
        
        // Loop para ler os números e atualizar o maior e o menor
        do {
            // Solicita ao usuário que insira um número (ou 'fim' para encerrar) e armazena a entrada
            input = JOptionPane.showInputDialog("Digite um número (ou 'fim' para encerrar):");
            
            // Verifica se a entrada não é 'fim' para continuar o loop
            if (!input.equalsIgnoreCase("fim")) {
                // Converte a entrada para inteiro
                int numero = Integer.parseInt(input);
                
                // Atualiza o valor de 'maior' se o número atual for maior que 'maior'
                if (numero > maior) {
                    maior = numero;
                }
                
                // Atualiza o valor de 'menor' se o número atual for menor que 'menor'
                if (numero < menor) {
                    menor = numero;
                }
            }
        } while (!input.equalsIgnoreCase("fim")); // Continua o loop enquanto a entrada não for 'fim'
        
        // Exibe o maior e o menor número digitado pelo usuário em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "O maior número digitado é: " + maior + "\nO menor número digitado é: " + menor);
    }
}