public class Nota {

    private double notap1;
    private double notap2;

    private Disciplina disciplina;

    public Nota(double notap1, double notap2, Disciplina disciplina) {
        this.notap1 = notap1;
        this.notap2 = notap2;
        this.disciplina = disciplina;
    }

    public double getNotap1() {
        return notap1;
    }

    public void setNotap1(double notap1) {
        this.notap1 = notap1;
    }

    public double getNotap2() {
        return notap2;
    }

    public void setNotap2(double notap2) {
        this.notap2 = notap2;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
