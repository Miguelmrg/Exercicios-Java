/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
*/

package defaultPackage;

import java.util.Locale;
import java.util.Scanner;

public class Ex_cond {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite um número ENTRE 0 e 100");
		double num = sc.nextDouble();
		
		if (num >= 0.00 && num <= 25.00) {
			System.out.printf("o número %.2f está no intervalo 0.00 e 25.00", num);
		}
		else if (num >= 25.01 && num <= 50.00) {
			System.out.printf("o número %.2f está no intervalo 25.00 e 50.00", num);
		}
		else if (num >= 50.01 && num <= 75.00) {
				System.out.printf("o número %.2f está no intervalo 50.00 e 75.00", num);
		}
		else if (num >= 75.01 && num <= 100.00) {
			System.out.printf("o número %.2f está no intervalo 75.00 e 100.00", num);
	}
		else {
			System.out.println("o número não está presente em nenhum intervalo do programa.");
		}
		
		sc.close();
	}

}
