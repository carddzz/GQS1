// Importa a classe JOptionPane do pacote javax.swing, que permite a exibição de caixas de diálogo
import javax.swing.JOptionPane;

// Declaração da classe SomaNumerosImpares
public class SomaNumerosImpares {
    
    // Método principal que inicia a execução do programa
    public static void main(String[] args) {
        // Chama o método somaNumerosImpares
        somaNumerosImpares();
    }

    // Método que solicita dois números inteiros positivos ao usuário e calcula a soma dos números ímpares entre eles
    public static void somaNumerosImpares() {
        // Solicita ao usuário que insira o primeiro número e o converte para inteiro
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        
        // Solicita ao usuário que insira o segundo número e o converte para inteiro
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        
        // Inicializa a variável soma com 0
        int soma = 0;
        
        // Calcula a soma dos números ímpares entre os dois limites
        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            // Verifica se o número é ímpar (resto da divisão por 2 é diferente de zero)
            if (i % 2 != 0) {
                // Adiciona o número ímpar à soma
                soma += i;
            }
        }
        
        // Exibe o resultado para o usuário em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "A soma dos números ímpares entre " + num1 + " e " + num2 + " é: " + soma);
    }
}