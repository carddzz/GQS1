import javax.swing.JOptionPane;

public class MediaIdades {

    public static void main(String[] args) {
        calcularMediaIdades();
    }

    public static void calcularMediaIdades() {
        // Passo 1: Declarar variáveis para armazenar a soma e o contador de idades
        int soma = 0;
        int contador = 0;
        String input;

        // Passo 2: Ler as idades e calcular a soma
        do {
            // Solicitar ao usuário que insira uma idade
            input = JOptionPane.showInputDialog("Digite uma idade (ou 'fim' para encerrar):");
            // Verificar se a entrada é diferente de 'fim'
            if (!input.equalsIgnoreCase("fim")) {
                // Converter a entrada para inteiro
                int idade = Integer.parseInt(input);
                // Adicionar a idade à soma
                soma += idade;
                // Incrementar o contador de idades
                contador++;
            }
        } while (!input.equalsIgnoreCase("fim"));

        //Verificar se foram inseridas idades antes de calcular a média
        if (contador > 0) {
            // Calcular a média aritmética das idades
            double media = (double) soma / contador;
            // Exibir o resultado para o usuário
            JOptionPane.showMessageDialog(null, "A média das idades é: " + media);
        } else {
            // Se nenhum idade foi inserida, exibir uma mensagem de erro
            JOptionPane.showMessageDialog(null, "Nenhuma idade inserida.");
        }
    }
}