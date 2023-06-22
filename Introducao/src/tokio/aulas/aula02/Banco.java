package tokio.aulas.aula02;

public class Banco {

	public static void main(String[] args) {
		
		Cliente otavio = new Cliente("Otavio", "532536", "659413485", "Rua O");
		Conta contaotavio = new Conta(otavio, 0110, 20, "conta", 0);
		Cliente murilo = new Cliente("Murilo", "541552", "483438514", "Rua M");
		Conta contamurilo = new Conta(murilo, 0220, 11, "seila", 0);
		
		//Simulações
		contaotavio.Depositar(999999);
		contaotavio.exibirSaldo();
		
		contamurilo.exibirSaldo();
		contaotavio.transferir(contamurilo, 700);
		contamurilo.exibirSaldo();

		
		
		
		

	}

}
