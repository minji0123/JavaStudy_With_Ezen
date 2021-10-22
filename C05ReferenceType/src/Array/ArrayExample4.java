/*
 * [문제] 2행 4열인 배열을, 4행 2열로 출력하기
 * 2행 4열
 * 1234
 * 5678
 * 4행 2열
 * 15
 * 26
 * 37
 * 48
 */
package Array;

public class ArrayExample4 {

	public static void main(String[] args) {
		int array1[][] = {{1,2,3,4},{5,6,7,8}};
		int array2[][] = new int [4][2];
		

		// 1. array1 출력
		for (int col=0; col<array1.length; col++) {
//			int arra1ColLen = array1[col].length;
//			System.out.println("array1 열의 크기 : "+arra1ColLen);
			
			for (int row=0; row<array1[col].length; row++) {
//				System.out.print(array1[col][row]+ " ");
				
				// 2. array2에 배열 넣어주기
				array2[row][col] = array1[col][row];
				System.out.print(array2[row][col]+ " ");
				
			}
			System.out.println();
		}
		
		
		// 3. array2 출력
		for (int col=0; col<array2.length; col++) {
//			int arra1ColLen = array2[col].length;
//			System.out.println("array1 열의 크기 : "+arra1ColLen);
			
			for (int row=0; row<array2[col].length; row++) {
				System.out.print(array2[col][row]+ " ");
				
			}
			System.out.println();
		}
		
	}

}
