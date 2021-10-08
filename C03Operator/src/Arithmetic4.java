/*
 * 산술연산자(+,-,*,/,%)
 * 몫 %
 */
public class Arithmetic4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		int c = a/b;
		int n = a%b;
		
		System.out.printf("몫 : c(%d) = a(%d) / b(%d)\n", c,a,b); 
		System.out.printf("나머지 : n(%d) = a(%d) %% b(%d)\n", n,a,b);  // %%로 적어야 한다. %하나만 입력하면 커맨드로 인식해서 오류
		
		
		// [문제] 나머지 연산자 (%) 를 쓰지 않고 나머지를 구하라.
		int x = a - (a / b * b);
		System.out.println(x);
		System.out.printf("연산자 사용안하고 나머지 구하기 : x(%d) = a(%d) -a(%d) / b(%d) * b(%d)\n", x,a,a,b,b);
	}

}
