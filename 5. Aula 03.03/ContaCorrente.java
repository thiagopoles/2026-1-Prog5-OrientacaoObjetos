
public class ContaCorrente {
	private int agencia;
	private int contaCorrente;
	private float saldo;
	public ContaCorrente() {
		this.agencia = 0;
		this.contaCorrente = 0;
		this.saldo = 0;
	}
	public ContaCorrente(int agencia, int contaCorrente, float saldo) {
		super();
		this.agencia = agencia;
		this.contaCorrente = contaCorrente;
		this.saldo = saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getContaCorrente() {
		return contaCorrente;
	}
	public void setContaCorrente(int contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public void sacar(float saque) {
		if(this.saldo>=saque)
			this.saldo = this.saldo-saque;
		else System.out.println("Saldo Insuficiente!");
	}
	public void depositar(float deposito) {
		this.saldo = this.saldo+deposito;
	}
	public void transferir(ContaCorrente c, float transf) {
		if(transf<=this.saldo) {
			this.sacar(transf);
			c.depositar(transf);	
		}else System.out.println("Transferência recusada!");
	}
	public void extrato() {
		System.out.println("--------------------------");
		System.out.println("Ag.: "+this.agencia);
		System.out.println("Cc.: "+this.contaCorrente);
		System.out.println("Saldo.: "+this.saldo);
	}
}
