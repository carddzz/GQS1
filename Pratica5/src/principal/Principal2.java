package principal;
import javax.swing.JOptionPane; // Importa a classe JOptionPane para diálogos gráficos

public class Principal2 {
    public static void main(String[] args) {
        // Validação de cada entrada com mensagens de sucesso
        double nota = validarNota();
        JOptionPane.showMessageDialog(null, "Nota validada com sucesso: " + nota);

        double salario = validarSalario();
        JOptionPane.showMessageDialog(null, "Salário validado com sucesso: " + salario);

        char sexo = validarSexo();
        JOptionPane.showMessageDialog(null, "Sexo validado com sucesso: " + sexo);

        int idade = validarIdade();
        JOptionPane.showMessageDialog(null, "Idade validada com sucesso: " + idade);
    }

    private static double validarNota() {
        double nota = -1; // Inicializa a nota com um valor inválido
        do {
            String entrada = JOptionPane.showInputDialog("Informe uma nota entre 0 e 10:");
            try {
                nota = Double.parseDouble(entrada);
                if (nota < 0 || nota > 10) {
                    JOptionPane.showMessageDialog(null, "Erro: A nota deve estar entre 0 e 10. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: Entrada inválida. Por favor, digite um número.");
            }
        } while (nota < 0 || nota > 10); // Verifica se a nota está no intervalo correto
        return nota;
    }

    private static double validarSalario() {
        double salario = 0; // Inicializa o salário com um valor inválido
        do {
            String entrada = JOptionPane.showInputDialog("Informe um salário maior que zero:");
            try {
                salario = Double.parseDouble(entrada);
                if (salario <= 0) {
                    JOptionPane.showMessageDialog(null, "Erro: O salário deve ser maior que zero. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: Entrada inválida. Por favor, digite um número.");
            }
        } while (salario <= 0); // Verifica se o salário é maior que zero
        return salario;
    }

    private static char validarSexo() {
        char sexo = '\0'; // Inicializa o sexo com um valor vazio
        do {
            String entrada = JOptionPane.showInputDialog("Informe o sexo (m ou f):");
            if (entrada.length() == 1 && (entrada.equalsIgnoreCase("m") || entrada.equalsIgnoreCase("f"))) {
                sexo = entrada.charAt(0);
            } else {
                JOptionPane.showMessageDialog(null, "Erro: Sexo inválido. Digite 'm' ou 'f'.");
            }
        } while (sexo != 'm' && sexo != 'f'); // Verifica se o sexo é válido
        return sexo;
    }

    private static int validarIdade() {
        int idade = -1; // Inicializa a idade com um valor inválido
        do {
            String entrada = JOptionPane.showInputDialog("Informe uma idade entre 0 e 150:");
            try {
                idade = Integer.parseInt(entrada);
                if (idade < 0 || idade > 150) {
                    JOptionPane.showMessageDialog(null, "Erro: A idade deve estar entre 0 e 150. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: Entrada inválida. Por favor, digite um número inteiro.");
            }
        } while (idade < 0 || idade > 150); // Verifica se a idade está no intervalo correto
        return idade;
    }
}