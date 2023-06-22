package tokio.aulas.exercicios01;

public class Contador {

	public static void main(String[] args) {
		int numero = 0;
		int valor = 0;
		while (numero <= 100) {
			valor += numero;
			numero++;
			System.out.println("Indice[" + numero + "]: " + valor);
		}

	}

}
