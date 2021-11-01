package exercise20;

public class Account {
	private String age;
	private String owner;
	private int balance;
	
	public Account(String age, String owner, int balance) {
		this.age = age;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
