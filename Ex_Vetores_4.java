/*programa que lê até 10 números inteiros e depois mostra na tela todos os números negativos digitados*/

package aplicação;

import java.util.Locale;
import java.util.Scanner;

public class VetoresProbNegativos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] numeros;
		System.out.println("digite a quantidade de números(max. 10): ");
		int n = sc.nextInt();
		
		if (n > 10) {
			System.out.println("valor inválido.");
			System.exit(0);
		}
		
		numeros = new int[n];
		
		System.out.println("os números podem ser positivos ou negativos.");
		for (int i = 0; i < n; i++) {
			System.out.println("digite um número: ");
			numeros[i] = sc.nextInt();	
		}
		System.out.println("números negativos digitados: ");
		for (int i = 0; i < n; i++) {
			if (numeros[i] < 0) {
				System.out.println(numeros[i]);
			}
		}
		sc.close();
	}

}
