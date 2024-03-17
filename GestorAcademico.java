import java.util.ArrayList;
import java.util.List;

public class GestorAcademico extends Pessoa implements Pagamento {
    private String setor;
    private List<Professor> professores;
    private List<Aluno> alunos;


    public GestorAcademico(int id, String nome, String dataNascimento,String email,String telefone) {
        super(id, nome,dataNascimento,email,telefone);
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
            System.out.println("Nome: " + professor.getNome() + " Disciplina Lecionada: " + professor.getDisciplinasLecionadas().getNome());
        }
    }

    public void exibirDetalhes()
    {
        System.out.println("Nome: " + this.nome + "\n Idade: " + this.dataNascimento + "\n ID: " + this.id + "\nemail: " + this.email + "\nTelefone: " + this.telefone + "\nSetor: " + this.setor);
    }
    public void receberPagamento(String tipoPagamento, double valor) {
        System.out.println("Pagamento recebido com sucesso! Tipo de pagamento: " + tipoPagamento + " Valor: R$" + valor);
    }
    public void consultarContracheque() {
        // Implementar lógica para consultar contracheque
        System.out.println("Contracheque disponível para consulta!");
    }

}
