package model;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    // Construtor de classe
    public Pessoa(String nome, String endereco, String telefone, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    // Getter e Setter de nome
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome.toUpperCase(); // Converte o nome para letra maíscula antes de armazenar
    }

    // Getter e Setter de endereço
    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    // Getter e Setter de telefone
    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    // Getter e Setter de cpf
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    // Método para gravar
    public void gravar() {
        System.out.println("Pessoa gravada: " + nome);
    }

    // Método para editada
    public void editar() {
        System.out.println("Pessoa editada");
    }
    
    // Método para excluido
    public void excluir() {
        System.out.println("Pessoa excluída");
    }

    // Método para cancelar
    public void cancelar() {
        System.out.println("Operação cancelada");
    }
}
