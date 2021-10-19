/*
 * 배열 복사 : System.arraycopy(Object src, int srcPos, 
 * 								Object dest, int destPos, 
 * 								int length);
 */
package Array;

public class ArrayCopy {

	public static void main(String[] args) {
//		int []a = new int[] {1,3,5,7,9};
//		int []b = new int[4];
//		int []c = new int[4];
//		int []d = new int[4];
		
		
		// 1. 대입연산자로 대입할 때 출력값 확인하기
//		b=a;
//		for (int cnt=0; cnt<a.length;cnt++) {
//			System.out.printf("a%d : %d, ", cnt,a[cnt]);
//			System.out.printf("b%d : %d\n", cnt,b[cnt]);
//			
//		}
////		a0 : 1, b0 : 1
////		a1 : 3, b1 : 3
////		a2 : 5, b2 : 5
////		a3 : 7, b3 : 7
////		a4 : 9, b4 : 9
//		// 이렇게 복사하면 원하는 결과는 나오지만, 복사연산자를 사용하는 이유가 따로 있다.
		
		// 1-1 a, b는 같은 배열 공간을 공유해서, 원본(a) 배열도 바뀌기 때문이다.
//		b=a;
//		for (int cnt=0; cnt<a.length;cnt++) {
//			b[cnt] = a[cnt] + 1; // b의 배열을 짝수로 바꿔주기 위해 +1을 했다.
//			System.out.printf("a%d : %d, ", cnt,a[cnt]);
//			System.out.printf("b%d : %d\n", cnt,b[cnt]);
//		}
//		a0 : 2, b0 : 2
//		a1 : 4, b1 : 4
//		a2 : 6, b2 : 6
//		a3 : 8, b3 : 8
//		a4 : 10, b4 : 10
		
		// 1-2 b 배열을 null로 바뀌주고, 대입연산자로 대입할 때 출력값
//		int []a = new int[] {1,3,5,7,9};
//		int []b = null;
//		int []c = new int[4];
//		int []d = new int[4];
//		
//		
//		b=a;
//		for (int cnt=0; cnt<a.length;cnt++) {
//			b[cnt] = a[cnt] + 1; // b의 배열을 짝수로 바꿔주기 위해 +1을 했다.
//			System.out.printf("a%d : %d, ", cnt,a[cnt]);
//			System.out.printf("b%d : %d\n", cnt,b[cnt]);
//		}
////		a0 : 2, b0 : 2
////		a1 : 4, b1 : 4
////		a2 : 6, b2 : 6
////		a3 : 8, b3 : 8
////		a4 : 10, b4 : 10
//		// b의 배열이 가리키던 거는 사라지고, a배열을 같이 가리키게 된다.
		
		// 0. 번외
//		// 배열크기 출력해봄 (.length속성값은 readonly이다.)
//		System.out.println("a.length = " + a.length);
//		System.out.println("b.length = " + b.length);
////		a.length = 5
////		b.length = 5
		

	}

}
