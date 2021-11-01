/*
 * super();
 * - 부모의 생성자를 명시적으로 호출
 * - 그러나 명시하지 않으면 부모의 디폴트 생성자가 호출됨
 * - super()는 생성자에서 가장 먼저 기술되어야 함
 */
package family2;

public class Child extends Parent{
	Child(){
		// 1. 기본 생성자일 때 super
		// 부모의 생성자를 명시적으로 호출
		super();
		System.out.println("Child()");
	}
	
	
	Child(int money){
		// 2. 매개변수 생성자일 때 super
		// 마찬가지로 부모의 생성자를 명시적으로 호출
		super(money);
		System.out.printf("Child(%d)\n",money);
//		this.money = money;
		
		
	}
	
}
