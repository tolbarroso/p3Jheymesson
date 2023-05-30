package AV3;

import java.util.Random;

public class Professor extends User implements Operacoes {
    //Atributos
    private String curso;
    private String matricula;
    private Aluno[] turma;

    //Construtor
    public Professor(String nome, int idade, String curso, String matricula) {
        super(nome, idade);
        this.curso = curso;
        this.matricula = matricula;
        this.turma = new Aluno[10];
    }

    // Getters e setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Aluno[] getTurma() {
        return turma;
    }

    public void setTurma(Aluno[] turma) {
        this.turma = turma;
    }

    //Metodos
    @Override
    public void atividade() {
        System.out.println(getNome() + " está dando aula para:");
        for (Aluno aluno : turma) {
            if (aluno != null) {
                System.out.println(aluno.getNome());
            }
        }
    }

    @Override
    public double media() {
        int totalAlunos = 0;
        double somaMedias = 0;
        for (Aluno aluno : turma) {
            if (aluno != null) {
                double mediaAluno = aluno.media();
                if (mediaAluno == -1) {
                    throw new RuntimeException("A turma ainda não foi finalizada");
                }
                somaMedias += mediaAluno;
                totalAlunos++;
            }
        }
        return somaMedias / totalAlunos;
    }

    @Override
    public void presenca() {
        Random random = new Random();
        for (Aluno aluno : turma) {
            if (aluno != null) {
                double numero = random.nextDouble();
                if (numero >= 0.8) {
                    aluno.getPresencas()[random.nextInt(aluno.getPresencas().length)] = false;
                } else {
                    aluno.getPresencas()[random.nextInt(aluno.getPresencas().length)] = true;
                }
            }
        }
    }
}