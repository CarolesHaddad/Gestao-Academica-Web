import java.util.ArrayList;
import java.util.List;


public class GestorAcademico extends Pessoa implements Pagamento {
    private String setor;
    private List<Professor> professores;
    private List<Aluno> alunos;
    private  double salario;

    public GestorAcademico(int id, String nome, String dataNascimento,String email,String telefone) {
        super(id, nome,dataNascimento,email,telefone);
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void adicionarProfessor(Professor professor, Disciplina disciplina) {
        professores.add(professor);
        professor.setDisciplinasLecionadas(disciplina);
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
        System.out.println("Os alunos regularmente matriculados no curso de Sistemas de Informação são: ");
        for(Aluno aluno : alunos){
            System.out.println("Nome: " + aluno.getNome());
        }
    }
    public void listarprofessores(){
        for(Professor professor : professores){
            System.out.println("Nome: " + professor.getNome() + " Disciplina Lecionada: " + professor.getDisciplinasLecionadas().getNome());
        }
    }
    public boolean verificarAluno(Aluno aluno)
    {
        return alunos.contains(aluno); //retorna falso se a lista não contém aquele aluno, retorna verdadeiro se contém.
    }
    public void exibirDetalhes()
    {
        System.out.println("Nome: " + this.nome + "\n Idade: " + this.dataNascimento + "\n ID: " + this.id + "\nemail: " + this.email + "\nTelefone: " + this.telefone + "\nSetor: " + this.setor);
    }
    public void receberPagamento(String tipoPagamento, double salario) {
        System.out.println("Pagamento recebido com sucesso! Tipo de pagamento: " + tipoPagamento + " Valor: R$" + salario);
    }

    public String consultarContracheque() {
        return "Contracheque disponível para consulta!" +
                "\nSalário Bruto: " + this.salario + "\nDescontos: " + this.salario * 0.10 + "\nSalário Líquido: " + (this.salario - (this.salario*0.15));

    }

}
