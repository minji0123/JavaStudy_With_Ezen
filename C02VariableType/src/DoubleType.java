/*
 * 실수 double : 배정도 실수
 * 크기 : 8바이트,64비트 = 부호1비트 + 지수11비트 + 가수52비트
 * 범위 : 4.9E-324 ~ 1.7976931348623157E308
 * 최대 소수점 16자리까지
 */
// System.out.println("f1 : "+f1);
public class DoubleType {

	public static void main(String[] args) {
		double pi0 = 3.141592653589793; // 16자리
		double pi = 3.1415926535897932; // 17자리
		double pi1 = 3.14159265358979323; // 18자리
		double pi2 = 3.141592653589793238; // 19자리
		double pi3 = 3.1415926535897932384; // 20자리
		
		System.out.println("pi : "+pi);
		System.out.println("pi1 : "+pi1);
		System.out.println("pi2 : "+pi2);
		System.out.println("pi3 : "+pi3);
		
		double n7a = 1234567.0;
		double n7b = 0.1234567e7; //둘이 같은 뜻
		System.out.println("n7a : "+n7a);
		System.out.println("n7b : "+n7b);
		
		//double n10 = 40000000000; //정수형은 오류가 난다.
		

	}

}
