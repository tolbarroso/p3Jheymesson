public abstract class Produto {
    private double valor;
    private String data;
    private String hora;

    public Produto(double valor, String data, String hora) {
        this.valor = valor;
        this.data = data;
        this.hora = hora;
    }

    // Métodos abstratos
    abstract double rendimento();
}