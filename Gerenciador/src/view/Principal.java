
package view;

import controller.GerenciadorDAO;
import java.util.ArrayList;
import model.Turma;
import controller.GerenciadorTurma;

/**
 *
 * @author Narabela
 */
public class Principal {
    
    public static Turma turma = new Turma();
    public static GerenciadorDAO gerenciadorDao = new GerenciadorDAO();
    public static GerenciadorTurma gerenciadorTurma = new GerenciadorTurma();
    public static ArrayList<Turma> turmas = new ArrayList<>();
    
    public static void main(String[] args) {
        JanelaPrincipal janelaPrincipal = new JanelaPrincipal ();
        janelaPrincipal.setVisible(true);
        janelaPrincipal.setLocationRelativeTo(null);
        
    }

    
    
}
