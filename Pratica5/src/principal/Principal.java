package principal;

import javax.swing.JOptionPane; // Importa o JOptionPane para diálogos gráficos

public class Principal {
    public static void main(String args[]) {
        String entrada; // Variável para armazenar entrada do usuário
        int numeroConta, digitoVerificador; // Variáveis para número da conta e dígito verificador
        do {
            // Solicita o número da conta ao usuário
            entrada = JOptionPane.showInputDialog("Informe o número da conta (3 dígitos): ");
            // Converte a entrada para inteiro
            numeroConta = Integer.parseInt(entrada);

            // Calcula o dígito verificador conforme o método descrito
            digitoVerificador = calcularDigitoVerificador(numeroConta);

            // Exibe o dígito verificador
            JOptionPane.showMessageDialog(null, "O dígito verificador é: " + digitoVerificador);

            // Pergunta ao usuário se deseja continuar
            entrada = JOptionPane.showInputDialog("Deseja calcular outro dígito verificador? (S)im ou (N)ão");
        } while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim")); // Continua se resposta for "sim" ou "s"
    }

    private static int calcularDigitoVerificador(int numeroConta) {
        // Calcula o inverso do número da conta
        int inverso = (numeroConta % 10) * 100 + ((numeroConta / 10) % 10) * 10 + numeroConta / 100;
        // Soma o número da conta com seu inverso
        int soma = numeroConta + inverso;

        // Multiplica cada dígito pela sua posição e soma os resultados
        int total = (soma / 1000 % 10) * 0 + (soma / 100 % 10) * 1 + (soma / 10 % 10) * 2 + (soma % 10) * 3;
        
        // O dígito verificador é o último dígito do total calculado
        int digitoVerificador = total % 10;
        
        return digitoVerificador; // Retorna o dígito verificador
    }
}