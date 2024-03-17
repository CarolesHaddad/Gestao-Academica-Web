import java.util.ArrayList;
import  java.util.List;

public class AlunoNaDisciplina
{
    private Aluno aluno;
    private List<Disciplina> disciplinas;
    private List<Nota> notas;

    public AlunoNaDisciplina(Aluno aluno)
    {
        this.aluno = aluno;
        this.notas = new ArrayList<>();
        this.disciplinas = new ArrayList<>();

    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno)
    {
        this.aluno = aluno;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public void fazerMatriculaDisciplina(Disciplina disciplinas) {
        this.disciplinas.add(disciplinas);
        disciplinas.getAlunos().add(this.aluno); // o this autoreferencia o objeto, ele pega disciplinas que é um objeto de Disciplina e está adicionando um objeto aluno na lista de alunos em Disciplina.
    }

    public void listarNotas(AlunoNaDisciplina aluno)//mudar método
    {
        System.out.println("Bem vindo " + aluno.getAluno().getNome() + ",suas notas são: ");
        for(Nota nota: notas)
        {
            System.out.println("Disciplina: " + nota.getDisciplina().getNome());
            System.out.println("-Suas notas na disciplina: " + nota.getNotap1() + " e " + nota.getNotap2());
            System.out.println("----------------------------------------------------------------------");
        }

    }

    public void imprimeMedianaDisciplina(Nota nota)
    {
        System.out.println("A média do aluno "+ aluno.getNome()  +"na disciplina " + nota.getDisciplina().getNome() + " é :");
        System.out.println("- " + nota.calcularMediaAlunoDisciplina());
    }


}