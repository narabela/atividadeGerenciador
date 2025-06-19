
package controller;

import conexao.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Turma;

public class GerenciadorDAO {
    
    public boolean inserir(Turma turma){
        Connection conexao = (Connection) GerenciadorConexao.getConnection();
        String sql = "INSERT INTO turma (nomeTurma, professor ,turno) "
                + "values (?,?,?); ";
        try{
            PreparedStatement pstm = (PreparedStatement) conexao
                    .prepareStatement(sql);
            pstm.setString(1, turma.getNomeTurma());
            pstm.setString(2, turma.getProfessor());
            pstm.setString(3, turma.getTurno());
            int linhas = pstm.executeUpdate();
            conexao.close();
            return linhas > 0 ? true : false;
        }catch(Exception e){
            System.err.println(e);
        }
        return false;
    }
    
    public boolean atualizar (Turma turma){
        Connection conexao = (Connection) GerenciadorConexao.getConnection();
        String sql = "UPDATE  turma SET nomeTurma=? , professor=?  ,turno=? "
                + "WHERE id=?; ";
        try{
            PreparedStatement pstm = (PreparedStatement) conexao
                    .prepareStatement(sql);
            pstm.setString(1, turma.getNomeTurma());
            pstm.setString(2, turma.getProfessor());
            pstm.setString(3, turma.getTurno());
            pstm.setInt(4, turma.getId());
            int linhas = pstm.executeUpdate();
            conexao.close();
            return linhas > 0 ? true : false;
        }catch(Exception e){
            System.err.println(e);
        }
        return false;
    }
    
    public Turma buscar (int id){
        Turma turma = new Turma ();
        Connection conexao = (Connection) GerenciadorConexao.getConnection();
        String sql = "SELECT * FROM turma WHERE id=?; ";

        try{
            PreparedStatement pstm = (PreparedStatement) conexao
                    .prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                turma = new Turma ();
                turma.setId (rs.getInt ("id"));
                turma.setNomeTurma (rs.getString("nomeTurma"));
                turma.setProfessor (rs.getString("professor"));
                turma.setTurno (rs.getString("turno"));
            }

            conexao.close();
            return turma;
        }catch(Exception e){
            System.err.println(e);
        }
        return null;
    }
    
    public ArrayList<Turma> buscar (String nomeTurma){
        Turma turma = new Turma ();
        ArrayList<Turma> turmas = new ArrayList<Turma> ();
        Connection conexao = (Connection) GerenciadorConexao.getConnection();
        String sql = "SELECT * FROM turma WHERE UPPER(nomeTurma) like UPPER('%" + nomeTurma + "%');  ";

        try{
            PreparedStatement pstm = (PreparedStatement) conexao
                    .prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                turma = new Turma ();
                turma.setId (rs.getInt ("id"));
                turma.setNomeTurma (rs.getString("nomeTurma"));
                turma.setProfessor (rs.getString("professor"));
                turma.setTurno (rs.getString("turno"));
                turmas.add(turma);
            }
            conexao.close();
            return turmas;
        }catch(Exception e){
            System.err.println(e);
        }
        return null;
    }
    
    public ArrayList<Turma> getTurmas (){
        Turma turma = new Turma ();
        ArrayList<Turma> turmas = new ArrayList<Turma> ();
        Connection conexao = (Connection) GerenciadorConexao.getConnection();
        String sql = "SELECT * FROM turma;  ";

        try{
            PreparedStatement pstm = (PreparedStatement) conexao
                    .prepareStatement(sql);            
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                turma = new Turma ();
                turma.setId (rs.getInt ("id"));
                turma.setNomeTurma (rs.getString("nomeTurma"));
                turma.setProfessor (rs.getString("professor"));
                turma.setTurno (rs.getString("turno"));
                turmas.add(turma);
            }
            conexao.close();
            return turmas;
        }catch(Exception e){
            System.err.println(e);
        }
        return null;
    }
    
    public boolean excluir (int id){
        Connection conexao = (Connection) GerenciadorConexao.getConnection();
        String sql = "DELETE FROM turma where id=?; ";
        try{
            PreparedStatement pstm = (PreparedStatement) conexao
                    .prepareStatement(sql);
            pstm.setInt(1, id);
            int linhas = pstm.executeUpdate();
            conexao.close();
            return linhas > 0 ? true : false;
        }catch(Exception e){
            System.err.println(e);
        }
        return false;
    }
    
    
}
