package java_medio01.heranca01.entities;

public class BusinessAccount extends Account  {
	
	private Double loandLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String name, Double balance, Double loandLimit) {
		super(number, name, balance);
		this.loandLimit = loandLimit;
	}

	public Double getLoandLimit() {
		return loandLimit;
	}

	public void setLoandLimit(Double loandLimit) {
		this.loandLimit = loandLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loandLimit) {
			balance += amount - 10.0;
		}
	}
	
}
