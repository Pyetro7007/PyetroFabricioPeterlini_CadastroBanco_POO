package model;

public class Cliente extends Pessoa{
    private Conta conta;

    // Construtor da classe Cliente
    public Cliente(String nome, String endereco, String telefone, String cpf, Conta conta) {
        super(nome, endereco, telefone, cpf);
        this.conta = conta;
    }

    // Getter e Setter de conta
    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    // Sobrescreve o método gravar de Pessoa
    @Override
    public void gravar() {
         if (getCpf() == null || getCpf().isEmpty()) {
            System.out.println("Erro: CPF obrigatório");
        } else {
            System.out.println("Cliente gravado: " + getNome());
            conta.gravar();
        }
    }

    @Override
    // Sobrescreve o método editar de Pessoa 
    public void editar() {
        System.out.println("Cliente editado");
    }

    // Sobrescreve o método excluir de Pessoa 
    public void excluir() {
        System.out.println("Cliente excluído");
    }

    // Sobrescreve o método cancelar de Pessoa 
    public void cancelar() {
        System.out.println("Cadastro cancelado");
        conta.cancelar();
    }
}
