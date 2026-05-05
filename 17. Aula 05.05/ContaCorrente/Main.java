
public class Main {
    public static void main(String[] args) {
      
        ContaCorrente conta1 = new ContaCorrente(1234, 1);
        ContaCorrente conta2 = new ContaCorrente(5678, 1);
        

        System.out.println("C1 Agência: " + conta1.getAgencia() + " | Conta: " + conta1.getConta());
        System.out.println("C2 Agência: " + conta2.getAgencia() + " | Conta: " + conta2.getConta());

        System.out.println("Total de contas: " + ContaCorrente.getTotalDeContas());
    }
}
