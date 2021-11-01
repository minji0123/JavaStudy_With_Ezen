/*
 * super()로 부모와 자식간 상속
 * - 부모가 가지고 있는 필드를, 자식도 동일한 이름으로 정의할 수 있다.
 * - 부모의 메소드를 통해서 
 * 
 *--------------------------------------------
 * 메소드 재정의
 * - 부모의 메소드 형식과 동일하게 이름의 파라미터를 재정의
 * 		- 부모의 메소드 형식과 동일하게 정의
 * - 자신의 필드값을 참조하게 된다.
 * 
 */
package family3;

public class Child extends Parent{
//	 * 부모 : money(100)
//	 * 자식 : money(0)
	int money; // 부모에게 정의가 되어있으면, 굳이 자식에서 정의하지 말자
	int estate = 3000; // 자식은 부모에게 없는 '부동산' 자산을 가지고 있다.
	
	
	// 1. 부모의 money(100)을 물려받음
	Child(){
		System.out.println("[Child()]");
	}
	
	// 2. 부모의 money(100)을 물려받음
	// super가 없다.
	Child(int money){
		System.out.printf("[Child(%d) : this.money = %d]\n",money, this.money);
		this.money = money;
	}
	
	// 3. 메소드 재정의 (메소드 오버라이딩)
	void print(String title) {
		System.out.println("<메소드 재정의>");
		System.out.println("child money : "+money);
	}
	
	// 4. super.부모속성
	void printTotal() {
		int total = this.money + this.estate + super.money + super.asset;
		System.out.println("-----------자식의 자산 토탈값-----------");
		System.out.println("자식 돈 : "+this.money);
		System.out.println("자식 부동산 : "+this.estate);
		System.out.println("부모한테 상속받은 돈 : "+super.money);
		System.out.println("부모한테 상속받은 금융자산 : "+super.asset);
		System.out.println("총 자산 : "+total);
	}
	
}
