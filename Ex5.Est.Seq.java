package axkjznxk;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int c1, n1, c2, n2;
		double v1, v2, quantia1, quantia2, total;
		
		System.out.printf("digite o código de peça 1, o número de peças 1 %ne seu valor unitário, respectivamente:%n");
		c1 = sc.nextInt();
		n1 = sc.nextInt();
		v1 = sc.nextDouble();
		
		System.out.printf("digite o código de peça 2, o número de peças 2 %ne seu valor unitário, respectivamente:%n");
		c2 = sc.nextInt();
		n2 = sc.nextInt();
		v2 = sc.nextDouble();
		
		quantia1 = n1 * v1;
		quantia2 = n2 * v2;
		total = quantia1 + quantia2;
		
		System.out.printf("Códigos de peça: %d, %d %nValor total a pagar: R$%.2f%n",c1 ,c2, total);
		
		sc.close();
	}
}
