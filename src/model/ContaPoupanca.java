package model;

public class ContaPoupanca extends Conta {
    // Construtor da classe ContaPoupanca
    public ContaPoupanca(String agencia, String numero) {
        super(agencia, numero); // Recebe esses valores e repassa para conta
    }

    @Override
    // Método abstrato gravar
    public void gravar() {
        System.out.println("Conta Poupança gravada: " + getNumero());
    }

    @Override
    // Método abstrato editar
    public void editar() {
        System.out.println("Conta Poupança editada");
    }

    @Override
    // Método abstrato excluir
    public void excluir() {
        System.out.println("Conta Poupança excluída");
    }

    @Override
    // Método abstrato cancelar
    public void cancelar() {
        System.out.println("Operação cancelada");
    }
}
