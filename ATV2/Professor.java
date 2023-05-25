package ATV2;

public class Professor {
    private String nome;
    private int idade;
    private int matricula;
    private Sala sala;

    public Professor(String nome, int idade, int matricula, Sala sala) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.sala = sala;
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

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public void iniciarAula() {
        if (!sala.isOcupada()) {
            sala.alternar();
            System.out.println("A aula está acontecendo com o professor " + nome + ", matrícula: " + matricula);
        } else {
            System.out.println("A sala está ocupada");
        }
    }

    public void chamada(boolean[] presenca) {
        for (int i = 0; i < 10; i++) {
            if (presenca[i]) {
                sala.getTurma()[i].getPresenca()[sala.getDiaDeAula()] = true;
            }
        }
        sala.setDiaDeAula(sala.getDiaDeAula() + 1);
    }

    public void terminarAula() {
        if (sala.isOcupada()) {
            sala.alternar();
            System.out.println("Aula finalizada com o professor " + nome + ", matrícula: " + matricula);
            sala.setDiaDeAula(sala.getDiaDeAula() + 1);
        } else {
            System.out.println("Não há aula nesta sala");
        }
    }
}