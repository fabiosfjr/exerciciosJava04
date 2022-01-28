package exerciciosJavaGeneration4;

import java.util.Scanner;

/*1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
 */

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] vetor = new int[5];
		int maior, contador;
		
		for(contador = 0; contador < 5; contador++) {
			System.out.println("Digite o " + (contador+ 1) + "º número: ");
			vetor[contador] = leia.nextInt();
		}
		maior = vetor[0];
		
		for(contador = 0; contador < 5; contador++) {
			if(maior < vetor[contador]) {
				maior = vetor[contador];
			}
		}
		System.out.println("O maior número digitado é: " + maior);
		
	}
}
