package cadastro;

public class PessoaJuridica {
    private String nome; // Atributo privado para o nome da pessoa jurídica
    private String cnpj; // Atributo privado para o CNPJ da pessoa jurídica

    // Método para definir o nome da pessoa jurídica
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para obter o nome da pessoa jurídica
    public String getNome() {
        return nome;
    }

    // Método para definir o CNPJ da pessoa jurídica
    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    // Método para obter o CNPJ da pessoa jurídica
    public String getCNPJ() {
        return cnpj;
    }
}