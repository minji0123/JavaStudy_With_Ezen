/*
 * 할당연산자(=)
 * - 데이터타입 변수 = 연산식
 */
public class AssignOper {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = y = x; 
		
		// 1. 할당 연산자 사용
		System.out.printf("x(%d), y(%d), z(%d) \n", x, y, z);
		// x(10), y(10), z(10) 
		
		
		// 2. 데이터타입을 바꿔서도 가능 (casting)
		float f = 3.1234f;
		float g = z = (int)f;
		System.out.printf("g(%f), z(%d), f(%f) \n", g, z, f);
		// g(3.000000), z(3), f(3.123400) 
		
		// 3. 한 데이터타입에 여러 변수 선언 가능
		int kor = 0, eng = 0, math = 0;
	}

}