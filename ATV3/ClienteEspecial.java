public class ClienteEspecial extends Cliente {
    private Investimento investimento;

    public ClienteEspecial(String nome, int idade, String conta, String agencia, double saldo, Operacao[] historico, Investimento investimento) {
        super(nome, idade, conta, agencia, saldo, historico);
        this.investimento = investimento;
    }

    public Investimento getInvestimento() {
        return investimento;
    }

    public void setInvestimento(Investimento investimento) {
        this.investimento = investimento;
    }

    @Override
    public void extrato() {
        System.out.println("Extrato do cliente especial: " + getNome());
        for (Operacao operacao : getHistorico()) {
            if (operacao != null) {
                System.out.println("Tipo de operação: " + operacao.getTipoOperacao());
                System.out.println("Valor: " + operacao.getValor());
                System.out.println("Data: " + operacao.getData());
                System.out.println("Hora: " + operacao.getHora());
                System.out.println("---------------------");
            }
        }

        double mediaDeposito = calcularMediaDeposito();
        double mediaSaque = calcularMediaSaque();

        System.out.println("Média de depósito: " + mediaDeposito);
        System.out.println("Média de saque: " + mediaSaque);
    }

    private double calcularMediaDeposito() {
        int contador = 0;
        double totalDeposito = 0;
        for (Operacao operacao : getHistorico()) {
            if (operacao != null && operacao.getTipoOperacao().equals("Depósito")) {
                totalDeposito += operacao.getValor();
                contador++;
            }
        }

        if (contador == 0) {
            return 0;
        }

        return totalDeposito / contador;
    }

    private double calcularMediaSaque() {
        int contador = 0;
        double totalSaque = 0;
        for (Operacao operacao : getHistorico()) {
            if (operacao != null && operacao.getTipoOperacao().equals("Saque")) {
                totalSaque += operacao.getValor();
                contador++;
            }
        }

        if (contador == 0) {
            return 0;
        }

        return totalSaque / contador;
    }

    public void investimento(String data, String hora, double valorInvestido, double percentual) throws Exception {
        if (getSaldo() < valorInvestido) {
            throw new Exception("Saldo insuficiente para investimento.");
        }

        investimento.setValor(investimento.getValor() + valorInvestido);
        setSaldo(getSaldo() - valorInvestido);
        Operacao operacao = new Operacao("Investimento", valorInvestido, data, hora);
        atualizarHistorico(operacao);
    }

    public void resgate(String data, String hora) throws Exception {
        if (!data.equals(investimento.getData())) {
            throw new Exception("Data de resgate inválida.");
        }

        double valorResgate = investimento.getValor();
        investimento.setValor(0);
        setSaldo(getSaldo() + valorResgate);
        Operacao operacao = new Operacao("Resgate", valorResgate, data, hora);
        atualizarHistorico(operacao);
    }
}