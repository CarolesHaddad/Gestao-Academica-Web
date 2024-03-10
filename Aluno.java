import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

    private String matricula;

    private List<Nota> notas;

    private Disciplina disciplina;

    private double media;

    private double cr;

    public Aluno(int id, String nome, int idade, String matricula, Disciplina disciplina) {
        super(id, nome, idade);
        this.notas = new ArrayList<>();
        this.matricula = matricula;
        this.disciplina = disciplina;
    }

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public void fazerMatriculaDisciplina() {

    }

    public void calcularMediaAluno(Aluno aluno) {

    }

    public void verificarRecuperacaoAluno(Aluno aluno) {

    }
}
