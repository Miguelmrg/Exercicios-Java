/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/

package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		
		System.out.println("digite o número A: ");
		A = sc.nextInt();
		System.out.println("digite o número B: ");
		B = sc.nextInt();
		System.out.println("digite o número C: ");
		C = sc.nextInt();
		System.out.println("digite o número D: ");
		D = sc.nextInt();

		
		int diferenca = A * B - C * D;
		System.out.printf("A diferença entre o produto de A e B e o produto de C e D é: %d", diferenca);
	}

}
