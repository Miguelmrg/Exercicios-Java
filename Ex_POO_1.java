/*Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.
(PROBLEMA SOLUCIONADO SEM IMPLEMENTAÇÃO DE POO)*/

package aplicação;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xa, xb, xc, ya, yb, yc;
		
		System.out.println("digite as medidas do triângulo x: ");
		xa = sc.nextDouble();
		xb = sc.nextDouble();
		xc = sc.nextDouble();
		System.out.println("digite as medidas do triângulo y: ");
		ya = sc.nextDouble();
		yb = sc.nextDouble();
		yc = sc.nextDouble();
		
		double p = (xa + xb + xc) / 2.0;
		double areax = Math.sqrt(p *(p - xa)*(p - xb)*(p - xc));
		
		p = (ya + yb + yc) / 2.0;
		double areay = Math.sqrt(p *(p - ya)*(p - yb)*(p - yc));
		
		System.out.printf("Area do triângulo x: %.4f%nArea do triângulo y: %.4f%n", areax, areay);
		
		if(areax > areay) {
			System.out.println("Area maior: x");
		}
		else {
			System.out.println("Area maior: y");
		}
		
		sc.close();
	}

}
