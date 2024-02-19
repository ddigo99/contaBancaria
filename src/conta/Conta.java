package conta;

public class Conta {
	
	private int agencia = 0;
	private int numero = 0;
	private int tipo = 0;
	private String titular = "";
	private float saldo = 0;
	
	
	
	
	public Conta(int agencia, int conta, int tipo, String titular, float saldo) {
		this.agencia = agencia;
		this.numero = conta;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return numero;
	}
	public void setConta(int conta) {
		this.numero = conta;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	public boolean sacar(float valor) {
		if(this.saldo < valor)
			return false;
		
		this.setSaldo(this.saldo - valor);
		return true;
	}
	
	public void depositar(float valor) {
		
		this.setSaldo(this.saldo + valor);
	}
	
public void visualizar() {
		
		String tipoConta = "";
		
		switch(this.tipo) {
		case 1:
			tipoConta = "Conta Corrente";
			break;
		case 2:
			tipoConta = "Conta Poupança";
			break;
		}
		
		System.out.println(":::::::::::::::::::::::::::::::");
		System.out.println("Dados da Conta");
		System.out.println(":::::::::::::::::::::::::::::::");
		System.out.println("Numero da conta: " + this.numero);
		System.out.println("Agência da conta: " + this.agencia);
		System.out.println("Tipo da conta: " + tipoConta);
		System.out.println("Titular da conta: " + this.titular);
		System.out.println("Saldo da conta: " + this.saldo);
	}
	
	
	
	
	

}
