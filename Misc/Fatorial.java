/*Criar um programa que calcula fatoriais.
 * (para exemplo em trabalho da faculdade) */

package miscPackage;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite n: ");
		int n = sc.nextInt();
		int fat = 1;
		
		if (n < 0) {
			System.out.println("fatorial não pode ser definido para n negativo.");
			System.exit(0);
		}
		else if (n == 0 || n == 1) {
			System.out.println("fatorial de n = 1");
			System.exit(0);
		} 
		
		for (int i = 2; i <= n; i++) {
			fat *= i;
		}
		System.out.println("fatorial de n = "+fat);
		sc.close();
	}

}
