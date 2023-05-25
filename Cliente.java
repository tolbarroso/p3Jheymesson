public class Cliente implements Operacoes {
    private String nome;
    private int idade;
    private String conta;
    private String agencia;
    private double saldo;
    private Operacao[] historico;

    public Cliente(String nome, int idade, String conta, String agencia, double saldo, Operacao[] historico) {
        this.nome = nome;
        this.idade = idade;
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.historico = historico;
    }

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

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Operacao[] getHistorico() {
        return historico;
    }

    public void setHistorico(Operacao[] historico) {
        this.historico = historico;
    }

    @Override
    public void depositar(String data, String hora, double valor) {
        Operacao operacao = new Operacao("Depósito", valor, data, hora);
        saldo += valor;
        atualizarHistorico(operacao);
    }

    @Override
    public void sacar(String data, String hora, double valor) throws Exception {
        if (saldo < valor) {
            throw new Exception("Saldo insuficiente para saque.");
        }

        Operacao operacao = new Operacao("Saque", valor, data, hora);
        saldo -= valor;
        atualizarHistorico(operacao);
    }

    @Override
    public void extrato() {
        System.out.println("Extrato do cliente: " + nome);
        for (Operacao operacao : historico) {
            if (operacao != null) {
                System.out.println("Tipo de operação: " + operacao.getTipoOperacao());
                System.out.println("Valor: " + operacao.getValor());
                System.out.println("Data: " + operacao.getData());
                System.out.println("Hora: " + operacao.getHora());
                System.out.println("---------------------");
            }
        }
    }

    protected void atualizarHistorico(Operacao operacao) {
        for (int i = historico.length - 1; i > 0; i--) {
            historico[i] = historico[i - 1];
        }
        historico[0] = operacao;
    }
}