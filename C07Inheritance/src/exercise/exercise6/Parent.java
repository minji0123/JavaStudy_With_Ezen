package exercise.exercise6;

public class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국"); // 다른 생성자를 호출하는 this
		System.out.println("Parent() call");
	}
	
	public Parent(String name) {
		this.nation = nation;
		System.out.println("Parent(nation) call");
	}
}
