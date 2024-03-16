
public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(int id, String nome, String dataNascimento, String matricula,String email,String telefone) {
        super(id, nome, dataNascimento,email,telefone);
        this.matricula = matricula;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //    public void listarDisciplinas()
//    {
//
//        System.out.println("O aluno(a) " + this.getNome() + " está matriculado nas disciplinas: ");
//        for(Disciplina disciplina : disciplinas)//eu vou estar iterando sobre cada disciplina na lista de disciplinas, e vai imprimir um disciplina da lista a cada iteração.
//        {
//            System.out.println("- " + disciplina.getNome());
//        }
//    }

    public void exibirDetalhes()
    {
        System.out.println("Nome: " + this.nome + "\n Idade: " + this.dataNascimento + "\n ID: " + this.id + "\nemail: " + this.email + "\nTelefone: " + this.telefone + "\nMatrícula: " + this.matricula);
    }

//    public void listarNotas(Aluno aluno)
//    {
//        System.out.println("Bem vindo " + aluno.getNome() + ",suas notas são: ");
//        for(Nota nota: notas)
//        {
//            System.out.println("Disciplina: " + nota.getDisciplina().getNome());
//            System.out.println("-Suas notas na disciplina: " + nota.getNotap1() + " e " + nota.getNotap2());
//            System.out.println("----------------------------------------------------------------------");
//        }
//    }

}

