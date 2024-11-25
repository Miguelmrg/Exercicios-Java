package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, soma;
		
		System.out.printf("digite o primeiro número: ", "%n");
		A = sc.nextInt();
		System.out.printf("digite o segundo número: ", "%n");
		B = sc.nextInt();
		soma = A + B;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
