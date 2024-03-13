import java.util.List;

public class Boletim {

    private Aluno aluno;

    public Boletim(Aluno aluno) {
        this.aluno = aluno;
    }

    public void CalcularCr()
    {

    }



    public void mostrarMedia(Aluno aluno) {
        List<Disciplina> disciplinas = aluno.getDisciplina();
        List<Nota> notas = aluno.getNotas();

        for (int i = 0; i < disciplinas.size(); i++) {
            Disciplina disciplina = disciplinas.get(i);
            Nota nota = notas.get(i);

            double media = calcularMedia(nota);
            String situacao = calcularSituacao(media);

            System.out.println("Disciplina: " + disciplina.getNome());
            System.out.println("Média: " + media);
            System.out.println("Situação: " + situacao);
            System.out.println("----------");
        }
    }

    private double calcularMedia(Nota nota) {
        return (nota.getNotap1() + nota.getNotap2())/2;
    }

    private String calcularSituacao(double media) {
        if (media >= 6.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}