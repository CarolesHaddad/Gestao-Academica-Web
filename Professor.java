import java.util.List;

public class Professor extends Pessoa implements Pagamento {
    private String numeroDeFuncionario;
    private Disciplina disciplinasLecionadas;

    public Professor(int id, String nome, String dataNascimento,String email,String telefone) {
        super(id, nome, dataNascimento,email,telefone);
    }
    public void atribuirNota(AlunoNaDisciplina aluno, Nota nota) {
        aluno.getNotas().add(nota);
    }
    public void DisciplinaLecionada(Disciplina disciplina)
    {
        this.disciplinasLecionadas = disciplina;
    }

    public Disciplina getDisciplinasLecionadas()
    {
        return this.disciplinasLecionadas;
    }
    public void exibirDetalhes()
    {
        System.out.println("Nome: " + this.nome + "\n Idade: " + this.dataNascimento + "\n ID: " + this.id + "\nemail: " + this.email + "\nTelefone: " + this.telefone + "\nNúmero de Funcionário: " + this.numeroDeFuncionario);
    }
    public void receberPagamento(String tipoPagamento, double valor) {
        System.out.println("Pagamento recebido com sucesso! Tipo de pagamento: " + tipoPagamento + " Valor: R$" + valor);
    }
    public void consultarContracheque() {
        // Implementar lógica para consultar contracheque
        System.out.println("Contracheque disponível para consulta!");
    }

}
