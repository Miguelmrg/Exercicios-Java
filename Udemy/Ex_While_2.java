/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

package defaultPackage;

import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = 1;
		int y = 1;
		
		while (x != 0 || y != 0) {
			System.out.println("Digite as coordenadas do ponto: (digite 0 , 0 para encerrar o programa)");
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (x > 0 && y > 0) {
				System.out.printf("o ponto ( %d , %d ) está no 1º quadrante. %n", x, y);
			} 
			else if (x < 0 && y > 0) {
				System.out.printf("o ponto ( %d , %d ) está no 2º quadrante. %n", x, y);
			}
			else if (x < 0 && y < 0) {
				System.out.printf("o ponto ( %d , %d ) está no 3º quadrante. %n", x, y);
			}
			else if (x > 0 && y < 0) {
				System.out.printf("o ponto ( %d , %d ) está no 4º quadrante. %n", x, y);
			}
		}
		sc.close();
	}

}
