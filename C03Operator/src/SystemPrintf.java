/*
 * System.out.printf(format. arguements);
 * public PrintStream printf(String foramt, Object ...args){}
 * Object : 자바의 최상위 객체
 * -------------------------------------------------------------
 * %n : 줄바꿈
 * \n : 줄바꿈
 * %s : String
 * %d : Integer(byte, short, int, long)
 * %f : float, double
 * %o : 8진수
 * %x : 16진수
 * %b : boolean
 * %e : 지수 (exponent)
 * %t : date, time
 */
public class SystemPrintf {

	public static void main(String[] args) {
//		System.out.printf("System.out.printf(...)\n");
//		System.out.println("System.out.println(...)");

		
		String name = "홍길동";
		int number = 12345;
		float fNumber = 3.141592f;
		double dNumber = 0.1234567890123456;
		float fExponent = 0.1234e4f;
		boolean trueFalse = true;
		boolean falseTrue = false;
		
		System.out.printf("String : (%s)%n", number);
		
		System.out.printf("10진수Decimal : (%d)%n", number);
		System.out.printf(" 8진수Decimal : (0%o)%n", number);
		System.out.printf("16진수Decimal : (0x%x)%n", number);
//		System.out.printf("16진수Decimal대문자 : (0x%x)%n", number16);
		
		System.out.printf("float : (%f)%n", fNumber);
		System.out.printf("double : (%f)%n", dNumber);
		System.out.printf("floatExponent : (%e)%n", fNumber);
		System.out.printf("doubleExponent : (%e)%n", dNumber);
		System.out.printf("floatExponent : (%e)%n", fExponent);
		
		System.out.printf("boolean : (%b)%n", trueFalse);
		System.out.printf("boolean : (%b)%n", falseTrue);

				
	}

}
