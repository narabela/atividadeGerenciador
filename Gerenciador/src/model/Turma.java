
package model;

public class Turma {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    private int id;
    private String nomeTurma;
    private String professor;
    private String turno;
    
    public Turma (){
        
    }
    
    public String getNomeTurma() {
        return nomeTurma;
    }

    /**
     * @param nomeTurma the nomeTurma to set
     */
    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    /**
     * @return the professor
     */
    public String getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(String professor) {
        this.professor = professor;
    }

    /**
     * @return the turno
     */
    public String getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    @Override
    public String toString () {
        return "Turma: " + nomeTurma + " | Professor: " + professor + " | Turma: " + turno;
    }
    
    
}
