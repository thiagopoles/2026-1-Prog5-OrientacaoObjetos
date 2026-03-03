import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ContaCorrente cc1 = new ContaCorrente();
		
		System.out.println("Digite o número da Agência: ");
		cc1.setAgencia(teclado.nextInt());
		
		System.out.println("Digite o número da Conta: ");
		cc1.setContaCorrente(teclado.nextInt());
		
		System.out.println("Digite o saldo da Conta: ");
		cc1.setSaldo(teclado.nextInt());
		
		int ag;
		int cc;
		float saldo;
		
		System.out.println("Digite o número da agência");
		ag = teclado.nextInt();
		
		System.out.println("Digite o número da conta");
		cc = teclado.nextInt();
		System.out.println("Digite o saldo da conta");
		saldo = teclado.nextFloat();
		ContaCorrente cc2 = new ContaCorrente(ag, cc, saldo);
		
		int op;
		do {
			System.out.println("Escolha a Opção");
			System.out.println("1 - Sacar");
			System.out.println("2 - Depositar");
			System.out.println("3 - Transferir");
			System.out.println("4 - Extrato");
			System.out.println("5 - Sair");
			op = teclado.nextInt();
			if(op == 1) {
				System.out.println("Qual é o valor do saque: ");
				cc1.sacar(teclado.nextFloat());
			}
			else if(op == 2) {
				System.out.println("qual valor para depósito: ");
				cc1.depositar(teclado.nextFloat());
			}
			else if(op == 3) {
				System.out.println("Qual é o valor para transferir: ");
				cc1.transferir(cc2, teclado.nextFloat());
			}
			else if(op == 4) {
				cc1.extrato();
				cc2.extrato();
			}
			else if(op == 5)
				System.out.println("Programa Finalizado!");
		}while(op != 5);{
			
		}
	}
}
