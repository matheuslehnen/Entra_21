package model.entidade;

public class Conta {

    private int id;
    private String agencia;
    private String numeroConta;
    private double saldo;


    // --------------------------------------------  CONSTRUTOR ------------------------------------------------ //


    public Conta() {

    }

    public Conta (String agencia, String numeroConta, double saldo) {
        super();
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }




    // ----------------------------------------------- METODOS ------------------------------------------------- //


    public double sacar(double saque) {
       this.setSaldo(this.getSaldo() - saque);
        return saque;
    }

    public void depositar(double deposito) {
        this.setSaldo(this.getSaldo() + deposito);
    }

    public void efetuarRendimento(double percentual) {
        this.setSaldo(this.getSaldo() + (this.getSaldo() * percentual / 100));
    }


    // ------------------------------------------  GETTERS AND SETTERS ------------------------------------------ //


    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
