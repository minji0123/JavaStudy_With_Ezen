/*
 * String 문자열 : 기본타입은 아니지만 기본타입처럼 사용
 *  - 문자열을 다루도록 자바에 기본적으로 제공하는 클래스
 *   - 문자열은 문자 (char) 들의 집합
 *   - 큰따음표 (") 로 양쪽을 묶음 
 */

/*
 * String은 참조타입
 *  - String 변수는 참조 변수
 *  - String 변수의 각 문자 char 를 개별적으로 바꿀 수가 없다.
 *  
 */
public class StringType {

	public static void main(String[] args) {
		String empty = "";
		String name = "홍길동";
		String alphabet = "ac";
		
		System.out.println("empty : "+empty);
		System.out.println("name : "+name);
		System.out.println("alphabet : "+alphabet);
		
	}

}
