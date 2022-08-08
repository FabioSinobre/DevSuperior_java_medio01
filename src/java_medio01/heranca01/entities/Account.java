package java_medio01.heranca01.entities;

public class Account {
	private Integer number;
	private String name;
	protected  Double balance;
	
	public Account() {
	}

	public Account(Integer number, String name, Double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(Double balance) {
		balance += balance;
	}
	public void withdraw(Double balance) {
		balance -= balance;
	}
	
	
	
}
