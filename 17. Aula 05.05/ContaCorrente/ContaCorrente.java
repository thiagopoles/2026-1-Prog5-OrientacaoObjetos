
public class ContaCorrente {
    private static int totalDeContas = 0;
    private int conta;
    private int agencia;

    public ContaCorrente(int conta, int agencia) {
        super();
        this.conta = conta;
        this.agencia = agencia;
        ContaCorrente.totalDeContas++;
        System.out.println(ContaCorrente.totalDeContas);
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    public static int getTotalDeContas() {
        return totalDeContas;
    }

}