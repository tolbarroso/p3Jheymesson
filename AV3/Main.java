package AV3;

public class Main {
    public static void main(String[] args) {
        // Criando um aluno
        Aluno aluno1 = new Aluno("João", 20, "Engenharia", "20210001");
        aluno1.setNotas(new double[] {8.5, 7.2, 6.8});
        aluno1.setPresencas(new boolean[] {true, true, false, true, true, true, true, true, true, true,
            true, true, true, true, true, true, true, true, true, true});
        aluno1.setStatus(true);
        
        // Criando um professor
        Professor professor1 = new Professor("Maria", 35, "Matemática", "P0001");
        professor1.setTurma(new Aluno[] {aluno1});
        
        // Criando um coordenador
        Coordenador coordenador1 = new Coordenador("Carlos", 40, "Administração", "C0001", "14:00 - 16:00");
        
        // Executando as operações
        aluno1.atividade();
        System.out.println("Média do aluno: " + aluno1.media());
        aluno1.presenca();
        
        professor1.atividade();
        try {
            System.out.println("Média da turma: " + professor1.media());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        professor1.presenca();
        
        coordenador1.solicitacaoAluno(aluno1);
        coordenador1.removerTurma(aluno1, professor1);
    }
}