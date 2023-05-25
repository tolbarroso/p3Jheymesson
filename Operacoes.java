public interface Operacoes {
    void depositar(String data, String hora, double valor);
    void sacar(String data, String hora, double valor) throws Exception;
    void extrato();
}