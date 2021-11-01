package family;

public class FamilyRun {

	public static void main(String[] args) {
		// 1. 자식은 부모의 메소드 print()를 사용가능하다.
		Child child = new Child();
		child.print("child");
		
		System.out.println("Parent.money : "+child.money);
		
		// 2. 부모 인스턴스 생성
		Parent parent = new Parent();
		parent.print("parent");
		
		// 3. 부모와 자식은 힙 메모리의 다른 방향을 가리킨다.
		// 따라서 서로 다른 객체이다.
		boolean eq = (parent == child);
		boolean e1 = (parent.equals(child));
		boolean e2 = (parent.eqObject(child));
		boolean e3 = (parent.eqMoney(child));
		boolean e4 = (parent.eqAsset(child));
		System.out.println("부모와 자식은 같은 객체입니까? (==): "+eq);
		System.out.println("부모와 자식은 같은 값입니까? (.equals): "+e1);
		System.out.println("부모와 자식은 같은 값입니까? (.equals): "+e2);
		System.out.println("부모와 자식은 같은 값입니까? (this.변수비교): "+e3);
		System.out.println("부모와 자식은 같은 값입니까? (this.변수비교): "+e4);
		System.out.println();
		
		// 3-1 equals로 비교해도 false가 나오는 이유
		// Object로부터 상속받은 equals는 무조건 false
			// .equals 메소드는 Object클래스의 메소드이다.
		// 3-2 해결방법
		// this로 직접 멤버변수로 접근하면 값을 비교할 수 있음
		// 메소드 오버라이딩으로 값을 비교할 수 있음
		
		Child child2 = new Child();
		boolean eq2 = (child == child2);
		System.out.println("child와 child2는 같은 객체입니까? : "+eq2);
		
		String str = "hello";
		boolean sq = str.equals("hello");
		System.out.println("str.equals(\"hello\") : " +sq);
	}

}
