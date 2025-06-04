/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/


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
