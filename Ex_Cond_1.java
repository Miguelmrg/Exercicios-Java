package defaultPackage;

import java.util.Scanner;

public class Ex1_Cond {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n < 0) {
			System.out.println("negativo");
		}
		else {
			System.out.println("positivo");
		}
		
		sc.close();
	}
}
