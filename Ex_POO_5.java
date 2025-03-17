/*Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do titular da conta, 
e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito inicial, entretanto, é opcional, 
ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua conta, o depósito inicial não será feito e o saldo 
inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já o nome do titular pode 
ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso. O saldo só aumenta 
por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado, o banco cobra uma taxa de $5.00. 
Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não informado o valor de depósito 
inicial. Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados da conta após cada operação.*/

package entidades;

public class Banco {
	private int numConta;
	private String nomeTitular;
	private double saldo;
	
	public Banco(int numConta, String nomeTitular) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}

	public Banco(int numConta, String nomeTitular, double depositoInicial) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}

	public int getNumConta() {
		return numConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double quantia) {
		saldo += quantia;
	}
	
	public void saque(double quantia) {
		saldo -= quantia +5.0;
	}
	
	public String toString() {
		return "Conta: "
				+ numConta
				+ ", Titular: "
				+ nomeTitular
				+ ", Saldo: $ "
				+ String.format("%.2f", saldo);
	}
}

package aplicação;

import java.util.Locale;
import java.util.Scanner;

import entidades.Banco;

public class ProgramaBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco conta;
		
		System.out.print("Digite o número da conta: ");
		int numConta = sc.nextInt();
		System.out.print("Digite o nome do titular: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		System.out.println("Há depósito inicial?(y/n)");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y') {
			System.out.print("Digite o valor do depósito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Banco(numConta, nomeTitular, depositoInicial);
		} 
		else {
			conta = new Banco(numConta, nomeTitular);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor do depósito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Dados atualizados: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor do saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Dados atualizados: ");
		System.out.println(conta);
		
		sc.close();
	}

}
