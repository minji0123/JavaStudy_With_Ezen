package NullValue;
/*
 * null value
 * null과 ""의 차이
 * 
 */
public class NullValue04 {

	public static void main(String[] args) {
		
		// 1. 변수 선언
		String hello1 = null; // null값 입력
//		String hello1 = ""; // 공백 값 입력
		String hello2 = hello1; // hello2 = null
		System.out.println("$ hello1 == hello2 : "+ (hello1 == hello2)); // $ 여기서는 hello1과 hello2가 같다고 나오지만
		// =로 값을 할당하면 같은 값을 가리키게 되기 때문에 같다고 나온다.
		
		
		// 2. null일때 hello값 할당
		if (hello1==null || hello1.isEmpty()) {
//			hello1="hello";
			hello1 = new String("hello");
		}
//		System.out.println(" >>>hello = new String(\"hello\")");
		// new로 값 할당
		
		
		// 3. 변수의 값 크기, 값 유무 확인
		int helloNullLen = hello1.length(); // 값 크기 확인
		boolean helloEmpty = hello1.isEmpty(); // 값 비어있는지 확인

		System.out.printf("hello1: %s, length: %d\n" , hello1, helloNullLen); // hello1: hello, length: 5
		System.out.printf("hello1: %s, isEmpty: %b\n" , hello1, helloEmpty); // hello1: hello, isEmpty: false
		System.out.println("$ hello1 == hello2 : "+ (hello1 == hello2)); // $ 여기서는 hello1과 hello2가 다르다고 나온다.
		// new로 값을 할당하면 다른 값을 가리키게 되기 때문에 다르다고 나온다.
		
		
	}

}
