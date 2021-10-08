/*
 * 산술연산자(+,-,*,/,%)
 * 나누기
 */
public class Arithmetic3 {

	public static void main(String[] args) {

		// 1. 변수를 입력하면, 자동으로 넣어준 값이 출력된다.
		int a = 10; // a : 피연산자
		int b = 3;
		int int1 = a / b; // 연산식
		System.out.printf("c(%d) = a(%d) / b(%d)\n", int1,a,b); 
		// c(3) = a(10) / b(3)
		
		int e = int1 * b;
		System.out.println("e : " +e); 
		System.out.printf("e(%d) = c(%d) * b(%d)\n", e,int1,b); 
		// e(9) = c(3) * b(3)

		// 2. 소수점이 잘리는 이유
		// 계산 결과가 정수를 실수로 대입해서, 소수점 이하가 소실됨
		float float1 = a / b;
		System.out.println("float1 : " +float1); 
		System.out.printf("float1(%f) = c(%d) * b(%d)\n", float1,a,b); 
	  	// float1 : 3.0
  		// float1(3.000000) = c(10) * b(3)
		float float2 = (float)(a / b);
		System.out.println("float2 : " +float2); 
		System.out.printf("float2(%f) = c(%d) * b(%d)\n", float2,a,b); 
		// float2 : 3.0
		// float2(3.000000) = c(10) * b(3)
		
		
		// 소수점 이하를 소실되지 않게 하려면 변수 각각에 float 선언을 해줘야 한다.
		// 정수형을 실수형으로 변환 casting 해야 한다.
		float float3 = (float)a / (float)b;
		System.out.println("float3 : " +float3); 
		System.out.printf("float3(%f) = c(%d) * b(%d)\n", float3,a,b); 
		// float3 : 3.3333333
		// float3(3.333333) = c(10) * b(3)
		float float4 = (float)a / b;
		System.out.println("float4 : " +float4); 
		System.out.printf("float4(%f) = c(%d) * b(%d)\n", float4,a,b); 
		// float4 : 3.3333333
		// float4(3.333333) = c(10) * b(3)
		float float5 = 10.0f / 3;
		System.out.println("float5 : " +float5); 
		System.out.printf("float5(%f) = c(%d) * b(%d)\n", float5,a,b); 
		// float5 : 3.3333333
		// float5(3.333333) = c(10) * b(3)
		float float6 = 10 / 3.0f;
		System.out.println("float6 : " +float6); 
		System.out.printf("float6(%f) = c(%d) * b(%d)\n", float6,a,b); 
		// float6 : 3.3333333
		// float6(3.333333) = c(10) * b(3)
		
		
	}

}
