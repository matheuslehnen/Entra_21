package entidade;

import java.util.ArrayList;

public abstract class Pessoa {
    private String nome;
    private boolean adimplente;
    private double saldoGeral;
    protected ArrayList<Conta> contas;





    // ----------------------------------------------- METODOS ------------------------------------------------- //


    public abstract boolean isAdimplente();



    // ------------------------------------------  GETTERS AND SETTERS ------------------------------------------ //


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAdimplente(boolean adimplente) {
        this.adimplente = adimplente;
    }

    public double getSaldoGeral() {
        return saldoGeral;
    }

    public void setSaldoGeral(double saldoGeral) {
        this.saldoGeral = saldoGeral;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }
}

