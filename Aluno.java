import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private String matricula;
    private List<Nota> notas;
    private List<Disciplina> disciplinas;
    private double media;
    private double cr;

    public Aluno(int id, String nome, int idade, String matricula,String email,String telefone) {
        super(id, nome, idade,email,telefone);
        this.notas = new ArrayList<>();
        this.matricula = matricula;
        this.disciplinas = new ArrayList<>();
    }

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }

    public List<Disciplina> getDisciplina() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
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

    public void fazerMatriculaDisciplina(Disciplina disciplinas) {
        this.disciplinas.add(disciplinas);

    }

    public void calcularMediaAluno(Aluno aluno) {

    }

    public void verificarRecuperacaoAluno(Aluno aluno) {

    }

    public void listarDisciplinas()
    {

        System.out.println("O aluno(a) " + this.getNome() + " está matriculado nas disciplinas: ");
        for(Disciplina disciplina : disciplinas)//eu vou estar iterando sobre cada disciplina na lista de disciplinas, e vai imprimir um disciplina da lista a cada iteração.
        {
            System.out.println("- " + disciplina.getNome());
        }
    }

    public void exibirDetalhes()
    {
        System.out.println("Nome: " + this.nome + "\n Idade: " + this.idade + "\n ID: " + this.id + "Matrícula: " + this.matricula);
    }
}

