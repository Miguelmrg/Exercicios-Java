/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.
*/

package defaultPackage;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite um número de 1 até 1000: ");
		int n = sc.nextInt();
		
		System.out.println("os valores ímpares contidos nesse número são: ");
		
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
