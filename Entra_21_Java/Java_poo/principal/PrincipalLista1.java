package principal;

import entidade.Conta;
import entidade.Pessoa;
import entidade.PessoaFisica;
import entidade.PessoaJuridica;

import java.util.ArrayList;

public class PrincipalLista1 {

    public static void main(String[] args) {

        ArrayList<Conta> contas = new ArrayList<>();

        Conta conta1 = new Conta("1", "1", 1000);
        Conta conta2 = new Conta("1", "2", 1000);
        Conta conta3 = new Conta("1", "3", 1000);

        Conta conta4 = new Conta("2", "4", 1000);
        Conta conta5 = new Conta("2", "5", 1000);
        Conta conta6 = new Conta("2", "6", 1000);

        PessoaFisica PF1 = new PessoaFisica("111111","M");
        PessoaFisica PF2 = new PessoaFisica("22222","M");
        PessoaJuridica PJ1 = new PessoaJuridica("PJ");
        PessoaJuridica PJ2 = new PessoaJuridica("PJPJ");


        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        PF1.setContas(contas);


        contas.add(conta4);
        contas.add(conta5);
        contas.add(conta6);
        PJ1.setContas(contas);

        System.out.println(PF1.getSaldoGeral());
        System.out.println(PJ1.getSaldoGeral());
        // COLOCAR 2 instancias Conta PJ e Conta PF
        // O ERRO É QUE ESTÁ NO CONSTRUTOR
    }
}
