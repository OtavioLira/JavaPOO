package tokio.aulas.aula03.prof;

public class LCA implements Produto {

	@Override
	public double investir(double valor) {
		return valor * (1 + 0.9);
	}

	

}
