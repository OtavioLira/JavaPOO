package tokio.aulas.aula06;

public class ContaCorrente extends Conta {
	
	private double saldoInvestimento;
	
	public ContaCorrente(Cliente cliente, int numeroConta, int agencia, String senha, double saldoInvestimento) {
		super(cliente, numeroConta, agencia, senha, saldoInvestimento);
	}
	// Design pattern Strategy
	public void investir(double valor, Produto produto) throws SaldoInsuficiente{
		if(this.Sacar(valor)) {
			this.saldoInvestimento += produto.investir(valor);
		} else {
			throw new SaldoInsuficiente("Saldo Insuficiente");
		}

	}
	public void resgatar(double valor) throws SaldoInsuficiente{
		if (this.saldoInvestimento >= valor) {
			this.saldoInvestimento -= valor;
			this.Depositar(valor);
		} else {
			throw new SaldoInsuficiente("Saldo Insuficiente");
		}
	}

	
	@Override
	public void exibirSaldo() {
		double saldoTotal = this.saldo + this.saldoInvestimento;
		System.out.println("Numero da conta: " + String.valueOf(this.numeroConta));
		System.out.println("Agencia: " + String.valueOf(this.agencia));
		System.out.println("Data de abertura: " + String.valueOf(this.dataAbertura));
		System.out.println("Saldo Total: " + saldoTotal);
		
	}
	

}
