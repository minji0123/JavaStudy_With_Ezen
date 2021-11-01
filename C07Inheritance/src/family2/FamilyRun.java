package family2;

public class FamilyRun {

	public static void main(String[] args) {

		// 1. 부모 생성자 -> 자식 생성자 순으로 호출됨
		// 기본 생성자이기 때문에 디폴트 super
		Child child1 = new Child();
		child1.print("child");
		
		// 2. 매개변수 생성자
		// 부모의 매개변수 생성자가 호출
		Child child2 = new Child(999);
		child2.print("child");
		
		
		
		

	}

}
