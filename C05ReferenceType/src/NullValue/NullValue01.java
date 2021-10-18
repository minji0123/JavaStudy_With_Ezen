package NullValue;
/*
 * null value
 * - 무효값
 * - 무효 literal
 * - 참조타입은 널(null)값을 가질 수 있다.
 * - 참조타입이 널값을 가질 때 : 스텍에만 할당됨. 힙 영역에는 할당되지 않음
 */
public class NullValue01 {

	public static void main(String[] args) {
		
		// 1. null값 할당
//		int a = null; // 기본 타입에는 null값을 할당할 수 없음.
		String hello1 = null; // 참조 타입에는 null값을 할당할 수 있음
		String hello2;  // 모든 변수는 초기값을 줘야 한다.
		
		System.out.println("hello1 : "+hello1);				//		hello1 : null
		System.out.println("hello1==null : "+(hello1==null));//		hello1==null : true
		System.out.println("hello1==null : "+(hello1!=null));//		hello1==null : false
//		System.out.println("hello2 : "+hello2); // 모든 변수는 초기값을 줘야 한다. 에러

		
		// 2. String null값의 크기1
//		int helloNullLen = hello1.length();
//		System.out.printf("hello1: %s, length: %d\n " , hello1, helloNullLen);
//		에러 : NullPointerException
		// null값은 크기가 없어서 오류가 난다.

		
		// 3. String null값의 크기2
		// 만약 null값이면 값을 넣어라 라는 명령어를 입력해줌
		if (hello1==null) {
			hello1="hello";
		}
		int helloNullLen = hello1.length(); // 여기서 크기를 알 수 있게 변수 설정해줌
		System.out.printf("hello1: %s, length: %d\n " , hello1, helloNullLen);
//		hello1: hello, length: 5
		
	}

}
