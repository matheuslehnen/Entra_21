package model.repository;

import model.Banco;
import model.entidade.Pesquisador;
import model.entidade.Vacina;

import java.sql.*;
import java.util.ArrayList;

public class VacinaRepository {


    // ----------------------------------------------  Insert  ------------------------------------------------------//

    public Vacina insert(Vacina novaVacina) {
        Connection conexao = Banco.getConnection();
        String sql = " INSERT INTO vacina (pais_origem, estagio_pesquisa, data_inicio_pesquisa, id_responsavel) values (?,?,?,?)";
        PreparedStatement stmt = Banco.getPreparedStatementWithPk(conexao, sql);

        try {
            stmt.setString(1, novaVacina.getPaisOrigem());
            stmt.setInt(2, novaVacina.getEstagioPesquisa());
            stmt.setDate(3, new java.sql.Date(novaVacina.getDataInicioPesquisa().getTime()));
            stmt.setInt(4, novaVacina.getResponsavel().getId());
            stmt.execute();

            ResultSet chavesGeradas = stmt.getGeneratedKeys();
            if (chavesGeradas.next()) {
                novaVacina.setId(chavesGeradas.getInt(1));
            }
            System.out.println("Vacina inserida com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir vacina.\nCausa: " + e.getMessage());
        } finally {
            Banco.closePreparedStatement(stmt);
            Banco.closeConnection(conexao);
        }
        return novaVacina;
    }


    // ----------------------------------------------  Update  ------------------------------------------------------//

    public boolean atualizar(Vacina vacina) {
        boolean atualizou = false;

        Connection conexao = Banco.getConnection();
        String sql = " UPDATE vacina set pais_origem = ?, estagio_pesquisa = ?, data_inicio_pesquisa = ?, id_responsavel = ? WHERE id = ?";
        PreparedStatement stmt = Banco.getPreparedStatementWithPk(conexao, sql);

        try {
            stmt.setString(1, vacina.getPaisOrigem());
            stmt.setInt(2, vacina.getEstagioPesquisa());
            stmt.setDate(3, new java.sql.Date(vacina.getDataInicioPesquisa().getTime()));
            stmt.setInt(4, vacina.getResponsavel().getId());
            stmt.setInt(5, vacina.getId());
            stmt.executeUpdate();

            int linhasAfetadas = stmt.executeUpdate();
            atualizou = linhasAfetadas > 0;
            System.out.println("Vacina atualizada com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar vacina.\nCausa: " + e.getMessage());
        } finally {
            Banco.closePreparedStatement(stmt);
            Banco.closeConnection(conexao);
        }

        return atualizou;
    }

    // ----------------------------------------------  Retrieve  ------------------------------------------------------//

    public Vacina pesquisarPorId(int id) {
        Vacina vacinaBuscada = null;
        Connection conexao = Banco.getConnection();
        String sql = "select * from vacina where id = ?;";
        PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql);

        try {
            stmt.setInt(1, id);
            ResultSet resultado = stmt.executeQuery();

            if (resultado.next()) {

                vacinaBuscada = new Vacina();
                vacinaBuscada.setId(resultado.getInt("id"));
                vacinaBuscada.setId(resultado.getInt("id"));
                vacinaBuscada.setEstagioPesquisa(resultado.getInt("estagio_pesquisa"));
                vacinaBuscada.setPaisOrigem(resultado.getString("pais_origem"));
                vacinaBuscada.setDataInicioPesquisa(resultado.getDate("data_inicio_pesquisa"));

                int idResponsavel = resultado.getInt("id_responsavel");
                PesquisadorRepository pesquisadorRepository = new PesquisadorRepository();
                Pesquisador responsavelBuscado = pesquisadorRepository.pesquisarPorId(idResponsavel);

                vacinaBuscada.setResponsavel(responsavelBuscado);

            }
        } catch (SQLException e) {
            System.out.println("Erro ao recuperar as vacina.\nCausa: " + e.getMessage());
        } finally {
            Banco.closePreparedStatement(stmt);
            Banco.closeConnection(conexao);
        }

        return vacinaBuscada;
    }


    public ArrayList<Vacina> pesquisarTodas() {
        Connection conexao = Banco.getConnection();
        String sql = "SELECT * FROM vacina;";
        PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql);

        ArrayList<Vacina> listaVacinas = new ArrayList<>();

        try {
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {

                Vacina vacina = new Vacina();
                vacina.setId(resultado.getInt("id"));
                vacina.setPaisOrigem(resultado.getString("pais_origem"));
                vacina.setEstagioPesquisa(resultado.getInt("estagio_pesquisa"));
                vacina.setDataInicioPesquisa(resultado.getDate("data_inicio_pesquisa"));

                int idResponsavel = resultado.getInt("id_responsavel");
                PesquisadorRepository pesquisadorRepository = new PesquisadorRepository();
                Pesquisador responsavelBuscado = pesquisadorRepository.pesquisarPorId(idResponsavel);


                vacina.setResponsavel(responsavelBuscado);
                listaVacinas.add(vacina);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar vacinas.\nCausa: " + e.getMessage());
        } finally {
            Banco.closePreparedStatement(stmt);
            Banco.closeConnection(conexao);
        }

        return listaVacinas;
    }


    // ----------------------------------------------  Delete  ------------------------------------------------------//
    public boolean excluir(int id) {
        boolean excluiu = false;

        Connection conexao = Banco.getConnection();
        String sql = " DELETE FROM vacina WHERE id = ? ";
        PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql);

        try {
            stmt.setInt(1, id);
            int registrosExcluidos = stmt.executeUpdate();
            excluiu = (registrosExcluidos > 0);
            System.out.println("Vacina excluida com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro ao excluir vacina.\nCausa: " + e.getMessage());
        } finally {
            Banco.closePreparedStatement(stmt);
            Banco.closeConnection(conexao);
        }


        return excluiu;
    }
}
