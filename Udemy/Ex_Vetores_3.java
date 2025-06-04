/*ler nome, idade e altura de N pessoas, depois mostrar na tela a média de altura 
dessas pessoas, e uma porcentagem de pessoas com menos de 16 anos. */

package aplicação;

import java.util.Locale;
import java.util.Scanner;

public class VetoresAlturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] nomes;
		int[] idades;
		double[] alturas;
		
		System.out.println("digite a quantidade de pessoas: ");
		int n = sc.nextInt();
		
		nomes = new String[n];
		idades = new int[n];
		alturas = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("dados da " +(i + 1)+"a pessoa: ");
			sc.nextLine(); //PARA LIMPAR O BUFFER
			System.out.println("nome: ");
			nomes[i] = sc.nextLine();
			System.out.println("idade: ");
			idades[i] = sc.nextInt();
			System.out.println("altura: ");
			alturas[i] = sc.nextDouble();
		}
		double alturasSoma = 0.0;
		for (int i = 0; i < n; i++) {
			alturasSoma =+ alturas[i];
		}
		double mediaAlturas = alturasSoma/n;
		
		int contagemMenor16 = 0;
		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				contagemMenor16 ++;
			}
		}
		double percentMenor16 = ((double) contagemMenor16 / n) *100.0;
		
		System.out.printf("média de altura: %.2f%n", mediaAlturas);
		System.out.printf("porcentagem de pessoas menores de 16: %.2f%n", percentMenor16);
		
		System.out.printf("nomes dos menores de 16 anos: %n %n");
		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}
		sc.close();
	}

}
