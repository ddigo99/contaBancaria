package conta.model;

public class ContaCorrente extends Conta {
	private float limiteDaConta;

	public ContaCorrente(int agencia, int conta, String titular, float saldo, float limit) {
		super(agencia, conta, 1, titular, saldo);
		this.limiteDaConta = limit;
	}

	public float getLimit() {
		return limiteDaConta;
	}

	public void setLimit(float limit) {
		this.limiteDaConta = limit;
	}

	@Override
	public boolean sacar(float value) {
		float valorTotal = super.getSaldo() + limiteDaConta;

		if (valorTotal < value) {
			return false;
		}

		float saldo = super.getSaldo();
		super.setSaldo(saldo - value);
		return true;

	}
}
