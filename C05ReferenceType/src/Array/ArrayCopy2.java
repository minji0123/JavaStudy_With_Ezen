/*
 * 배열 복사 : System.arraycopy(Object src, int srcPos, 
 * 								Object dest, int destPos, 
 * 								int length);
 */
package Array;
// 복사한 배열이 서로 다른 주소를 가리키게 하기
public class ArrayCopy2 {

	public static void main(String[] args) {
	
		// 1. 배열 복사 (a배열과 b배열이 서로 다른 주소를 가리키게 함)
		int []a = new int[] {1,3,5,7,9};
		int []b = new int[5];
		int []c = new int[5];
		int []d = new int[5];
		
		// 1-1 b배열과 a배열은 같다.
		for (int cnt=0; cnt<a.length;cnt++) {
			b[cnt] = a[cnt] ; 
			System.out.printf("a%d : %d, ", cnt,a[cnt]);
			System.out.printf("b%d : %d\n", cnt,b[cnt]);
		}
		// 1-2 배열 b를 짝수로 변경
		System.out.println("배열 b를 짝수로 변경");
		for (int cnt=0; cnt<a.length;cnt++) {
			b[cnt] +=1;
			System.out.printf("a%d : %d, ", cnt,a[cnt]);
			System.out.printf("b%d : %d\n", cnt,b[cnt]);
		}
		// 이렇게 하면 배열 두개가 다른 주소를 가리킨다.
		// for문을 사용하지 않으면서 배열을 복사하려면 어떻게 해야 할까??
	
		
		
		// 2. 배열 b를 배열 c로 복사
		// System.arraycopy(b, 0, c, 0, b.length);를 사용하면 된다.
		
//		System.out.println("배열 b를 배열c로 복사");
//		System.arraycopy(b, 0, c, 0, b.length);
//		for (int cnt=0; cnt<a.length;cnt++) {
////			c[cnt]++; // c의 값을 1씩 증가
//			System.out.printf("b%d : %d, ", cnt,b[cnt]);
//			System.out.printf("c%d : %d\n", cnt,c[cnt]);
//		}
		
		// 2-1 배열 b를 배열 c로 복사후 c의 값을 1씩 증가
		System.out.println("배열 b를 배열c로 복사 후 c의 값을 1씩 증가");
		System.arraycopy(b, 0, c, 0, b.length);
		for (int cnt=0; cnt<a.length;cnt++) {
			c[cnt]++; // c의 값을 1씩 증가
			System.out.printf("a%d : %d, ", cnt,a[cnt]);
			System.out.printf("b%d : %d, ", cnt,b[cnt]);
			System.out.printf("c%d : %d\n", cnt,c[cnt]);
		}
//		a0 : 1, b0 : 2, c0 : 3
//		a1 : 3, b1 : 4, c1 : 5
//		a2 : 5, b2 : 6, c2 : 7
//		a3 : 7, b3 : 8, c3 : 9
//		a4 : 9, b4 : 10, c4 : 11
		
		
	}

}
