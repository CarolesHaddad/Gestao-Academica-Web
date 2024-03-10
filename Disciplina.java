import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nome;
    private int cargaHoraria;

    private List<Aluno> alunos;

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void listarAlunos(Aluno aluno) {

    }
    @Override
    public String toString() {
        return "Disciplina: " + nome + ", Carga Horária: " + cargaHoraria;
    }
}
