package entidade;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    // --------------------------------------------  CONSTRUTOR ------------------------------------------------ //


    public PessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
        for(int i = 0; i < this.contas.size(); i++){
            this.setSaldoGeral(this.getSaldoGeral() + this.getContas().get(i).getSaldo());
        }
    }

    // ----------------------------------------------- METODOS ------------------------------------------------- //
    @Override
    public boolean isAdimplente() {
        if(this.getSaldoGeral() > -1000){
            return true;
        }
        return false;
    }

    // ------------------------------------------  GETTERS AND SETTERS ------------------------------------------ //

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
