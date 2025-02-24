/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.*/

package defaultPackage;

import java.util.Scanner;

public class Ex_cond {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite um número inteiro: ");
		
		int n = sc.nextInt();
		
		System.out.println("digite outro número inteiro: ");
		
		int s = sc.nextInt();
		
		if (n % s == 0 || s % n == 0) {
			System.out.println("os números são múltiplos");
		} else {
			System.out.println("os números não são múltiplos");
		}
		sc.close();
	}

}
