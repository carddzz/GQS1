package gerenciamentoveiculos;

import java.util.ArrayList; // Importa a classe ArrayList para uso
import java.util.Scanner; // Importa a classe Scanner para entrada de dados

// Definição da classe CadastroVeiculos
public class CadastroVeiculos {
    private static ArrayList<Veiculo> veiculos = new ArrayList<>(); // Lista para armazenar os objetos Veiculo
    private static Scanner scanner = new Scanner(System.in); // Objeto Scanner para ler a entrada do usuário

    // Método para adicionar um veículo ao cadastro
    public static void adicionarVeiculo() {
        System.out.print("Digite o número do chassi: "); // Solicita o número do chassi ao usuário
        String chassi = scanner.nextLine(); // Lê o número do chassi
        System.out.print("Digite a placa: "); // Solicita a placa ao usuário
        String placa = scanner.nextLine(); // Lê a placa
        System.out.print("Digite a marca: "); // Solicita a marca ao usuário
        String marca = scanner.nextLine(); // Lê a marca
        System.out.print("Digite o modelo: "); // Solicita o modelo ao usuário
        String modelo = scanner.nextLine(); // Lê o modelo
        System.out.print("Digite o ano: "); // Solicita o ano ao usuário
        int ano = Integer.parseInt(scanner.nextLine()); // Lê e converte o ano para inteiro

        veiculos.add(new Veiculo(chassi, placa, marca, modelo, ano)); // Cria um novo objeto Veiculo e adiciona à lista
        System.out.println("Veículo cadastrado com sucesso!\n"); // Imprime confirmação de cadastro
    }

    // Método para exibir todos os veículos cadastrados
    public static void exibirVeiculos() {
        if (veiculos.isEmpty()) { // Verifica se a lista está vazia
            System.out.println("Nenhum veículo cadastrado."); // Mensagem caso não haja veículos
        } else {
            System.out.println("Lista de Veículos Cadastrados:"); // Cabeçalho da lista de veículos
            for (Veiculo v : veiculos) { // Loop para exibir cada veículo
                System.out.println(v); // Chama o método toString de Veiculo para exibir suas informações
            }
        }
        System.out.println(); // Linha em branco para separação
    }

    // Método para pesquisar um veículo por chassi ou placa
    public static void pesquisarVeiculo() {
        System.out.print("Digite o chassi ou a placa para pesquisa: "); // Pede ao usuário o chassi ou a placa para pesquisa
        String entrada = scanner.nextLine(); // Lê a entrada do usuário
        for (Veiculo v : veiculos) { // Loop para verificar cada veículo na lista
            if (v.getNumeroChassi().equals(entrada) || v.getPlaca().equals(entrada)) { // Compara chassi e placa com a entrada
                System.out.println("Veículo encontrado: " + v); // Exibe o veículo encontrado
                return; // Sai do método se encontrar o veículo
            }
        }
        System.out.println("Veículo não encontrado."); // Mensagem se não encontrar o veículo
    }

    // Método main que executa o programa
    public static void main(String[] args) {
        boolean sair = false; // Variável de controle para saída do loop
        while (!sair) { // Loop do menu
            System.out.println("1. Cadastrar Veículo");
            System.out.println("2. Exibir Veículos");
            System.out.println("3. Pesquisar Veículo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: "); // Exibe opções do menu
            int opcao = Integer.parseInt(scanner.nextLine()); // Lê a opção escolhida

            switch (opcao) { // Estrutura de decisão baseada na opção escolhida
                case 1:
                    adicionarVeiculo(); // Chama o método para adicionar veículo
                    break;
                case 2:
                    exibirVeiculos(); // Chama o método para exibir veículos
                    break;
                case 3:
                    pesquisarVeiculo(); // Chama o método para pesquisar veículo
                    break;
                case 4:
                    System.out.println("Saindo do sistema..."); // Mensagem de saída
                    sair = true; // Altera a variável para sair do loop
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente."); // Mensagem para opção inválida
                    break;
            }
        }
    }
}