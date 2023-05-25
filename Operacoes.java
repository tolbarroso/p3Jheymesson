public interface Operacoes {
    public void depositar(String data, String hora, double valor);
    public void sacar(String data, String hora, double valor) throws Exception;
    public void extrato();
}