package exercise.exercise6;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		// 출력결과는 부모생성자 -> 자식 생성자 순
		// 				클래스 안에서는 기본 생성자가 this로 다른 생성자를 호출했기 때문에
								// 생성자 -> 기본생성자 순
	}

}
