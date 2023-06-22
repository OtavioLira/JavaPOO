package tokio.aulas.exercicios01;

import java.util.Scanner;

public class ONG {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Pedir dados do usuario
		System.out.print("Digite o valor da doacao: R$");
		int doacao = entrada.nextInt();
		
		//investimento
		double investimento = doacao * 0.05;
		if(doacao >= 1000) {
			investimento = doacao * 0.15;
		}
		
		System.out.printf("Valor que deve ser investido: R$%.2f",investimento);
		
		entrada.close();
	}

	
}

