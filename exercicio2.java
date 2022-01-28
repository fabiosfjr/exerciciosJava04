package exerciciosJavaGeneration4;

/*2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
*/

import java.util.Random;

public class exercicio2 {

	public static void main(String[] args) throws InterruptedException {
		
		Random aleatorio = new Random();
		
		int[] valor = new int[10];
		int contador, ocorrencia = 0, maior = 0, soma = 0;
		
		for(contador = 0; contador < 10; contador++) {
			valor[contador] = aleatorio.nextInt(6) + 1;
			
			if(valor[contador] > maior) {
				maior = valor[contador];
				ocorrencia = 1;
			}
			
			else if(valor[contador] == maior) {
				ocorrencia++;
			}
			
			soma += valor[contador];
		}
		
		for(contador = 0; contador < 10; contador++) {
			System.out.println(" [" + valor[contador] + "] ");
			Thread.sleep(500);	
		}
		
		System.out.println("A média dos valores é: " + (soma/10) + "\nAs ocorrências da maior pontuação: " + ocorrencia);
		Thread.sleep(500);
	}

}
