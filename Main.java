public class Main {
    public static void main(String[] args) {
        Disciplina disciplina1 = new Disciplina("matematica", 60);
        Nota nota1 = new Nota(10,10,disciplina1);
        Aluno aluno1 = new Aluno(1, "Dimitri", 20, "202111230", disciplina1);

        System.out.println(aluno1.getDisciplina());

    }
}
