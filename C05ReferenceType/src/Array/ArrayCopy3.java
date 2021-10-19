/*
 * 배열 복사 : System.arraycopy(Object src, int srcPos, 
 * 								Object dest, int destPos, 
 * 								int length);
 */
package Array;
// 복사한 배열이 서로 다른 주소를 가리키게 하기
public class ArrayCopy3 {

	public static void main(String[] args) {
	

		int []a = new int[] {1,3,5,7,9};
		int []b = new int[5];
		int []c = new int[5];
		int []d = new int[5];
		
		// 1. 배열을 출력하는 다른 방법 (: 사용)
		for (int colA : a) { // a 배열에서 하나씩 꺼내서  colA 에 하나씩 넣어줌
			System.out.printf("a[%d] ", colA);
		}
//		a[1] a[3] a[5] a[7] a[9]
		// 하지만 출력만 되고, 배열 값을 증감시키지는 못한다.
		
		// 1-1 배열 a를 c로 복사 후 출력하기
		System.out.println("배열 a를 c로 복사");
		System.arraycopy(a, 0, c, 0, a.length);
		
		for (int colC : c) {
			System.out.printf("c[%d] ", colC);
		}
//		c[1] c[3] c[5] c[7] c[9] 
		
		
	}

}
