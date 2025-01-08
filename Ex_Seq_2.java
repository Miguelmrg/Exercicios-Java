package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, A, pi = 3.14159;
		
		System.out.printf("digite o valor do raio do círculo: %n");
		R = sc.nextDouble();
		
		A = pi * R * R ;
		
		System.out.printf("o valor da área do círculo é: %.4f%n", A);
	}

}
