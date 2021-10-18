/*
 * array : 배열 {}
 * 값 목록으로 배열 선언
 */
package Array;

public class IntArray {

	public static void main(String[] args) {
		int[] odd = {1,3,5,7,9};
		int[] even = {2,4,6,8};
		
		
		// 1. 배열을 그냥 출력하면 주소값이 나온다.
		System.out.println("홀수 : "+odd);
		System.out.println("짝수 : "+even);
//		홀수 : [I@7d6f77cc
//		짝수 : [I@5aaa6d82

		// 2. 배열을 출력하고 싶으면 f로 값을 지정해주고 출력한다.
		System.out.printf("홀수 : [%d][%d][%d][%d][%d]\n", odd[0],odd[1],odd[2],odd[3],odd[4]);
		System.out.printf("짝수 : [%d][%d][%d][%d]\n",even[0],even[1],even[2],even[3]);	

		// 3. 배열 안 값 개수 출력
		System.out.println("홀수 : "+odd.length);
		System.out.println("짝수 : "+even.length);
		
		// 4. 배열 개수에 맞지 않는 수로 출력하게 되면 오류가 난다.
//		System.out.printf("짝수 : [%d]\n"even[4]);
//		System.out.printf("짝수 : [%d]\n"even[-1]);
		
		
		// 5. for 문으로 배열 출력
		for (int index = 0; index < 5; index++) {
			System.out.printf("index%d = [%d]\n", index,odd[index]);
		}

		for (int index = 0; index < odd.length; index++) { // odd.length => odd의 크기보다 크면 종료
			System.out.printf("index%d = [%d]\n", index,odd[index]);
		}
	}

}
