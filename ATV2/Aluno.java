package ATV2;

public class Aluno {
    private String nome;
    private int idade;
    private int matricula;
    private boolean[] presenca;

    public Aluno(String nome, int idade, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.presenca = new boolean[10];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public boolean[] getPresenca() {
        return presenca;
    }

    public void setPresenca(boolean[] presenca) {
        this.presenca = presenca;
    }
}