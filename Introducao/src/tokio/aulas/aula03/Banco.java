package tokio.aulas.aula03;

import java.text.ParseException;

public class Banco {

	public static void main(String[] args) throws ParseException {
		
		Cliente otavio = new Cliente("Otavio", "532536", "659413485", "Rua O","16/06/2004");
		ContaCorrente contaotavio = new ContaCorrente(otavio, 0110, 20, "conta", 0);
		Cliente murilo = new Cliente("Murilo", "541552", "483438514", "Rua M","16/05/2004");
		ContaCorrente contamurilo = new ContaCorrente(murilo, 0220, 11, "seila", 0);
		Cliente anonimo = new Cliente("Anonimo", "XXXXXXXX","7385498357", "RUA ?","16/06/2004");
		ContaCorrente contanonimo = new ContaCorrente(anonimo, 0000, 00, "@48jigrm", 0);
		//Simulações
		contanonimo.Depositar(999999);
		contanonimo.transferir(contaotavio,999999);
		contaotavio.exibirSaldo();
		
		contamurilo.exibirSaldo();
		contaotavio.transferir(contamurilo, 700);
		contamurilo.exibirSaldo();
		
		Conta.exibirContador();
		
		//
		CDB cdb = new CDB();
		LCA lca = new LCA();
		LCI lci = new LCI();
		contaotavio.investir(100000, cdb);
		contaotavio.exibirSaldo();
		contamurilo.investir(676, lci);
		contamurilo.investir(9999, lca);

	}

}
