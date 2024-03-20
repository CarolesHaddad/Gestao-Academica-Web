import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    

        Disciplina disciplina1 = new Disciplina("Matematica", 60);
        Disciplina disciplina2 = new Disciplina("matematica2", 60);
        Disciplina disciplina3 = new Disciplina("matematica3", 60);
        Disciplina disciplina4 = new Disciplina("matematica4", 60);

        Nota nota1 = new Nota(10,10,disciplina1);
        Nota nota2 = new Nota(9,8,disciplina2);
        Nota nota3 = new Nota(7,4,disciplina3);

        Aluno aluno1 = new Aluno(1, "Dimitri", "8888", "202111230","d.lbck@gmail.com","22998872372",2);
        Aluno aluno2 = new Aluno(1, "Carol", "11111", "202111230","d.lbck@gmail.com","22998872372",3);
        Aluno aluno3 = new Aluno(2,"Gabriel","dddddd","12345678", "gahbahbcs" , "1928777",8);
        Professor prof1 = new Professor(2, "renata", "22222", "gggggggg", "234568");
        Professor prof2 = new Professor(3, "Caroles", "56789","qweru","2345678");

        AlunoNaDisciplina aluno1E = new AlunoNaDisciplina(aluno1);
        AlunoNaDisciplina aluno6 = new AlunoNaDisciplina(aluno3);

//        prof1.atribuirNota(aluno1E,nota1);
//        prof1.atribuirNota(aluno1E,nota2);
//        prof1.atribuirNota(aluno1E,nota3);
//        aluno1E.listarNotas(aluno1E);
//        aluno1E.imprimeMedianaDisciplina(nota1);

//
//        prof1.DisciplinaLecionada(disciplina1);
        GestorAcademico gestor1 = new GestorAcademico(4,"Kauã","333333","234567@gmail", "2345678");
        gestor1.adicionarProfessor(prof1,disciplina1);
        gestor1.adicionarProfessor(prof2,disciplina2);
        gestor1.listarprofessores();
        gestor1.adicionarAluno(aluno1);
        gestor1.adicionarAluno(aluno2);
        gestor1.listaralunos();
        prof1.atribuirNota(aluno1E,nota2);
        aluno6.fazerMatriculaDisciplina(disciplina1,gestor1);
        aluno1E.fazerMatriculaDisciplina(disciplina1,gestor1);
        aluno1E.fazerMatriculaDisciplina(disciplina2,gestor1);
        aluno1E.fazerMatriculaDisciplina(disciplina3,gestor1);
        aluno1E.listarDisciplinas();

//        prof1.receberPagamento("Salario Mensal",4000);
//        System.out.println(prof1.consultarContracheque());
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
       // Boletim boletim1 = new Boletim(aluno1);
      //  aluno1.fazerMatriculaDisciplina(disciplina1);
       // aluno1.fazerMatriculaDisciplina(disciplina2);
       // aluno1.fazerMatriculaDisciplina(disciplina3);
       // prof1.atribuirNota(aluno1,nota1);
       // prof1.atribuirNota(aluno1,nota2);
       // prof1.atribuirNota(aluno1,nota3);
      //  disciplina1.listarAlunos();
      //  aluno1.calcularMediaAlunoDisciplina(aluno1,nota1);
      //  aluno1.calcularMediaAlunoDisciplina(aluno1,nota2);
      //  boletim1.imprimirBoletimMediaDisciplinasCr(aluno1);

    }
}
