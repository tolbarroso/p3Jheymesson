package AV3;

public abstract class User {
    //Atributos
    private String nome;
    private int idade;

    //Construtor
    public User(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e setters
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

    //Metodo
    public abstract void atividade();
}