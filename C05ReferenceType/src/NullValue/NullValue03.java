package NullValue;
/*
 * null value
 * null과 ""의 차이
 * 
 */
public class NullValue03 {

	public static void main(String[] args) {
		String hello1 = null; // 공백 값 입력
//		String hello1 = ""; // 공백 값 입력
		
		// 만약 null값이면 값을 넣어라 라는 명령어를 입력해줌
		if (hello1==null) {
			hello1 = new String("hello");
		}
		// 만약 값이 비어있으면 값을 넣어라 라는 명령어를 입력해줌
		if (hello1.isEmpty()) {
//			hello1="hello"
			hello1 = new String("hello");
		}
		
		int helloNullLen = hello1.length(); // 값 크기 확인
		boolean helloEmpty = hello1.isEmpty(); // 값 비어있는지 확인
		System.out.println("step2");
		System.out.printf("hello1: %s, length: %d\n" , hello1, helloNullLen);
		System.out.printf("hello1: %s, isEmpty: %b\n" , hello1, helloEmpty);
		
		
	}

}
