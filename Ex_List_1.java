/*Fazer um programa que lê um número inteiro n e 
 * depois os dadso id, nome e salario de n funcionários.
 * Não pode haver repetição de id.
 * Em seguida efetuar o aumento de X por cento no salario
 * de um dado funcionário. O programa deve ler um id e o 
 * valor X. Se o id não existir abortar o programa.*/

package entidades;

public class FuncionarioListOO {

	private Integer id;
	private String nome;
	private Double salario;

	public FuncionarioListOO() {

	}
	
	public FuncionarioListOO(Integer id, String nome, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void AumentarSalario(double percent) {
		salario += salario + salario * percent / 100.00;
	}

	@Override
	public String toString() {
		return "FuncionarioListOO [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
	}
	
	

}

package aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.FuncionarioListOO;

public class ProgramaListOO {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<FuncionarioListOO> list = new ArrayList<>();

		System.out.print("quantos funcionários serão registrados? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("funcionario #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine(); // buffer
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();

			FuncionarioListOO fun = new FuncionarioListOO(id, nome, salario);

			list.add(fun);
		}
		System.out.println("digite o id do funcionário que terá um aumento de salario: ");
		int idsalario = sc.nextInt();
		Integer pos = posicaoId(list, idsalario);
		if (pos == null) {
			System.out.println("esse id nao existe!");
		} else {
			System.out.println("digite a porcentagem de aumento: ");
			double percent = sc.nextDouble();
			list.get(pos).AumentarSalario(percent);
		}

		System.out.println();
		System.out.println("Lista de funcionarios");
		for (FuncionarioListOO fun : list) {
			System.out.println(fun);
		}

		sc.close();
	}

	public static Integer posicaoId(List<FuncionarioListOO> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;

	}

}
