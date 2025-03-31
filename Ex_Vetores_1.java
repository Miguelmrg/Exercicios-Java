/* fazer um programa para ler um número inteiro N 
e a altura de N pessoas. Armazene as N alturas 
em um vetor. Em seguida, mostre a altura média
dessas pessoas.*/

package defaultPackage;

import java.util.Locale;
import java.util.Scanner;

public class Vectors {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a quantidade de pessoas: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		System.out.printf("digite as alturas das %d pessoas:%n", n);
		
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i=0;i<n;i++) {
			soma += vect[i];
		}
		
		double media = soma / n;
		
		System.out.printf("a média das alturas é: %.2f cm", media);
		
		sc.close();
	}

}
