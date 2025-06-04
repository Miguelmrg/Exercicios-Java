/*ler um int N e uma matriz de ordem N 
 * de números inteiros. Mostrar a diagonal 
 * principal e a quantidade de valores 
 * negativos da matriz.*/

package defaultPackage;

import java.util.Scanner;

public class MatrizOrdemN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("digite quantas linhas e colunas na matriz: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		System.out.println("da esquerda pra direita, de cima pra baixo, digite os valores da matriz: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("diagonal principal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.println(mat[i][i] + " ");
		}
		System.out.println();

		int neg = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					neg++;
				}
			}
		}
		System.out.println("quantidade de negativos: "+neg);
		sc.close();
	}

}
