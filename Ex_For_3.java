/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.*/

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
			
			System.out.println("número a: ");
			double a = sc.nextDouble();
			System.out.println("número b: ");
			double b = sc.nextDouble();
			System.out.println("número c: ");
			double c = sc.nextDouble();
			
			double media = ((a * 2)+(b * 3)+(c * 5))/10;
			
			System.out.printf("a média ponderada com pesos 2, 3 e 5 é: %.3f ", media);
			
		}
		sc.close();
	}
}
