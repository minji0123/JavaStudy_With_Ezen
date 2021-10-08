/*
 * 비교연산자: ==, !=, >, >=, <, <=
 * 처리결과는 boolean
 * - EQ : 같다(==)
 * - NE : 같지안다(!=)
 * - GT : 크다(>)
 * - GE : 크거나 같다(>=) 
 * - LT : 작다(<)
 * - LE : 작거나 같다(<=)
 */
public class CompareOper {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.printf("a(%d), b(%d), c(%d)\n", a, b, c);
		// a(10), b(20), c(30)
		
		
		boolean equal = (a == b);
		boolean notEqual = (a != b);
		boolean big = (a > b);
		boolean bigEqual = (a >= b);
		boolean small = (c < b);
		boolean smallEqual = (b <= c);
		
		System.out.printf("boolean: eq(%b) = a(%d) == b(%d) \n", equal, a, b);
		System.out.printf("boolean: ne(%b) = a(%d) != b(%d) \n", notEqual , a, b);
		System.out.printf("boolean: gt(%b) = a(%d)  > b(%d) \n", big, a, b);
		System.out.printf("boolean: ge(%b) = a(%d) >= b(%d) \n", bigEqual, a, b);
		System.out.printf("boolean: lt(%b) = c(%d)  < b(%d) \n", small, c, b);
		System.out.printf("boolean: le(%b) = b(%d) <= c(%d) \n", smallEqual, b, c);
		

	}

}