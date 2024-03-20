
public class Aluno extends Pessoa {
    private String matricula;

    private int periodo;

    public Aluno(int id, String nome, String dataNascimento, String matricula,String email,String telefone,int periodo) {
        super(id, nome, dataNascimento,email,telefone);
        this.matricula = matricula;
        this.periodo = periodo;

    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public void exibirDetalhes()
    {
        System.out.println("Nome: " + this.nome + "\n Idade: " + this.dataNascimento + "\n ID: " + this.id + "\nemail: " + this.email + "\nTelefone: " + this.telefone + "\nMatrícula: " + this.matricula);
    }
}

