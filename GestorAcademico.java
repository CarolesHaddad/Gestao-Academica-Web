import java.util.ArrayList;
import java.util.List;

public class GestorAcademico extends Pessoa {
    private String setor;
    private List<Professor> professores;
    private List<Aluno> alunos;


    public GestorAcademico(int id, String nome, int idade,String email,String telefone) {
        super(id, nome, idade,email,telefone);
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void excluirProfessor(Professor professor) {
        professores.remove(professor);
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void excluirAluno(Aluno aluno) {
        alunos.remove(aluno);

    }
    public void listaralunos(){
        for(Aluno aluno : alunos){
            System.out.println("Nome: " + aluno.getNome());
        }
    }
    public void listarprofessores(){
        for(Professor professor : professores){
            System.out.println("Nome: " + professor.getNome());
        }
    }

    public void exibirDetalhes()
    {
        System.out.println("Nome: " + this.nome + "\n Idade: " + this.idade + "\n ID: " + this.id + "\nemail: " + this.email + "\nTelefone: " + this.telefone + "\nSetor: " + this.setor);
    }
}
