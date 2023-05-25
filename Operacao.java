public class Operacao {
    private String tipoOperacao;
    private double valor;
    private String data;
    private String hora;

    public Operacao(String tipoOperacao, double valor, String data, String hora) {
        this.tipoOperacao = tipoOperacao;
        this.valor = valor;
        this.data = data;
        this.hora = hora;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}