public class Investimento extends Produto {
    public Investimento(double valor, String data, String hora) {
        super(valor, data, hora);
    }

    @Override
    double rendimento() {
        return getValor() * 0.03;
    }
}