package defaultPackage;

import java.util.Scanner;

public class Ex_cond {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o código do item: ");
		int codigo = sc.nextInt();
		
		double v1 = 4.00;
		double v2 = 4.50;
		double v3 = 5.00;
		double v4 = 2.00;
		double v5 = 1.50;
		
		System.out.println("digite a quantidade a ser comprada: ");
		int quantidade = sc.nextInt();
		double total = 0;
		
		if (codigo == 1) {
			total = v1 * quantidade;
		}
		if (codigo == 2) {
			total = v2 * quantidade;
		}
		if (codigo == 3) {
			total = v3 * quantidade;
		}
		if (codigo == 4) {
			total = v4 * quantidade;
		}
		if (codigo == 5) {
			total = v5 * quantidade;
		}
		
		System.out.printf("o total a ser pago é: R$%.2f", total);
		
		sc.close();
	}

}
