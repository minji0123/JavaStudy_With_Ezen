/*
 * 패키지 : 
 * 같은 패키지 안에 있는 클래스는 import 하지 않고 사용할 수 있다.
 * 접근제한자가 없어도 (default)여도 사용할 수 있다.
 */
package calc;

public class CalcMain {
	
	// calc1을 생성해줌
	// 기본 생성자를 호출한 인스턴스
	// 메소드 step1을 실행해 주기 위한 인스턴스
//	Calc calc1 = new Calc();
	
	// calc2를 생성해줌
	Calc calc2;

	CalcMain(){
		System.out.println("2. CalcMain()");
		calc2 = new Calc();
	}
	
	// 메소드 main
	public static void main(String[] args) {
		System.out.println("1. CalcMain : main");
		CalcMain calcMain = new CalcMain();
		calcMain.calc2.plus(99);
		
//		System.out.println(calcMain.calc2.total);
		System.out.println(Calc.calcStatic(calcMain.calc2));
		
		
//		calc.step1();
//		calc.step2();
//		calc.step3();
//		calc.step4();
		calcMain.step4();
		
	}

	void step1() {
		System.out.println("[step1]");
		calc2.plus(10);
		calc2.minus(5);
		calc2.multiple(4);
		calc2.divide(3);
		int total1 = calc2.mod(4);
		int total2 = calc2.total();
		calc2.print();
		
		System.out.println("total1 : "+total1 + ", total2 : "+ total2);

	}
	
	void step2() {
		System.out.println("[step2]");
		calc2.plus(20);
		calc2.print();
		
		calc2.clear();
		calc2.plus(50);
		calc2.print();
		
		System.out.println("calc.total : " + calc2.total);
		System.out.println("calc.total() : " + calc2.total());
	}
	
	void step3() {
		calc2.clear();
		int[] values = {1,2,3,4,5,6,7,8,9,10};
		calc2.sum(values);
		calc2.print("[step3] 배열 덧셈");
		
		calc2.sum(new int[] {1,2,3,4,5,6,7,8,9,10});
		calc2.print("[step3] 배열 덧셈");		

	}

	void step4() {
		calc2.clear();
		calc2.sums(1,3,5,7,9);
		calc2.print("[step4] 가변인자 덧셈");	
		
		calc2.clear();
		calc2.sums(new int[] {1,2,3,4,5,6,7,8,9,10});
		calc2.print("[step4] 가변인자 덧셈");
	}


}

