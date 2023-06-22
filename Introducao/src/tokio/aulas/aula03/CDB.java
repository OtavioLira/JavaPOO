package tokio.aulas.aula03;

public class CDB implements Produto{

	@Override
	public double investir(double valor) {
		return valor * 0.1375;
	}
	
}
