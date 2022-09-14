package controller;

import exception.CampoInvalidoException;
import exception.VacinaSemResponsavelException;
import model.entidade.Vacina;
import model.repository.VacinaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VacinaController {

    private VacinaRepository repositorio = new VacinaRepository();


    // ----------------------------------------------  Insert  ------------------------------------------------------//

    @PostMapping("/salvarVacina")
    public Vacina salvar(@RequestBody Vacina novaVacina) throws VacinaSemResponsavelException, CampoInvalidoException {
        if(novaVacina.getPaisOrigem() == null || novaVacina.getPaisOrigem().trim().isEmpty()){
            throw new CampoInvalidoException("Informe o pais de origem da vacina");
        }
        if(novaVacina.getEstagioPesquisa() < 1 || novaVacina.getEstagioPesquisa() > 5){
            throw new CampoInvalidoException("O estagio da vacina deve estar entre 1 e 4");
        }
        if(novaVacina.getResponsavel() == null){
            throw new VacinaSemResponsavelException("Informe o pesquisador responsavel");
        }

        novaVacina = repositorio.insert(novaVacina);

        return novaVacina;
    }

    // ----------------------------------------------  Update  ------------------------------------------------------//
    @PutMapping("/atualizarVacina")
    public boolean atualizar(Vacina vacina) throws CampoInvalidoException, VacinaSemResponsavelException {
        boolean atualizou = false;

        if(vacina.getPaisOrigem() == null || vacina.getPaisOrigem().trim().isEmpty()){
            throw new CampoInvalidoException("Informe o pais de origem da vacina");
        }
        if(vacina.getEstagioPesquisa() < 1 || vacina.getEstagioPesquisa() > 3){
            throw new CampoInvalidoException("O estagio da vacina deve estar entre 1 e 3");
        }
        if(vacina.getResponsavel() == null){
            throw new VacinaSemResponsavelException("Informe o pesquisador responsavel");
        }
        if(vacina.getId() <= 0){
            throw new CampoInvalidoException("Informe o ID da vacina antes de atualiza-la");
        }
        repositorio.atualizar(vacina);

        return atualizou;
    }


    // ----------------------------------------------  Retrieve  ------------------------------------------------------//

    @GetMapping("/vacinaPorId/{id}")
    public Vacina pesquisarPorId(@PathVariable int id) throws CampoInvalidoException {
        if(id != 0){
            return repositorio.pesquisarPorId(id);
        } else {
            throw new CampoInvalidoException("Nao e possivel pesquisar uma vacina sem informar um ID. Informe o ID da vacina");
        }
    }

    @GetMapping("/pesquisarTodas")
    public List<Vacina> pesquisarTodas(){
        return repositorio.pesquisarTodas();
    }


    // ----------------------------------------------  Delete  ------------------------------------------------------//
    @DeleteMapping("/deletarVacina/{id}")
    public boolean excluir(@PathVariable int id) throws CampoInvalidoException {
        if(id != 0){
            return repositorio.excluir(id);
        } else {
            throw new CampoInvalidoException("Nao e possivel excluir uma vacina sem informar um ID. Informe o ID da vacina");
        }

    }








}
