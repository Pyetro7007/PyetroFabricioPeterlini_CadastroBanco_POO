package model;

public abstract class Conta {
    protected String agencia;
    protected String numero;
    private double saldo;

    // Construtor de conta
    public Conta(String agencia, String numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0.0;
    }

    // Getter e Stter de agencia
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    // Getter e Setter de numero
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Getter e Setter de saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos abstratos para ser implementados pelas subclasses
    public abstract void gravar();
    public abstract void editar();
    public abstract void excluir();
    public abstract void cancelar();
}