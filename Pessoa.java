abstract class Pessoa {
    protected int id;
    protected String nome;
    protected  int idade;

    protected String email;

    protected String telefone;

    public Pessoa(int id, String nome, int idade,String email,String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirDetalhes()
    {
        System.out.println("Nome: " + this.nome + "\n Idade: " + this.idade + "\n ID: " + this.id + "\nemail: " + this.email + "\nTelefone: " + this.telefone);
    }
}
