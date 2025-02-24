package defaultPackage;

import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a senha: ");
		
		int senha = sc.nextInt();
		
		while (senha != 1472) {
			System.out.println("senha inválida.");
			senha = sc.nextInt();
		}
		
		System.out.println("senha correta.");
		sc.close();
	}

}
