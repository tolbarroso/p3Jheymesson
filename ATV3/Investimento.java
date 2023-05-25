public class Investimento extends Produto {
    public Investimento(double valor, String data, String hora) {
        super(valor, data, hora);
    }

    @Override
    public double rendimento() {
        return getValor() * 0.03; // Calcula o rendimento de 3%
    }
}