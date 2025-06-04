/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/

package defaultPackage;

import java.util.Scanner;

public class Ex_cond {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite um número inteiro: ");
		
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("o número é par");
		} else {
			System.out.println("o número é ímpar");
		}
		sc.close();
	}

}
