package principal;


import model.repository.PesquisadorRepository;
import model.repository.VacinaRepository;



public class Principal {

    public static void main(String[] args) {
//        VacinaController vacinaController = new VacinaController();
        VacinaRepository vacRepo = new VacinaRepository();
        PesquisadorRepository pesqRep = new PesquisadorRepository();

        System.out.println(vacRepo.pesquisarTodas());
        System.out.println(pesqRep.pesquisarTodos());

//        Pesquisador pesquisador1 = pesqRep.consultarPorId(1);
//        Pesquisador pesquisador2 = pesqRep.consultarPorId(2);
//
//        System.out.println(pesquisador1);
//        System.out.println(pesquisador2);
//
//        Vacina senacVac1 = new Vacina();
//        senacVac1.setDataInicioPesquisa(new Date());
//        senacVac1.setEstagioPesquisa(4);
//        senacVac1.setPaisOrigem("Brasil");
//        senacVac1.setResponsavel(pesquisador2);
//
//        vacRepo.insert(senacVac1);

//        System.out.println(repo.pesquisarTodas());







//        try {
//            vacinaController.salvar(senacVac);
//        } catch (VacinaSemResponsavelException | CampoInvalidoException e) {
//            System.out.println(e.getMessage());
//        }





    }
}