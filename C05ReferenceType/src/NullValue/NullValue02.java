package NullValue;
/*
 * null value
 * - 빈 문자열 : ""
 * - 문자열에 빈 값을 할당하게 되면 힙영역에 빈 문자열 공간을 할당
 */
public class NullValue02 {

	public static void main(String[] args) {
		
		// 1. 공백값 할당
		String hello1 = ""; // 공백 값 입력
		System.out.printf("hello1 :%s\n ",hello1);			//		hello1 :
		System.out.println("hello1==null :"+(hello1==null));//		hello1==null : false
		System.out.println("hello1!=null :"+(hello1!=null));//		hello1!=null : true
		// 공백은 null이 아니다.

		
		// 2. 공백의 크기
		int helloNullLen = hello1.length(); // 값 크기 확인
		boolean helloEmpty = hello1.isEmpty(); // 값 비어있는지 확인
		System.out.println("step1");
		System.out.printf("hello1: %s, length: %d\n" , hello1, helloNullLen); // hello1: , length: 0
		System.out.printf("hello1: %s, isEmpty: %b\n" , hello1, helloEmpty); // hello1: , isEmpty: true
		
		// 만약 null값이면 값을 넣어라 라는 명령어를 입력해줌
		// 만약 값이 비어있으면 값을 넣어라 라는 명령어를 입력해줌
		if (hello1==null ||  hello1.isEmpty()) {
			hello1="hello";
		}
		
		// ****if 문을 통과했기 때문에 값을 다시 넣어줘야 한다.****
		helloNullLen = hello1.length(); // 값 크기 확인
		helloEmpty = hello1.isEmpty(); // 값 비어있는지 확인
		System.out.println("step2");
		System.out.printf("hello1: %s, length: %d\n" , hello1, helloNullLen); // hello1: hello, length: 5
		System.out.printf("hello1: %s, isEmpty: %b\n" , hello1, helloEmpty); // hello1: hello, isEmpty: false
	}

}
