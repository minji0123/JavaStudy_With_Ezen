// short 단정도 정수
// 2바이트 (16비트)
// 범위 : -32768 ~ 32767
public class ShortType {

	public static void main(String[] args) {
		short minShort = -32768;
		short maxShort = 32767;
		short abc = 12345;
		
		System.out.println("minshort : " + minShort);
		System.out.println("maxshort : " + maxShort);
		System.out.println("abc : " + abc);
		
		// 오류뜬다
		// short maxone = maxshort + 1;
		
		// 괄호는 연산자의 우선순위를 결정해준다.
		// 이렇게 출력하면 byte 처럼 -32768이 출력된다.
		short maxOne = (short) (maxShort + 1);
		System.out.println("maxOne : " + maxOne);

	}

}
