package tokio.aulas.aula02;

import java.sql.Date;

public class Conta {
	//Atributos 
	private Cliente cliente;
	private int numeroConta, agencia;
	private Date dataAbertura;
	private double saldo;
	private String senha;
	
	
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
	//Consultar Saldos
	public void exibirSaldo() {
		System.out.println(this.cliente.getNomeTitular() + "\nSaldo: " + this.saldo);
	}
	
	//transferir
	public void transferir(Conta conta, double valor) {
		if(this.Sacar(valor)) {
			this.Sacar(valor);
			conta.Depositar(valor);			
		}
	}
	
	
	
	
}
