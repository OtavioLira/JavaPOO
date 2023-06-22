package tokio.aulas.aula06;

public class CDB implements Produto{

	@Override
	public double investir(double valor) {
		return valor * 0.1375;
	}
	
}
