package cadastro;

public class PessoaFisica {
    private String nome; // Atributo privado para o nome da pessoa física
    private String cpf; // Atributo privado para o CPF da pessoa física

    // Método para definir o nome da pessoa física
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para obter o nome da pessoa física
    public String getNome() {
        return nome;
    }

    // Método para definir o CPF da pessoa física
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    // Método para obter o CPF da pessoa física
    public String getCPF() {
        return cpf;
    }
}