package Vetores_Matriz;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int [][] numeros1 = new int[2] [2];
		int [][] numeros2 = new int[2][2];
		int [][] matrizSoma = new int[2][2];
		int [][] matrizSub = new int [2][2];
		
		for(int c = 0; c < numeros1.length; c++) {
			for(int l = 0; l <numeros1[c].length; l++) {
				System.out.printf("Digite um numero para a matriz1 na pos[%d][%d]",(c+1),(l+1));
				numeros1[c][l] = leia.nextInt();
			}
		}
		
		System.out.println("");
		for(int c = 0; c < numeros2.length; c++) {
			for(int l = 0; l <numeros2[c].length; l++) {
				System.out.printf("Digite um numero para a matriz2 na pos[%d][%d]",(c+1),(l+1));
				numeros2[c][l] = leia.nextInt();
				matrizSoma[c][l] = numeros1[c][l] + numeros2[c][l];
				matrizSub[c][l] = numeros1[c][l] - numeros2[c][l];	
			}
			
		}
		
		System.out.println("A matriz soma é :");
		for(int c = 0; c < matrizSoma.length; c++) {
			for(int l = 0; l <matrizSoma[c].length; l++) {
				System.out.print(matrizSoma[c][l]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("A matriz subtração é:");
		for(int c = 0; c<matrizSub.length; c++) {
			for(int l = 0; l<matrizSub[c].length; l++) {
				System.out.print(matrizSub[c][l]+" ");
			}
			System.out.println("");
		}
		
	}

}
