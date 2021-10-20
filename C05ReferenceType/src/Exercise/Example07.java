/*
 * [문제7] 주어진 배열의 항목에서 최대값을 구해보세요(for문 이용)
 */
package Exercise;

public class Example07 {

	public static void main(String[] args) {
		int max = 0; // 최대값을 담은 변수 선언
		int[] array = {1,5,3,8,2};
		max = array[0]; // 변수에 배열 0열 값 할당
		
		for (int row=0; row<array.length; row++) {
			System.out.print(array[row]+" ");
			if (array[row]>max) {
				max = array[row];
			}
		}
		System.out.println();
		System.out.println("max : "+ max);
	}

}
