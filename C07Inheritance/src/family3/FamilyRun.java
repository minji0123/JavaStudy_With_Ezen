package family3;

public class FamilyRun {

	public static void main(String[] args) {

		System.out.println("[]는 자식 생성자의 출력값");
		// 1. 부모의 money(100)을 물려받음
		Child ch1 = new Child();
		ch1.print("child");

		System.out.println();
		
		// 2. 부모의 money(100)을 물려받음
		// super가 없기 때문에! 400 적용이안됨
		Child ch2 = new Child(400);
		ch2.print("child");
		// 부모님 돈 얼마 있으신가요?? > 100원이 있어
		// 근데 저는 400원이 있는데 왜 0원이죠?? > 그건 아직 너돈이 아니야
		
		System.out.println();
		ch2.print();
		ch2.printTotal();
	}

}
