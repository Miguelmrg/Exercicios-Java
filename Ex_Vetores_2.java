/* Fazer um programa para ler um número inteiro N e os dados
(nome e preço) de N Produtos. Armazene os N produtos em um 
vetor. Em seguida, mostre o preço médio dos produtos.*/

package entidades;

public class Produtos_Vetores {

	private String nome;
	private double preço;

	public Produtos_Vetores(String nome, double preço) {
		this.nome = nome;
		this.preço = preço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

}

package aplicação;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produtos_Vetores;

public class ProgramaProdutos_Vetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a quantidade de produtos: ");
		int n = sc.nextInt();
		Produtos_Vetores[] vect = new Produtos_Vetores[n];
		
		for (int i=0; i<vect.length;i++) {
			sc.nextLine();
			System.out.println("digite o nome do produto: ");
			String nome = sc.nextLine();
			System.out.println("digite o preço do produto: ");
			double preço = sc.nextDouble();
			vect[i] = new Produtos_Vetores(nome, preço);
		}
		
		double soma = 0.0;
		for (int i=0;i<vect.length; i++) {
			soma += vect[i].getPreço();
		}
		double media = soma/n;
		
		System.out.printf("Preço médio: %.2f $", media);
		
		sc.close();
	}

}
