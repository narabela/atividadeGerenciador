package controller;

import java.util.ArrayList;
import java.util.Iterator;
import model.Turma;

public class GerenciadorTurma {

    private ArrayList<Turma> turmas; //Lista

    public GerenciadorTurma() {
        turmas = new ArrayList<>(); // Inicializa a lista
    }

    public ArrayList<Turma> listarTurma() {
        return turmas; // Retorna a lista corretamente
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }
    
    public boolean removerTurma(String nomeTurma) { // Agora recebe apenas o nome da turma
    Iterator<Turma> iterator = turmas.iterator();
    while (iterator.hasNext()) {
        Turma turmaAtual = iterator.next();
        if (turmaAtual.getNomeTurma().equalsIgnoreCase(nomeTurma)) { // Comparação correta
            iterator.remove();
            System.out.println("Turma removida com sucesso.");
            return true;
        }
    }
    System.out.println("Turma não encontrada.");
    return false;
}

    /** public boolean removerTurma(Turma turma) {
        Iterator<Turma> iterator = turmas.iterator();
        while (iterator.hasNext()) {
            Turma turmaAtual = iterator.next(); // Renomeamos a variável para evitar conflito
            String nomeTurma = "";
            if (turmaAtual.getNomeTurma().equalsIgnoreCase(nomeTurma)) {
                iterator.remove();
                System.out.println("Turma removida com sucesso.");
                return true;

            }
            System.out.println("Turma não encontrada.");
            return false;

        }
        return false;

    } */
}
