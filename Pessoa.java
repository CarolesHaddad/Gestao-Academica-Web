abstract class Pessoa {
    protected int id;
    protected String nome;
    protected String dataNascimento;

    protected String email;

    protected String telefone;

    public Pessoa(int id, String nome, String dataNascimento,String email,String telefone) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setIdade(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirDetalhes()
    {
        System.out.println("Nome: " + this.nome + "\n Idade: " + this.dataNascimento + "\n ID: " + this.id + "\nemail: " + this.email + "\nTelefone: " + this.telefone);
    }
}
