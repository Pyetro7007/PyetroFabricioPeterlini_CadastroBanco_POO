package model;

public class ContaCorrente extends Conta {
    // Construtor da classe ContaCorrente
    public ContaCorrente(String agencia, String numero) {
        super(agencia, numero); // Recebe esses valores e repassa para conta
    }

    @Override
    // Método abstrato gravar
    public void gravar() {
        System.out.println("Conta Corrente gravada: " + getNumero());
    }

    @Override
    // Método abstrato editar
    public void editar() {
        System.out.println("Conta Corrente editada");
    }

    @Override
    // Método abstrato excluir
    public void excluir() {
        System.out.println("Conta Corrente excluída");
    }

    @Override
    // Método abstrato cancelar
    public void cancelar() {
        System.out.println("Operação cancelada");
    }
}
