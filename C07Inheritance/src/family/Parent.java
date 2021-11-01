package family;

public class Parent {
	
	int money = 100;
	int asset = 0;

	Parent(){}
	Parent(int money){
		this.money = money;
	}
	Parent(String money){
		this.money = Integer.parseInt(money);
	}
	
	
	void print(String title) {
		if (this.money == 0) {
			return;
		}
		System.out.println("Parent "+title + " : "+ this.money);
	}
	int print() {
		System.out.println("Parent notitle : "+ this.money);
		return this.money;
	}
	
	boolean eqObject(Parent parent) {
		return (this == parent);
	}
	
	boolean eqMoney(Parent parent) {
		return (this.money == parent.money);
	}
	
	boolean eqAsset(Parent parent) {
		return (this.asset == parent.asset);
	}
}
