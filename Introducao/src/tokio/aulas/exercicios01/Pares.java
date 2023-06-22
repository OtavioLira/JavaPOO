package tokio.aulas.exercicios01;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num = entrada.nextInt();
		
		for(int i = num; i >= 0; i--) {
			if(i % 2 == 0) {
				System.out.println(i);
			}else {
				continue;
			}
		}

	}

}