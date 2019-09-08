
public class Exercicio2Conta {
	private double saldo;
	private String conta;
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public String getConta() {
		return conta;
	}
	
	public void setConta(String conta) {
		this.conta = conta;
	}
	
	public Exercicio2Conta(String conta, Double saldo) {
		this.conta = conta;
		this.saldo = saldo;
	}
}
