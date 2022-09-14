package model.repository;

import model.Banco;
import model.entidade.Pesquisador;
import java.sql.*;
import java.util.ArrayList;

public class PesquisadorRepository {

    // ----------------------------------------------  Insert  ------------------------------------------------------//

    public Pesquisador insert (Pesquisador novoPesquisador){

        Connection conexao = Banco.getConnection();
        String sql = "INSERT INTO pesquisador(`nome`, `cpf`, `matricula`, `data_nascimento`) values (?, ?, ?, ?);";
        PreparedStatement stmt = Banco.getPreparedStatementWithPk(conexao, sql);

        try {
            stmt.setString(1, novoPesquisador.getNome());
            stmt.setString(2, novoPesquisador.getCpf());
            stmt.setInt(3, novoPesquisador.getMatricula());
            stmt.setDate(4, new java.sql.Date(novoPesquisador.getDataNascimento().getTime()));
            stmt.execute();

            ResultSet chavesGeradas = stmt.getGeneratedKeys();

            if(chavesGeradas.next()){
                novoPesquisador.setId(chavesGeradas.getInt(1));
            }
            System.out.println("Pesquisador inserido com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir Pesquisador.\nCausa: " + e.getMessage());
        } finally {
            Banco.closePreparedStatement(stmt);
            Banco.closeConnection(conexao);
        }

        return novoPesquisador;

    }
    // ----------------------------------------------  Update  ------------------------------------------------------//

    public boolean atualizar (Pesquisador pesquisador){
        boolean atualizou = false;
        Connection conexao = Banco.getConnection();
        String sql = "UPDATE pesquisador set nome = ?, cpf = ?, matricula = ?, data_nascimento = ? where id = ?";

        PreparedStatement stmt = Banco.getPreparedStatementWithPk(conexao, sql);

        try {
        stmt.setString(1, pesquisador.getNome());
        stmt.setString(2, pesquisador.getCpf());
        stmt.setInt(3, pesquisador.getMatricula());
        stmt.setDate(4, new Date(pesquisador.getDataNascimento().getTime()));
        stmt.setInt(5, pesquisador.getId());

        int linhasAfetadas = stmt.executeUpdate();
        atualizou = linhasAfetadas > 0;

        } catch (SQLException e){
            System.out.println("Erro ao atualizar o pesquisador. \nCausa: " + e.getMessage());
        } finally {
            Banco.closePreparedStatement(stmt);
            Banco.closeConnection(conexao);
        }

        return atualizou;
    }

    // ----------------------------------------------  Retrieve  ------------------------------------------------------//

    public Pesquisador pesquisarPorId(int id) {
        Pesquisador pesquisadorBuscado = null;
        Connection conexao = Banco.getConnection();
        String sql = " SELECT * FROM PESQUISADOR WHERE ID = ? ";
        PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql);
        try {
            stmt.setInt(1, id);
            ResultSet resultado = stmt.executeQuery();
            if(resultado.next()) {
                pesquisadorBuscado = new Pesquisador();
                pesquisadorBuscado.setId(resultado.getInt("id"));
                pesquisadorBuscado.setNome(resultado.getString("nome"));
                pesquisadorBuscado.setCpf(resultado.getString("cpf"));
                pesquisadorBuscado.setMatricula(resultado.getInt("matricula"));
                pesquisadorBuscado.setDataNascimento(resultado.getDate("data_nascimento"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar pesquisador com id = " + id + " .\nCausa: "+ e.getMessage());
        } finally {
            Banco.closePreparedStatement(stmt);
            Banco.closeConnection(conexao);
        }
        return pesquisadorBuscado;
    }

    public ArrayList<Pesquisador> pesquisarTodos() {
        Connection conexao = Banco.getConnection();
        String sql = "SELECT * FROM pesquisador;";
        PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql);

        ArrayList<Pesquisador> listaPesquisador = new ArrayList<>();

        try {
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {

                Pesquisador pesquisador = new Pesquisador();
                pesquisador.setId(resultado.getInt("id"));
                pesquisador.setNome(resultado.getString("nome"));
                pesquisador.setCpf(resultado.getString("cpf"));
                pesquisador.setMatricula(resultado.getInt("matricula"));
                pesquisador.setDataNascimento(resultado.getDate("data_nascimento"));

                listaPesquisador.add(pesquisador);

            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar vacinas.\nCausa: " + e.getMessage());
        } finally {
            Banco.closePreparedStatement(stmt);
            Banco.closeConnection(conexao);
        }

        return listaPesquisador;
    }

    // ----------------------------------------------  Delete  ------------------------------------------------------//

    public boolean excluir (int id){
        boolean excluiu = false;

        Connection conexao = Banco.getConnection();
        String sql = "DELETE FROM pesquisador where id = ?";
        PreparedStatement stmt = Banco.getPreparedStatementWithPk(conexao, sql);


        try {
            stmt.setInt(1, id);
            int registrosExcluidos = stmt.executeUpdate();
            excluiu = (registrosExcluidos > 0);
            System.out.println("Pesquisador excluido com sucesso");
        } catch (SQLException e){
            System.out.println("Erro ao deletar o pesquisador. \nCausa: " + e.getMessage());
        } finally {
            Banco.closePreparedStatement(stmt);
            Banco.closeConnection(conexao);
        }

        return excluiu;
    }
}
