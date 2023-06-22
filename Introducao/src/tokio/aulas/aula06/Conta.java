package tokio.aulas.aula06;

import java.sql.Date;

public abstract class Conta {
	//Atributos
	protected Cliente cliente;
	protected int numeroConta, agencia;
	protected Date dataAbertura;
	protected double saldo;
	protected String senha;
	private static long contador;
	
	
	//Construtor
	public Conta(Cliente cliente, int numeroConta, int agencia,
			String senha, double saldo) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.dataAbertura = new Date(System.currentTimeMillis());
		this.saldo = saldo;
		this.senha = senha;
		System.out.println("Objeto Conta Criado");
		contador++;
	}

	//Sacar
	public boolean Sacar(double sacar) {
		if(this.saldo >= sacar) {
			this.saldo -= sacar;	
			return true;
		}
		return false;
	}
	
	//depositar
	public void Depositar(double valor) {
		if(valor > 5) {
			this.saldo += valor;
		}
	}

	public abstract void exibirSaldo();
	// abstract no método força a reescrita.
	
	//transferir
	public void transferir(Conta conta, double valor) {
		if(this.Sacar(valor)) {
			this.Sacar(valor);
			conta.Depositar(valor);			
		}
	}
	
	public static void exibirContador() {
		System.out.println("Contas: " + contador);
	}

	
	
	
	
}
