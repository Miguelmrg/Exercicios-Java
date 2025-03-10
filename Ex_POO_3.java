/*Fazer um programa para ler os dados de um produto em estoque (nome, preço e
quantidade no estoque). Em seguida:
• Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
estoque)
• Realizar uma entrada no estoque e mostrar novamente os dados do produto
• Realizar uma saída no estoque e mostrar novamente os dados do produto*/

package entidades;

public class Produto {
	
	public String nome;
	public double preço;
	public int quantidade;
	
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
		return nome
		+", $"
		+String.format("%.2f", preço)
		+", "
		+quantidade
		+" unidades, Total: $ "
		+String.format("%.2f",valorTotalEstoque());
	}
}

package aplicação;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("digite os dados do produto: ");
		System.out.print("nome: ");
		produto.nome = sc.nextLine();
		System.out.print("preço: ");
		produto.preço = sc.nextDouble();
		System.out.print("quantidade: ");
		produto.quantidade = sc.nextInt();
		
		produto.toString();
		
		System.out.printf("%ndados do produto: "+produto+"%n");
		
		System.out.printf("%ndigite o número de produtos a serem adicionados no estoque: ");
		int quantidade = sc.nextInt();
		produto.adicionarProdutos(quantidade);
		
		System.out.printf("%ndados atualizados do produto: "+produto);
		
		System.out.printf("%ndigite o número de produtos a serem removidos do estoque: ");
		quantidade =sc.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.printf("%ndados atualizados do produto: "+produto);
		
		sc.close();
	}

}
