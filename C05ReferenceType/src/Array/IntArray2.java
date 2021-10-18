/*
 * array : 배열 {}
 * -------------------------
 * 정적생성 : 컴파일 단계에서 생성, 확정적, static
 * 동적생성 : 실행 단계에서 생성, 가변적, dynamic
 * ---------------------------------------------
 * 배열의 선언:
 * 타입[] 변수 = { 초기값1, 초기값2, ... };
 * 타입[] 변수 = new 타입[길이] { 초기값1, 초기값2, ... };
 * 타입[] 변수 = new 타입[길이];
 */
package Array;

public class IntArray2 {

	public static void main(String[] args) {
		
		// 1. 배열 선언 및 값 할당
		// 1.1 배열 정적 생성
		int[] os = new int[] {1,3,5,7,9}; // 배열 정적 생성
		int[] es = null;
		
		
		// 2. 배열 출력
		System.out.println("홀수 : "+os.length);
//		System.out.println("짝수 : "+es.length); // null값이여서 출력 오류
		System.out.println("-----------------------------------");
		
		
		// 3. os배열 값 크기 출력
		for (int index = 0; index < 5; index++) {
			System.out.printf("index%d = [%d]\n", index,os[index]);
		}
		System.out.println("-----------------------------------");
		
		
		 // 4. 배열 null값 출력
//		for (int index = 0; index < 5; index++) {
//			System.out.printf("index%d = [%d]\n", index,es[index]);
//		}
		 // null값이여서 출력 오류
		
		
		// 5. 배열 동적 생성
		if(es == null) { // 동적 생성
			es = new int[os.length]; // os배열 값 크기만큼 es배열 생성
			// 얘네랑 같은 의미이다.
			// es = new int[] { 2, 4, 6, 8, 10 };
			// es = new int[5];
			for(int index=0; index < es.length; index++) { // es배열 값보다 작은 값일 동안에 작동
				es[index] = os[index] + 1; // (os 인덱스 값에 +1 해준)값을 배열에 할당하기
			}
		}
		System.out.println("짝수 : " + es.length); // es배열 값 크기 출력
		System.out.println("-----------------------------------");
		
		
		for(int index=0; index < es.length; index++) {// es배열 출력
			System.out.printf("짝수: index[%d] = [%d]\n", index, es[index]);
		}
		
	}

}
