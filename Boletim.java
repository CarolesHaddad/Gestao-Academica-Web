import java.util.List;

public class Boletim {

    private Aluno aluno;

    public Boletim(Aluno aluno) { //inicializa um construtor que recebe o atributo aluno. Cada aluno tem um boletim.
        this.aluno = aluno;
    }

//    public void imprimirBoletimMediaDisciplinasCr(Aluno aluno)
//    {
//        List<Disciplina> disciplinas = aluno.getDisciplina();
//        List<Nota> notas = aluno.getNotas();
//
//        double somaMedias = 0.0;
//        int numeroDisciplinas = disciplinas.size();
//
//        for (int i = 0; i < disciplinas.size(); i++) //percorre o vetor de disciplinas do aluno
//        {
//            Disciplina disciplina = disciplinas.get(i);
//            Nota nota = notas.get(i);
//
//            double media = calcularMedia(nota);
//            String situacao = calcularSituacao(media);
//            somaMedias += media;
//            System.out.println("Disciplina: " + disciplina.getNome());
//            System.out.println("Média: " + media);
//            System.out.println("Situação: " + situacao);
//            System.out.println("----------");
//        }
//        double cr = somaMedias / numeroDisciplinas;
//        System.out.println("CR do aluno: " + cr);
//    }
//
//    private double calcularMedia(Nota nota)
//    {
//        return (nota.getNotap1() + nota.getNotap2())/2;
//    }
//
//    private String calcularSituacao(double media)
//    {
//        if (media >= 6.0) {
//            return "Aprovado";
//        } else {
//            return "Reprovado";
//        }
//    }
}