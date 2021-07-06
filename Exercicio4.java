package Vetores_Matriz;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]matriz = new int [2][2];
		int somaDiagonalP = 0,soma = 0;
		Scanner leia = new Scanner(System.in);
		
		for (int l = 0; l < 2 ; l++) {
			for (int c = 0;c<matriz[l].length; c++) {
				System.out.printf("Digite um valor para[%d][%d]", (l+1),(c+1));
				matriz[c][l] = leia.nextInt();
				soma += matriz[c][l];
				if (l == c) {
					somaDiagonalP += matriz[c][l];
				}
			}
		}
		System.out.println("O valor da soma da matriz é  :"+soma+
				"\nO valor da soma dos valores da diagonal principal"
				+ "é: "+somaDiagonalP);
		
	}

}
