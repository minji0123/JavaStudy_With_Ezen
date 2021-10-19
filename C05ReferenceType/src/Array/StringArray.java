/*
 * 배열 : 문자열
 */
package Array;

public class StringArray {

	public static void main(String[] args) {
		
		// 1. 문자열 배열 선언, 값 할당 및 출력
		String[] s1 = {"홍길동", "이순신", "강감찬"};
		System.out.println("s1.length : "+s1.length);
		// s1.length : 3
	
		// 2. for문으로 출력
		for (int cnt = 0; cnt<s1.length;cnt++) {
			System.out.printf("[%d] %s\n",cnt,s1[cnt]);
		}
//		[0] 홍길동
//		[1] 이순신
//		[2] 강감찬
			
		// 3. for문, :로 String배열 출력
		for (String str : s1) {
			System.out.printf("%s\n",str);
		}
//		홍길동
//		이순신
//		강감찬
	
		// 4. 배열 s1에 있는 값을 맨 끝부터 꺼내서 출력하기 _그냥 출력
		System.out.printf("[%d] %s\n", 2,s1[2]);
		System.out.printf("[%d] %s\n", 1,s1[1]);
		System.out.printf("[%d] %s\n", 0,s1[0]);
//		[2] 강감찬
//		[1] 이순신
//		[0] 홍길동
		
		
		
		// 4. 배열 s1에 있는 값을 맨 끝부터 꺼내서 출력하기 _for문으로 출력
		for (int cnt =s1.length-1; cnt>=0; cnt--) { // cnt가 0보다 크거나 같을 때까지 cnt를 줄여가면서 for문 실행
			// length에서 -1해준 이유는, 0부터 수가 시작하기 때문이다.
			System.out.printf("[%d] %s\n",cnt,s1[cnt]);
		}
//		[2] 강감찬
//		[1] 이순신
//		[0] 홍길동
		

		String h1 = new String("hello");
		String h2 = new String("hello");
		String h3 = "hello";
		String h4 = "hello";
		
		// 1. 
		// new 연산자로 선언한 string
		// ==로 비교
		if (h1==h2) {
			System.out.println("h1과 h2가 같다");
		}
		else {
			System.out.println("h1과 h2가 다르다");
		}
		// h1과 h2가 다르다

		
		// 2. 
		// new 연산자로 선언한 string
		// .equals로 비교
		if (h1.equals(h2)) {
			System.out.println("h1과 h2가 같다");
		}
		else {
			System.out.println("h1과 h2가 다르다");
		}
		// h1과 h2가 같다
		System.out.println();
		System.out.println();
		System.out.println();
		
		// 3. 
		// = 연산자로 선언한 string
		// ==로 비교
		if (h3==h4) {
			System.out.println("h3과 h4가 같다");
		}
		else {
			System.out.println("h3과 h4가 다르다");
		}
		// h3과 h4가 같다
		System.out.println();
		System.out.println();
		System.out.println();
		
		// 4. 
		// = 연산자로 선언한 string
		// .equals로 비교
		if (h3.equals(h4)) {
			System.out.println("h3과 h4가 같다");
		}
		else {
			System.out.println("h3과 h4가 다르다");
		}
		// h3과 h4가 같다
		
		String A = "aa";
		String a = "aa";
		A="bb";
		System.out.println("A : "+ A +", a : " + a);
		
		
	}

}
