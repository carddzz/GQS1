package cadastro;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    private static ArrayList<PessoaFisica> pessoasFisicas = new ArrayList<>(); // Vetor para armazenar pessoas físicas
    private static ArrayList<PessoaJuridica> pessoasJuridicas = new ArrayList<>(); // Vetor para armazenar pessoas jurídicas
    private static Scanner scanner = new Scanner(System.in); // Scanner para entrada de dados

    public static void adicionarPessoaFisica() {
        System.out.print("Digite o nome da pessoa física: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        PessoaFisica pf = new PessoaFisica(); // Cria um novo objeto PessoaFisica
        pf.setNome(nome); // Define o nome da pessoa física
        pf.setCPF(cpf); // Define o CPF da pessoa física
        pessoasFisicas.add(pf); // Adiciona o objeto ao vetor de pessoas físicas
    }

    public static void adicionarPessoaJuridica() {
        System.out.print("Digite o nome da pessoa jurídica: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CNPJ: ");
        String cnpj = scanner.nextLine();

        PessoaJuridica pj = new PessoaJuridica(); // Cria um novo objeto PessoaJuridica
        pj.setNome(nome); // Define o nome da pessoa jurídica
        pj.setCNPJ(cnpj); // Define o CNPJ da pessoa jurídica
        pessoasJuridicas.add(pj); // Adiciona o objeto ao vetor de pessoas jurídicas
    }

    public static void imprimirTodos() {
        System.out.println("Pessoas Físicas:");
        for (PessoaFisica pf : pessoasFisicas) {
            System.out.println("Nome: " + pf.getNome() + ", CPF: " + pf.getCPF());
        }
        System.out.println("Pessoas Jurídicas:");
        for (PessoaJuridica pj : pessoasJuridicas) {
            System.out.println("Nome: " + pj.getNome() + ", CNPJ: " + pj.getCNPJ());
        }
    }

    public static void imprimirPessoasFisicas() {
        System.out.println("Pessoas Físicas:");
        for (PessoaFisica pf : pessoasFisicas) {
            System.out.println("Nome: " + pf.getNome() + ", CPF: " + pf.getCPF());
        }
    }

    public static void imprimirPessoasJuridicas() {
        System.out.println("Pessoas Jurídicas:");
        for (PessoaJuridica pj : pessoasJuridicas) {
            System.out.println("Nome: " + pj.getNome() + ", CNPJ: " + pj.getCNPJ());
        }
    }

    public static void pesquisarPorDocumento() {
        System.out.print("Digite o CPF ou CNPJ para pesquisa: ");
        String documento = scanner.nextLine();
        boolean encontrado = false;

        for (PessoaFisica pf : pessoasFisicas) {
            if (pf.getCPF().equals(documento)) {
                System.out.println("Pessoa Física encontrada: Nome: " + pf.getNome() + ", CPF: " + pf.getCPF());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            for (PessoaJuridica pj : pessoasJuridicas) {
                if (pj.getCNPJ().equals(documento)) {
                    System.out.println("Pessoa Jurídica encontrada: Nome: " + pj.getNome() + ", CNPJ: " + pj.getCNPJ());
                    encontrado = true;
                    break;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Documento não encontrado.");
        }
    }

    public static void main(String[] args) {
        boolean sair = false;
        while (!sair) {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar Pessoa Física");
            System.out.println("2 - Adicionar Pessoa Jurídica");
            System.out.println("3 - Listar Todos");
            System.out.println("4 - Listar Pessoas Físicas");
            System.out.println("5 - Listar Pessoas Jurídicas");
            System.out.println("6 - Pesquisar por CPF/CNPJ");
            System.out.println("7 - Atualizar por CPF/CNPJ");
            System.out.println("8 - Excluir por CPF/CNPJ");
            System.out.println("9 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    adicionarPessoaFisica();
                    break;
                case 2:
                    adicionarPessoaJuridica();
                    break;
                case 3:
                    imprimirTodos();
                    break;
                case 4:
                    imprimirPessoasFisicas();
                    break;
                case 5:
                    imprimirPessoasJuridicas();
                    break;
                case 6:
                    pesquisarPorDocumento();
                    break;
                case 7:
                    // Chamar o método para atualizar por CPF/CNPJ
                    break;
                case 8:
                    // Chamar o método para excluir por CPF/CNPJ
                    break;
                case 9:
                    System.out.println("Saindo do sistema.");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
        scanner.close();
    } 
}