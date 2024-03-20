import java.util.List;

public class Professor extends Pessoa implements Pagamento {
    private String numeroDeFuncionario;
    private Disciplina disciplinasLecionadas; //1 professor leciona 1 disciplina.
    private  double salario;
    public Professor(int id, String nome, String dataNascimento,String email,String telefone) {
        super(id, nome, dataNascimento,email,telefone);
    }
    public void atribuirNota(AlunoNaDisciplina aluno, Nota nota) {
        if(nota.getDisciplina() == this.disciplinasLecionadas)
        {
            aluno.getNotas().add(nota);
        }
        else {
            System.out.println("Professor não leciona essa disciplina!" );
        }
    }
    public void DisciplinaLecionada(Disciplina disciplina)
    {
        this.disciplinasLecionadas = disciplina;
    }

    public Disciplina getDisciplinasLecionadas()
    {
        return this.disciplinasLecionadas;
    }

    public String getNumeroDeFuncionario() {
        return numeroDeFuncionario;
    }

    public void setNumeroDeFuncionario(String numeroDeFuncionario) {
        this.numeroDeFuncionario = numeroDeFuncionario;
    }

    public void setDisciplinasLecionadas(Disciplina disciplinasLecionadas) {
        this.disciplinasLecionadas = disciplinasLecionadas;
    }

    public void exibirDetalhes()
    {
        System.out.println("Nome: " + this.nome + "\n Idade: " + this.dataNascimento + "\n ID: " + this.id + "\nemail: " + this.email + "\nTelefone: " + this.telefone + "\nNúmero de Funcionário: " + this.numeroDeFuncionario);
    }
    public void receberPagamento(String tipoPagamento, double salario) {
        System.out.println("Pagamento recebido com sucesso! Tipo de pagamento: " + tipoPagamento + " Valor: R$" + salario);
        this.salario = salario;
    }
    public String consultarContracheque() {
        return "Contracheque disponível para consulta!" +
                "\nSalário Bruto: " + this.salario + "\nDescontos: " + this.salario * 0.15 + "\nSalário Líquido: " + (this.salario - (this.salario*0.15));

    }

}
