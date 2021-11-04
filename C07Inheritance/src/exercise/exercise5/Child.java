package exercise.exercise5;

public class Child extends Parent{

	private int studentNo;
	
	// 1. super 연산자 특징
	// super 연산자는 매개값의 타입과 일치하는 부모 생성자를 호출한다.
	// 부모 생성자가 디폴트가 아니기 때문에, super 연산자를 만들어 줘야 한다.
//	public Child(String name, int studentNo) {
//		this.name = name;
//		this.studentNo = studentNo;
//	}
	
	public Child(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
		
	}
	

}
