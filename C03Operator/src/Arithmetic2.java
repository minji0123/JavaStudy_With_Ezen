/*
 * 산술연산자(+,-,*,/,%)
 * 더하기 빼기 곱하기
 */
public class Arithmetic2 {

	public static void main(String[] args) {
		
		// 1. 변수를 입력하면, 자동으로 넣어준 값이 출력된다.
		int a = 10; // a : 피연산자
		int b = 3;
		int c = a * b; // 연산식
		System.out.printf("c(%d) = a(%d) * b(%d)\n", c,a,b); 
		// c(30) = a(10) * b(3)
		
		int d = a * (-b); // 괄호 안해도 되지만 헷갈리지 않게 괄호해주기
		System.out.printf("d(%d) = a(%d) * b(%d)\n", d,a,b); 
		// d(-30) = a(10) * b(3)

		
		// 2. 마이너스 값을 정의하는 여러 방법
		int minus3 = -3;
		int e = a * minus3;
		System.out.printf("e(%d) = a(%d) * minus3(%d)\n", e,a,minus3);
		
		int minus = b * -1;
		System.out.printf(" minus(%d)\n", minus);
		
		// 4. 우선순위는 통상적인 연산과 같다.
		int g = c + a * b;
		System.out.printf("g(%d) = c(%d) + a(%d) * b(%d)\n", g,c,a,b);  
		int h = (c + a) * b;
		System.out.printf("h(%d) = c(%d) + a(%d) * b(%d)\n", h,c,a,b);
		
		
		
	}

}
