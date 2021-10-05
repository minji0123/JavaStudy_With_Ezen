/*
 * 바이트 타입 (byte type)
 * 1바이트 단위 : -128~127 값을 저장할 수 있는 공간
 */

public class ByteType { // 대문자로 적는다. 소스코드 파일 이름과 class 이름이 같아야 한다.

	public static void main(String[] args) { // main 진입점, 진입함수
		// TODO Auto-generated method stub

	// 1. 자료형 byte.
		// 자료형 변수이름 =(할당연산자) 값;
		// 자료형으로 그릇을 만들고, 변수로 그릇이름을 만들어주고, 그 그릇에 값을 집어넣는다.
		byte zero = 0;
		byte minus = -128;
		byte plus = 127;
		byte abc = 123;
		// 그릇에 값을 안넣을 수도 있지만 출력이 되지 않는다.
		byte b1;
		b1 = 11;
		
		// 여러 변수들을 선언할 수도 있다.
		// 앞에서 선언했던 변수를 그대로 값에 넣을 수도 있다.
		byte b2, b3; 
		b2 = zero; 
		b3 = abc;
		
		
		byte x1 = 99;
		System.out.println("x1 : " + x1);
		byte b4 = b1;
		x1 = b4;
		System.out.println("x1 : " + x1);
		
	// 2. 출력 println
		System.out.println("---------------------------");
		System.out.println("zero : " + zero); // "zero : " 문자열 리터럴
		System.out.println("minus : " + minus);
		System.out.println("plus : " + plus);
		System.out.println("abc : " + abc);
//		System.out.println(b1); // 값을 지정(초기화)하지 않았기 때문에 출력할 수 없다.
		System.out.println("b1 : " + b1); // 나중에 따로 값을 넣어주면 출력할 수 있다.
		System.out.println("b2 : " + b2); 
		System.out.println("b3 : " + b3); 
		
		/*
		 - 숫자는 연산의 의미를 갖고 있다.
		 - 숫자를 출력하면, 연산의 의미가 사라지기 때문에 문자열로 변환이 된다.
		 - 문자열 리터럴과 만나면, 숫자가 문자열로 변환된다.
		 - println 은 값을 출력가능한 문자열로 변환한다.
		 	10 + 23 = 33
		 	"10" + "23" = "1023"
		 	"zero" + "0" = "zero0"
		*/
		
	// 3. println 과 print 의 차이
//		System.out.print(zero);
//		System.out.print(",");
//		System.out.print(minus);
//		System.out.print(",");
//		System.out.print(plus);
//		System.out.print(",");
//		System.out.print(abc);
//		System.out.print(",");
//		System.out.print(b1);
//		System.out.print(",");
//		System.out.print("9999");
		
		
	}

}
