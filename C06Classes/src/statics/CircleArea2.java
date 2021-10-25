/*
 * 원의 넓이를 구하는 클래스
 * 원넓이 : ㅠr^2
 */
package statics;

public class CircleArea2 {
	static float PI = 3.141592f;
	// 정적 변수에는 초기값을 주고 시작한다.
	static int COUNTCREATION=-1; // 객체 생성 개수(정적)
	float radius;
	float area;
	int count; // 객체 생성 개수(변수)
	
	// static블럭
	// static블럭에서 초기값을 줄 수 있다.
	static{
		PI =3.141592f;
		COUNTCREATION=-1;
	}
	
	CircleArea2(float radius){
		this.radius = radius;
		CircleArea2.COUNTCREATION++; // 상수 카운트
		count++; // 변수 카운트
		
		// 생성자에서 메서드 호출
//		area();
	}
	
	int getCount() {
		return this.count;
	}
	
	float area() {
		this.area = radius*radius*PI;
		return this.area;
	}
	
	void print(String title) {
		System.out.println("--------------CircleArea : " + title+"--------------");
		System.out.println("(반지름) : "+ this.radius);
		System.out.println("(원넓이) : "+ this.area);
		System.out.println("(카운트_변수) : "+ this.count);
		System.out.println("(카운트_정적) : "+ CircleArea2.COUNTCREATION);
	}
	
	static void printStatic(String title) {
		// static과 this는 함께 사용하지 못한다.
		// new하지않고 사용할 수 있기 때문이다.
		System.out.println("--------------CircleArea : " + title+"--------------");
//		System.out.println("(반지름) : "+ this.radius);
//		System.out.println("(원넓이) : "+ this.area);
//		System.out.println("(카운트_변수) : "+ this.count);
		System.out.println("(카운트_정적) : "+ CircleArea2.COUNTCREATION);
	}
	
	// 메소드오버로딩
	static void printStatic(CircleArea2 circle, String title) {
		System.out.println("--------------CircleArea : " + title+"--------------");
//		System.out.println("(반지름) : "+ this.radius);
//		System.out.println("(원넓이) : "+ this.area);
//		System.out.println("(카운트_변수) : "+ this.count);
		System.out.println("(카운트_정적) : "+ CircleArea2.COUNTCREATION);
	}
	
}
