package family2;

public class Parent {
	
	int money = 100;
	int asset = 0;

	Parent(){
		System.out.println("Parent()");
		
	}
	Parent(int money){
		this.money = money;
		System.out.printf("Parent_int(%d)", money);
	}
	Parent(String money){
		this.money = Integer.parseInt(money);
		System.out.printf("Parent_String(%d)", money);
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
