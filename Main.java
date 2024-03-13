public class Main {
    public static void main(String[] args) {
        Disciplina disciplina1 = new Disciplina("Matematica", 60);
        Disciplina disciplina2 = new Disciplina("matematica2", 60);
        Disciplina disciplina3 = new Disciplina("matematica3", 60);
        Disciplina disciplina4 = new Disciplina("matematica4", 60);

        Nota nota1 = new Nota(10,10,disciplina1);
        Nota nota2 = new Nota(9,8,disciplina2);

        Aluno aluno1 = new Aluno(1, "Dimitri", 20, "202111230","d.lbck@gmail.com","22998872372");
        Aluno aluno2 = new Aluno(1, "Carol", 20, "202111230","d.lbck@gmail.com","22998872372");
        Aluno aluno3 = new Aluno(2,"Gabriel",19,"12345678", "gahbahbcs" , "1928777");
        Professor prof1 = new Professor(2, "renata", 20, "gggggggg", "234568");

//
//        prof1.atribuirNota(aluno2,nota1);
//        prof1.atribuirNota(aluno2,nota2);
//        aluno1.fazerMatriculaDisciplina(disciplina1);
//        aluno1.fazerMatriculaDisciplina(disciplina2);
//        aluno1.fazerMatriculaDisciplina(disciplina3);
//        aluno1.listarDisciplinas();
//
//
//        aluno2.listarNotas(aluno2);

        aluno1.fazerMatriculaDisciplina(disciplina1);
        aluno2.fazerMatriculaDisciplina(disciplina1);
        aluno3.fazerMatriculaDisciplina(disciplina1);
        disciplina1.listarAlunos();

    }
}
