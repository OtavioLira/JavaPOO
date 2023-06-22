package tokio.aulas.exercicios01;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		System.out.println("Programa Fatorial");
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = entrada.nextInt();
		
		System.out.print(num);
		for(int i = 1; i <= num; i--) {
			if(i <= 0 && num <= 0) {
				System.out.println("\nTotal: 1");
				break;
			}
			num *= i;
			System.out.print("." + i);
		}
		System.out.println("\nTotal: "  + num);
		
		entrada.close();
	}

}
