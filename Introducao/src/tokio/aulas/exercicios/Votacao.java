package tokio.aulas.exercicios;

import java.util.Scanner;

public class Votacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Solicitar dados ao usuario
		System.out.println("Digite a idade da pessoa");
		int idade = entrada.nextInt();

		if(idade >= 18) {
			System.out.println("Voce deve votar");
		} else if (idade >= 16) {
			System.out.println("Voce pode votar");
		} else {
			System.out.println("Voce nao pode votar");
		}
		
		entrada.close();
		
	
	}

}
