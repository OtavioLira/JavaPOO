package tokio.aulas.aula03.prof;

public class CDB implements Produto {

	@Override
	public double investir(double valor) {
		return valor * 1.1375;
	}

}


