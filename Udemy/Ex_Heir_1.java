//Suponha um negócio de banco que possui uma conta comum e uma conta para empresas,
//sendo que a conta para empresas possui todos os membros da conta comum, mais um
//limite de empréstimo e uma operação de realizar empréstimo. (Herança)

package entidades;

public class Account {
	
	private Integer number;
	private String holder;
	protected Double balance;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
}

package entidades;

public class BusinessAccount extends Account{
	
	private Double loanLimit;
	
	public BusinessAccount() {
		
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
}

package aplicação;

import entidades.BusinessAccount;

public class BusinessMain {

	public static void main(String[] args) {
		
		BusinessAccount account = new BusinessAccount();
		
		account.getBalance();
	}

}
