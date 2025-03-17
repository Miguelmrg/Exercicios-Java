/*Fazer um programa para ler os dados de um produto em estoque (nome, preço e
quantidade no estoque). Em seguida:
• Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
estoque)
• Realizar uma entrada no estoque e mostrar novamente os dados do produto
• Realizar uma saída no estoque e mostrar novamente os dados do produto
• UTILIZAR CONSTRUTOR E GETTERS/SETTERS*/
package entidades;

public class Produto {

	private String nome;
	private double preço;
	private int quantidade;

	public Produto() {
	}

	public Produto(String nome, double preço, int quantidade) {
		super();
		this.nome = nome;
		this.preço = preço;
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto(String nome, double preço) {
		this.nome = nome;
		this.preço = preço;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public double getPreço() {
		return preço;
	}

	public double valorTotalEstoque() {
		return preço * quantidade;
	}

	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nome + ", $" + String.format("%.2f", preço) + ", " + quantidade + " unidades, Total: $ "
				+ String.format("%.2f", valorTotalEstoque());

	}
}

package aplicação;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class ProgramaProduto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("digite os dados do produto. %nnome: ");
		String nome = sc.nextLine();
		System.out.print("preço: ");
		double preço = sc.nextDouble();
		System.out.print("quantidade: ");
		int quantidade = sc.nextInt();
		Produto produto = new Produto(nome, preço, quantidade);

		produto.toString();

		System.out.printf("%ndados do produto: " + produto + "%n");
		
		produto.setNome("Computador");
		System.out.println("nome atualizado: "+produto.getNome());
		produto.setPreço(1200);
		System.out.println("preço atualizado: "+produto.getPreço());

		System.out.printf("%ndigite o número de produtos a serem adicionados no estoque: ");
		quantidade = sc.nextInt();
		produto.adicionarProdutos(quantidade);

		System.out.printf("%ndados atualizados do produto: " + produto);

		System.out.printf("%ndigite o número de produtos a serem removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);

		System.out.printf("%ndados atualizados do produto: " + produto);

		sc.close();
	}

}
