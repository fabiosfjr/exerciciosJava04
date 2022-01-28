package exerciciosJavaGeneration4;

/*2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.
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
		
		System.out.println("A m�dia dos valores �: " + (soma/10) + "\nAs ocorr�ncias da maior pontua��o: " + ocorrencia);
		Thread.sleep(500);
	}

}
