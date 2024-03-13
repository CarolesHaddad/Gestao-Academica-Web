public class Professor extends Pessoa {
    private String numeroDeFuncionario;

    public Professor(int id, String nome, int idade,String email,String telefone) {
        super(id, nome, idade,email,telefone);
    }
    public void atribuirNota(Aluno aluno, Nota nota) {
        aluno.getNotas().add(nota);
    }

    public void exibirDetalhes()
    {
        System.out.println("Nome: " + this.nome + "\n Idade: " + this.idade + "\n ID: " + this.id + "\nemail: " + this.email + "\nTelefone: " + this.telefone + "\nNúmero de Funcionário: " + this.numeroDeFuncionario);
    }
}
