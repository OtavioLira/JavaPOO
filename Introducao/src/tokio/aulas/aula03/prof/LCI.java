package tokio.aulas.aula03.prof;
public class LCI implements Produto {

	@Override
	public double investir(double valor) {
		return valor * (1 + 0.95); 
	}

}
