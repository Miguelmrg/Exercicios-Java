/*Fazer um programa para ler os dados de um funcionário(nome, salario bruto e imposto). 
Em seguida, mostrar os dados do funcionário(nome e salário líquido). 
Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada
(somente o salário bruto é afetado pela porcentagem) 
e mostrar novamente os dados do funcionário.*/

package entidades;

public class Funcionario {
	public String nome;
	public double salario;
	public double imposto;
	
	public double SalarioPosImposto() {
		return salario - imposto;
	}
	
	public void Aumento(double porcentagem) {
		salario += salario * (porcentagem/100);
	}
	public String toString() {
		return nome 
		+ ", $ " 
		+ String.format("%.2f", SalarioPosImposto());
	}
}

package aplicação;

import java.util.Locale;
import java.util.Scanner;
import entidades.Funcionario;

public class ProgramaSalario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Funcionario func = new Funcionario();
		
		System.out.println("Nome: ");
		func.nome = sc.next();
		System.out.println("Salário bruto: ");
		func.salario = sc.nextDouble();
		System.out.println("Imposto: ");
		func.imposto = sc.nextDouble();
		
		func.toString();
		
		System.out.printf("Funcionario: "+func+"%n");
		
		System.out.println("Porcentagem de aumento: ");
		double porcentagem = sc.nextDouble();
		func.Aumento(porcentagem);
		
		System.out.println("Dados atualizados: "+func);
		sc.close();
		
	}

}
