import java.util.Arrays;

public class ClienteEspecial extends Cliente {
    private Investimento investimento;

    public ClienteEspecial(String nome, int idade, String conta, String agencia, double saldo,
            Investimento investimento) {
        super(nome, idade, conta, agencia, saldo);
        this.investimento = investimento;
    }

    @Override
    public void extrato() {
        int inicio = Math.max(0, historico.length - 30);
        Operacao[] ultimasOperacoes = Arrays.copyOfRange(historico, inicio, historico.length);

        double somaDepositos = 0;
        double somaSaques = 0;
        int countDepositos = 0;
        int countSaques = 0;

        for (Operacao operacao : ultimasOperacoes) {
            System.out.println("Tipo de Operação: " + operacao.getTipoOperacao());
            System.out.println("Valor: " + operacao.getValor());
            System.out.println("Data: " + operacao.getData());
            System.out.println("Hora: " + operacao.getHora());
            System.out.println("-----------------------");

            if (operacao.getTipoOperacao().equals("Depósito")) {
                somaDepositos += operacao.getValor();
                countDepositos++;
            } else if (operacao.getTipoOperacao().equals("Saque")) {
                somaSaques += operacao.getValor();
                countSaques++;
            }
        }

        double mediaDepositos = somaDepositos / countDepositos;
        double mediaSaques = somaSaques / countSaques;

        System.out.println("Média de Depósitos: " + mediaDepositos);
        System.out.println("Média de Saques: " + mediaSaques);
    }

    public void investimento(String data, String hora, double valorInvestido, double percentual) throws Exception {
        if (valorInvestido > this.getSaldo()) {
            throw new Exception("Saldo insuficiente para investimento.");
        }

        this.sacar(data, hora, valorInvestido);
        double rendimento = valorInvestido * percentual / 100.0;
        investimento.depositar(data, hora, rendimento);
    }

    public void resgate(String data, String hora) throws Exception {
        if (!data.equals(investimento.getData())) {
            throw new Exception("Data de resgate inválida.");
        }

        double valorResgate = investimento.getValor();
        investimento = null;
        this.depositar(data, hora, valorResgate);
    }
}