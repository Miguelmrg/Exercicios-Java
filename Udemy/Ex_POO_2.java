/*Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.
(PROBLEMA SOLUCIONADO COM POO)
classe Triangulo definida: */

package entidades;

public class Triangulo {

	public double a;
	public double b;
	public double c;
} 

package aplicação;

import java.util.Locale;

import java.util.Scanner;

import entidades.Triangulo;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("digite as medidas do triângulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("digite as medidas do triângulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2.0;
		double areax = Math.sqrt(p *(p - x.a)*(p - x.b)*(p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areay = Math.sqrt(p *(p - y.a)*(p - y.b)*(p - y.c));
		
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
