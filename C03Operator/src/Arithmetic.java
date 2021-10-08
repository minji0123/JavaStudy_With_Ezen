/*
 * 산술연산자(+,-,*,/,%)
 */
public class Arithmetic {

	public static void main(String[] args) {
		
		// 1. 변수를 입력하면, 자동으로 넣어준 값이 출력된다.
		int a = 10; // a : 피연산자
		int b = 20;
		int c = a + b; // 연산식
		System.out.printf("c(%d) = a(%d) + b(%d)\n", c,a,b); 
		// c(30) = a(10) + b(20)
		
		
		// 2. 값을 바로 입력해도 상관없다.
		int d = c-40;
		int f = a + b + c - (-10); // 괄호 안해도 되지만 헷갈리지 않게 괄호해주기
		System.out.printf("d(%d) = c(%d) - (%d)\n", d,c,40); 
		System.out.printf("f(%d) = a(%d) + b(%d) + c(%d) - (%d)\n", f,a,b,c,-10);
		// d(-10) = c(30) - (40)
		// f(70) = a(10) + b(20) + c(30) - (-10)
		
		
		// 3. 변수를 재사용할 수 있다. 여기서는 변수 e 를 재사용했다.
		int e = a + b + c + d; 
		System.out.printf("e(%d) = a(%d) + b(%d) + c(%d) + d(%d)\n", e,a,b,c,d);
		// e(50) = a(10) + b(20) + c(30) + d(-10)
		e = a + b + c - d;
		System.out.printf("e(%d) = a(%d) + b(%d) + c(%d) - d(%d)\n", e,a,b,c,d);  
		// e(70) = a(10) + b(20) + c(30) - d(-10)
		
		
		// 4. 우선순위는 통상적인 연산과 같다.
		int g = a - b + c;
		System.out.printf("g(%d) = a(%d) - b(%d) + c(%d)\n", g,a,b,c);  
		// g(20) = a(10) - b(20) + c(30)
		int i = b - c + a;
		int j = a + (b - c);
		System.out.printf("i(%d) = b(%d) - c(%d) + a(%d)\n", i,b,c,a);  
		System.out.printf("j(%d) = a(%d) + b(%d) - c(%d)\n", j,a,b,c); 
		// i(0) = b(20) - c(30) + a(10)
		// j(0) = a(10) + b(20) - c(30)
		int bc = b - c;
		int abc = a + bc;
		System.out.printf("bc(%d), abc(%d)\n",bc,abc); 
		// bc(-10), abc(0)
		
	}
}
