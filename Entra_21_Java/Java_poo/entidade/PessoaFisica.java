package entidade;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private String sexo;
    private String nascimento;



    // --------------------------------------------  CONSTRUTOR ------------------------------------------------ //


    public PessoaFisica(String cpf, String sexo) {
        super();
        this.cpf = cpf;
        this.sexo = sexo;
        for(int i = 0; i < this.contas.size(); i++){
            this.setSaldoGeral(this.getSaldoGeral() + this.getContas().get(i).getSaldo());
        }
    }

    // ----------------------------------------------- METODOS ------------------------------------------------- //
    @Override
    public boolean isAdimplente() {
        if(this.getSaldoGeral() > -500){
            this.setAdimplente(true);
        }
        return false;
    }

    // ------------------------------------------  GETTERS AND SETTERS ------------------------------------------ //

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
}
