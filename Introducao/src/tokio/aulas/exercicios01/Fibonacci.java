package tokio.aulas.exercicios01;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Sequência de Fibonacci");
		int num1 = 0; //numero anterior
		int num2 = 1; //Proximo numero
		System.out.println("1° numero:" + num1 + "\n2° numêro:" + num2);
		
		System.out.println("Digite a quantidade de numeros a ser exibida");
		Scanner entrada = new Scanner(System.in);
		int fim = entrada.nextInt();
		for(int i = 1; i <= fim; i ++) {
			int soma = num1 + num2;
			System.out.print(soma + ", ");
			num1 = num2;
			num2 = soma;
		}
		entrada.close();

	}

}
