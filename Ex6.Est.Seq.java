package axkjznxk;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		double pi = 3.14159;
		
		System.out.printf("digite os valores a, b e c, respectivamente:%n");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		areaTriangulo = (a * c) / 2;
		areaCirculo = pi * (c * c);
		areaTrapezio = ((a + b) * c) /2;
		areaQuadrado = b * b;
		areaRetangulo = a * b;
		
		System.out.printf("As áreas dos polígonos são as seguintes:%nTRIÂNGULO: %.3f%nCÍRCULO: %.3f%nTRAPÉZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);
		
	}
}
