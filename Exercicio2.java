package Vetores_Matriz;

import java.util.Scanner;

public class Exercicio2 {
	/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
	 * Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor.
	 *  A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize 
	 *  e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o*\
	 */
	public static void main(String[]args) {
		
		System.out.println("Coloque 10 numeros para ser armazenados");
		Scanner entrada = new Scanner(System.in);
		int [] numeros = new int [10];
		int soma = 0, maior = 0, maiorOcorrencia = 0;
		double media;
		for(int x = 0; x<10; x++) {
			System.out.println("Numero #"+(x + 1));
			numeros [x] = entrada.nextInt();
			if (numeros[x] > maior) {
				maior = numeros[x];
				maiorOcorrencia++;
			}
			soma += numeros[x];
		}
		System.out.println("Os numeros digitados foram : "
		for(int x = 0; x<10; x++) {
			System.out.println("Os numeros digitados foram : "+numeros[x]);
		}
		System.out.println("A media negra � igual a:"+(soma/10)+"\nO maior numero"
				+ "foi batido: "+(maiorOcorrencia-1)+" vezes");
	}
}
