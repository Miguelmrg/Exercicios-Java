package defaultPackage;

import java.util.Scanner;

public class Ex_cond {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a hora inicial: ");
		
		int Hinicial = sc.nextInt();
		
		System.out.println("digite a hora final: ");
		
		int Hfinal = sc.nextInt();
		
		int duracao; 
		
		if (Hfinal > Hinicial) {
			duracao = Hfinal - Hinicial;
		}
		else if (Hfinal < Hinicial) {
			duracao = (24 - Hinicial) + Hfinal;
		}
		else {
			duracao = 24;
		}
		
		System.out.println("a duração do jogo foi: "+duracao+" horas");
		sc.close();
	}

}
