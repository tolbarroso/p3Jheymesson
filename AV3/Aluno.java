package AV3;

public class Aluno extends User implements Operacoes {
    //Atributos
    private String curso;
    private String matricula;
    private double[] notas;
    private boolean[] presencas;
    private boolean status;

    //Construtor
    public Aluno(String nome, int idade, String curso, String matricula) {
        super(nome, idade);
        this.curso = curso;
        this.matricula = matricula;
        this.notas = new double[3];
        this.presencas = new boolean[20];
        this.status = true;
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

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean[] getPresencas() {
        return presencas;
    }

    public void setPresencas(boolean[] presencas) {
        this.presencas = presencas;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Metodos
    @Override
    public void atividade() {
        System.out.println(getNome() + " está vendo aula");
    }

    @Override
    public double media() {
        int faltas = 0;
        for (boolean presenca : presencas) {
            if (!presenca) {
                faltas++;
            }
        }

        if (faltas > 16) {
            System.out.println("Reprovado por falta");
            return -1;
        }

        int notasPreenchidas = 0;
        for (double nota : notas) {
            if (nota != 0) {
                notasPreenchidas++;
            }
        }

        if (notasPreenchidas < 3) {
            System.out.println("Aluno não tem notas suficientes");
            return -1;
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aprovado por média");
            return media;

        } else if (media >= 5) {

            System.out.println("Aprovado");
            return media;

        } else {

            System.out.println("Reprovado");
            return media;

        }

    }

    @Override
    public void presenca() {
        int faltas = 0;
        int presencas = 0;

        for (boolean presenca : this.presencas) {
            if (presenca) {
                presencas++;
            } else {
                faltas++;
            }
        }

        System.out.println("Número de faltas: " + faltas);
        System.out.println("Número de presenças: " + presencas);
    }
}