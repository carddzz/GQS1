// Importa a classe JOptionPane do pacote javax.swing, que permite a exibição de caixas de diálogo
import javax.swing.JOptionPane;

// Declaração da classe CalculoFatorial
public class CalculoFatorial {

    // Método principal que inicia a execução do programa
    public static void main(String[] args) {
        // Chama o método calcularFatorial
        calcularFatorial();
    }
  
    // Método que solicita um número ao usuário e calcula o fatorial desse número
    public static void calcularFatorial() {
        // Solicita ao usuário que insira o número e o converte para inteiro
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        
        // Verifica se o número é negativo
        if (numero < 0) {
            // Exibe uma mensagem de erro se o número for negativo e encerra o método
            JOptionPane.showMessageDialog(null, "Número inválido.");
            return;
        }
        
        // Inicializa a variável fatorial com 1
        int fatorial = 1;
        
        // Calcula o fatorial do número
        for (int i = 1; i <= numero; i++) {
            fatorial *= i; // Multiplica fatorial pelo valor de i em cada iteração
        }
        
        // Exibe o resultado para o usuário em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + fatorial);
    }
}