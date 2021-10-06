// 실수형(float)
// 4바이트 : 부호1비트, 지수1비트, 가수23비트 :32비트
// 범위 : 1.4E-45 ~ 3.4028235E38
// 최대 소수점 8자리까지
public class FloatType {

	public static void main(String[] args) {
		float pi = 3.14159f;
		float pI = 3.14159f;
		
		System.out.println("pi : " +pi);
		System.out.println("pI : " +pI);
		
		float f8 = 0.12345678f;
		float f9 = 0.123456789f;
		float f9a = 0.123456784f;
		float f9b = 0.123456785f;
		float f9c = 0.123456786f;
		
		
		System.out.println("f8 : " +f8);
		System.out.println("f9 : " +f9);
		System.out.println("f9a : " +f9a);
		System.out.println("f9b : " +f9b);
		System.out.println("f9c : " +f9c);
		
		float fx1 = 12345.12345678f;
		System.out.println("fx1 : " +fx1);
	}

}
