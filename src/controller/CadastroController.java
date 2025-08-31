package controller;

import model.*;

public class CadastroController {
    private Cliente clienteAtual; // Armazena o cliente que está sendo manipulado

    // Método para gravar um cliente
    public void gravarCliente(String nome, String endereco, String telefone, String cpf, String agencia, String numero, boolean corrente) {
        Conta conta;

        // Verifica se a conta é corrente ou poupanca
        if (corrente) {
            conta = new ContaCorrente(agencia, numero);
        } else {
            conta = new ContaPoupanca(agencia, numero);
        }

        // Cria um novo cliente com os novos dados
        clienteAtual = new Cliente(nome, endereco, telefone, cpf, conta);
        clienteAtual.gravar(); // Chama o método de gravar do cliente para salvar os dados
    }

    // Método para editar os dados do cliente
    public void editarCliente() {
        if (clienteAtual != null) {
            clienteAtual.editar();
        }
    }
    // Método para excluir os dados do cliente
       public void excluirCliente() {
        if (clienteAtual != null) {
            clienteAtual.excluir();
        }
    }

    // Método para cancelar os dados do cliente
    public void cancelarCliente() {
        if (clienteAtual != null) {
            clienteAtual.cancelar();
        }
    }

     // É uma simulação, talvez futiuramente implementar uma versão realmente funcional, por enquanto fica assim msm
    public String[] consultarCliente(String agencia, String conta) {
        if (agencia.equals("123") && conta.equals("456")) {
            return new String[] {
                "Pyetro Fabrício",
                "Rua Campos, 100",
                "19999999999",
                "12345678900",
                "corrente"
            };
       }
       return null;
    }

    // É uma simulação, talvez futiuramente implementar uma versão realmente funcional, por enquanto fica assim msm
    public boolean atualizarCliente(String agencia, String conta, String nome, String endereco, String telefone, String cpf, String tipoConta) {
        if (cpf == null || cpf.isEmpty()) {
            return false;
        }

        System.out.println("Atualizando cliente: ");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("CPF: " + cpf);
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.println("Tipo: " + tipoConta);

        return true;
    }
}
