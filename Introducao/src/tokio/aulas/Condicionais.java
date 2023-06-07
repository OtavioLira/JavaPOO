package tokio.aulas;

public class Condicionais {

	public static void main(String[] args) {
		
//		balança dos metais - considere 3 metais distintos, ouro, prata e bronze. 
//		Escreva um algoritmo para exibir o mais pesado.
//		fazer com if-else encadeado
		
		float ouro=10, prata=20, bronze=30;
		
		/*
		 * if(ouro > prata) { if(ouro > bronze) {
		 * System.out.println("Ouro e o mais pesado"); } else {
		 * System.out.println("Bronze e o mais pesado"); } } if (prata > bronze) {
		 * System.out.println("Prata e o mais pesado"); } else {
		 * System.out.println("Bronze e o mais pesado"); }
		 */
		// part 2
		if (ouro > prata && ouro > bronze) {
			System.out.println("Ouro e o mais pesado");
		} else if (prata > bronze) {
			System.out.println("Prata e o mais pesado");
		} else {
			System.out.println("Bronze e o mais pesado");
		}
		
	}

}
