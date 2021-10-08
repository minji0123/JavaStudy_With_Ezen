/*
 * 복합대입연산자: 
 *   : +=, -=, *=, /=, %=
 *   : &=, ^=, |=, <<=, >>=, >>>=
 * 
 * 
 */
public class MultiEqualOper2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 1;
		
		// 1. +=
		c = c + a;
		System.out.printf("c(%d)\n", c); // c(11)
		c += a;
		System.out.printf("c(%d)\n", c); // c(21)
		
		int x = 0;
		x = x + 2;
		x += 2;
		System.out.printf("x(%d)\n", x); // x(4)
		x -= 3;
		System.out.printf("x(%d)\n", x); // x(1)
		x *= 10;
		System.out.printf("x(%d)\n", x); // x(10)
		x /= 3;
		System.out.printf("x(%d)\n", x); // x(3)
		x %= 3;
		System.out.printf("x(%d)\n", x); // x(0)

		
		// x(0)
		x++; // x=1
		x++; // x=2
		x = x + 2;
		x += 2;
		System.out.printf("x(%d)\n", x); // x(6)
		
		x *= a + b; // x = x * (a + b)
		System.out.printf("x(%d) *= a(%d) + b(%d)\n", x, a, b);
		// x(180) *= a(10) + b(20)
		
	}

}