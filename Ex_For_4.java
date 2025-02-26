/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/

package defaultPackage;

import java.util.Locale;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("digite a quantidade de testes a serem feitos: ");

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("digite o número a: ");
			int a = sc.nextInt();
			System.out.println("digite o número b: ");
			int b = sc.nextInt();

			if (b == 0) {
				System.out.println("divisão impossível");
			} else {
				double div = (double) a / b;
				System.out.printf("divisão: %.2f%n", div);
			}
		}
		sc.close();
	}
}
