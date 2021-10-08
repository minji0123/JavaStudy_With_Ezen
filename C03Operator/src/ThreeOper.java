/*
 * 삼항연산자 : 
 * 변수 = (조건식) ? 참 식 : 거짓 식
 * 1. 조건식이 참이면 참의 값이 변수에 대입
 * 2. 조건식이 거짓이면 거짓의 값이 변수에 대입
 */
public class ThreeOper {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		boolean c = (a>b) ? true : false;
		System.out.printf("a(%d), b(%d), c(%b)\n",a,b,c);
		// a(10), b(20), c(false)
		
		String s = (a>b) ? "작다" : "크다";
		System.out.printf("a(%d), b(%d), s(%s)\n",a,b,s);
		// a(10), b(20), s(크다)
		
		int x = (a>b) ? (a - b) : (b - a);
		System.out.printf("a(%d), b(%d), x(%s)\n",a,b,x);
		// a(10), b(20), x(10)
	}

}
