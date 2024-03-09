public class Main {
    public static void main(String[] args) {
        System.out.println("Carol");

        Disciplina disciplina1 = new Disciplina("Matematica", 60);
        Disciplina disciplina2 = new Disciplina("matematica2", 60);
        Disciplina disciplina3 = new Disciplina("matematica3", 60);
        Disciplina disciplina4 = new Disciplina("matematica4", 60);
        Nota nota1 = new Nota(10,10,disciplina1);
        Aluno aluno1 = new Aluno(1, "Dimitri", 20, "202111230");

        aluno1.fazerMatriculaDisciplina(disciplina1);
        aluno1.fazerMatriculaDisciplina(disciplina2);
        aluno1.fazerMatriculaDisciplina(disciplina3);
        aluno1.listarDisciplinas();

    }
}
