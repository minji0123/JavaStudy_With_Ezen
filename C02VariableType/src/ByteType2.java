
public class ByteType2 {
	public static void main(String[]args) {
		
		byte minus = -128;
		byte plus = 127;
		byte plus2;
		// byte 값의 범위를 벗어나면 빨간 줄로 오류가 표시된다.
		// byte plus128 = 128;
		// plus = plus + 1;
		
		// 이렇게 하면 빨간 줄로 오류가 표시되지 않는다.
		// 출력하면 -128이 나온다.
		plus2 = (byte)(plus + 1); 
		
		// 데이터 타입을 int로 변경해주면 오류가 나지 않는다.
		// 출력 값 범위가 달라졌기 때문이다.
		// int 는 4바이트이기 때문에 출력할 수 있다.
		int plus3 = plus+1;
		
		
		System.out.println("> minus (-128)  : " + minus);
		System.out.println(">   plus (127)  : " + plus);
		System.out.println(">   plus2 (byte): " + plus2);
		System.out.println(">   plus3 (int) : " + plus3);
		
		byte plusone = (byte)(plus +1);
		byte minusone = (byte)(minus -1);
		
		System.out.println("plusone : " + plusone);
		System.out.println("minusone : " + minusone);
	}
}
/*
 * 127+1 = -128이 나오는 이유
 * +127 : 0111 1111
 *      : 		  1
 *-----------------------
 * 		  1000 0000       
 *-----------------------
 *    2 : 0000 0010
 *    1 : 0000 0001
 *    0 : 0000 0000
 *   -1 : 1111 1111 
 *   -2 : 1111 1110
 * -127 : 1000 0001
 * -128 : 1000 0000
*/