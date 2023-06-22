package tokio.aulas.aula03;

public class ContaCorrente extends Conta {
	
	private double saldoInvestimento;
	
	public ContaCorrente(Cliente cliente, int numeroConta, int agencia, String senha, double saldoInvestimento) {
		super(cliente, numeroConta, agencia, senha, saldoInvestimento);
	}
	
	public void registrar(double valor) {
		if(this.saldoInvestimento >= valor) {
			this.saldoInvestimento -= valor;
			this.Depositar(valor);
		}
	}
	// Design pattern Strategy
	public void investir(double valor, Produto produto) {
		if(this.Sacar(valor)) {
			this.saldoInvestimento += produto.investir(valor);
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
