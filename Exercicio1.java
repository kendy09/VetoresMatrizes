package Vetores_Matriz;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[]args) {
		//Fa�a um programa que crie um vetor por leitura com 5 
		//valores de pontua��o de uma atividade e o escreva em seguida.
		//Encontre ap�s a maior pontua��o e a apresente.
		System.out.println("Digite a nota do aluno");
		Scanner leia = new Scanner(System.in);
		double[] notas = new double[5];
		double soma = 0;
		
		for(int x = 0 ;  x<5 ; x++) {
			System.out.println("Prova #"+(x+1));
			notas[x] = leia.nextDouble();
			soma += notas[x];
		}
		
		System.out.println("A media da soma das nota �: "+(soma/5));
	}
}
