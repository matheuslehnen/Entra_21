package controller;

import exception.CampoInvalidoException;
import model.entidade.Pesquisador;
import model.repository.PesquisadorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class PesquisadorController {

    private PesquisadorRepository repositorio = new PesquisadorRepository();


    // ----------------------------------------------  Insert  ------------------------------------------------------//

    @PostMapping("/salvarPesquisador")
    public Pesquisador salvar(Pesquisador novoPesquisador) throws CampoInvalidoException {
        if(novoPesquisador.getNome() == null || novoPesquisador.getNome().trim().isEmpty()){
            throw new CampoInvalidoException("Informe o nome do Pesquisador");
        }
        if(novoPesquisador.getCpf() == null || novoPesquisador.getCpf().trim().isEmpty()){
            throw new CampoInvalidoException("Informe o cpf do Pesquisador");
        }
        if(novoPesquisador.getMatricula() <= 0){
            throw new CampoInvalidoException("Informe a matricula do Pesquisador");
        }
        if(novoPesquisador.getDataNascimento() == null){
            throw new CampoInvalidoException("Informe a data de nascimento do Pesquisador");
        }

        novoPesquisador = repositorio.insert(novoPesquisador);
        return novoPesquisador;
    }

    // ----------------------------------------------  Update  ------------------------------------------------------//

    @PutMapping("/atualizarPesquisador")
    public boolean atualizar (Pesquisador pesquisador) throws CampoInvalidoException {
        boolean atualizou = false;

        if(pesquisador.getNome() == null || pesquisador.getNome().trim().isEmpty()){
            throw new CampoInvalidoException("Informe o nome do Pesquisador");
        }
        if(pesquisador.getCpf() == null || pesquisador.getCpf().trim().isEmpty()){
            throw new CampoInvalidoException("Informe o cpf do Pesquisador");
        }
        if(pesquisador.getMatricula() <= 0){
            throw new CampoInvalidoException("Informe a matricula do Pesquisador");
        }
        if(pesquisador.getDataNascimento() == null){
            throw new CampoInvalidoException("Informe a data de nascimento do Pesquisador");
        }

        repositorio.atualizar(pesquisador);

        return atualizou;
    }

    // ----------------------------------------------  Retrieve  ----------------------------------------------------//

    @GetMapping("/pesquisadorPorId/{id}")
    public Pesquisador pesquisarPorId(@PathVariable int id) throws CampoInvalidoException {
        if(id != 0){
            return repositorio.pesquisarPorId(id);
        } else {
            throw new CampoInvalidoException("Informe o ID da para localizar o pesquisador");
        }
    }
    @GetMapping("/pesquisarTodos")
    public ArrayList<Pesquisador> pesquisarTodos() {
        return repositorio.pesquisarTodos();
    }

    // ----------------------------------------------  Delete  ------------------------------------------------------//
    @DeleteMapping("/deletarPesquisador/{id}")
    public boolean excluir (@PathVariable int id) throws CampoInvalidoException {
        if(id != 0){
            return repositorio.excluir(id);
        } else {
            throw new CampoInvalidoException("Nao e possivel excluir uma vacina sem informar um ID. Informe o ID da vacina");
        }
    }
}
