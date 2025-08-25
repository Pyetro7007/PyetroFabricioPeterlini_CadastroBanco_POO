package PyetroFabricioPeterlini_CadastroBanco_POO.src.model;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    public String getNome(String nome) {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome.toUpperCase();
    }

    public String getEndereco(String endereco) {
        return this.endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getTelefone(String telefone) {
        return this.telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getCpf(String cpf) {
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}
