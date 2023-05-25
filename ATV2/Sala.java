package ATV2;

public class Sala {
    private String nome;
    private boolean ocupada;
    private Aluno[] turma;
    private int diaDeAula;

    public Sala(String nome) {
        this.nome = nome;
        this.ocupada = false;
        this.turma = new Aluno[10];
        this.diaDeAula = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public Aluno[] getTurma() {
        return turma;
    }

    public void setTurma(Aluno[] turma) {
        this.turma = turma;
    }

    public int getDiaDeAula() {
        return diaDeAula;
    }

    public void setDiaDeAula(int diaDeAula) {
        this.diaDeAula = diaDeAula;
    }

    public void alternar() {
        ocupada = !ocupada;
    }
}