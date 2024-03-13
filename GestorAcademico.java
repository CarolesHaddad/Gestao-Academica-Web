public class GestorAcademico extends Pessoa {
    private String setor;

    public GestorAcademico(int id, String nome, int idade,String email,String telefone) {
        super(id, nome, idade,email,telefone);
    }

    public void adicionarProfessor() {

    }

    public void excluirProfessor() {

    }

    public void adicionarAluno() {

    }

    public void excluirAluno() {

    }

    public void exibirDetalhes()
    {
        System.out.println("Nome: " + this.nome + "\n Idade: " + this.idade + "\n ID: " + this.id + "\nemail: " + this.email + "\nTelefone: " + this.telefone + "\nSetor: " + this.setor);
    }
}
