package AV3;

public class Coordenador extends Professor {
    // Atributos
    private String horarioAtendimento;

    // Construtor
    public Coordenador(String nome, int idade, String curso, String matricula, String horarioAtendimento) {
        super(nome, idade, curso, matricula);
        this.horarioAtendimento = horarioAtendimento;
    }

    // Getters e setters
    public String getHorarioAtendimento() {
        return horarioAtendimento;
    }

    public void setHorarioAtendimento(String horarioAtendimento) {
        this.horarioAtendimento = horarioAtendimento;
    }

    public void solicitacaoAluno(Aluno aluno) {
        if (aluno.isStatus()) {
            aluno.setStatus(false);
        } else {
            aluno.setStatus(true);
        }
    }

    public void removerTurma(Aluno aluno, Professor professor) {
        boolean alunoEncontrado = false;

        for (int i = 0; i < professor.getTurma().length; i++) {
            if (professor.getTurma()[i] == aluno) {
                professor.getTurma()[i] = null;
                alunoEncontrado = true;
                break;
            }
        }

        if (!alunoEncontrado) {
            throw new RuntimeException("O aluno não está presente na turma");
        }
    }
}