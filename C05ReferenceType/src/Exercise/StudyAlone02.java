package Exercise;
import java.util.Arrays;

public class StudyAlone02 {

	public static void main(String[] args) {
		
		// 1. 2차원 배열
		int [][]score1 = {{1,2,3,4,5},{6,7,8,9}}; // 값 목록으로 배열 선언, 값 할당
		int [][]score2 = new int [][] {{1,2,3},{1,2,3}}; // new연산자로 배열 선언, 값 할당
		int [][]score3 = new int [5][];// 5행 null열. 계단식(가변형)배열
		
		// 2. 2차원 배열에 값 할당
		// 2-1 행 열의 크기가 정해져 있을 때 (직접 할당)
		int [][]score4 = new int [3][4]; // 0~2행 0~3열
		score4[0][0] = 1;
		score4[0][1] = 1;
		//...
		score4[2][3] = 1;
		
		//2-2 행 열의 크기가 정해져 있지 않을 때 (가변형 배열)
		int [][]score5 = new int [3][]; // 0~2행 null열. 계단식(가변형)배열
		score5[0] = new int[4]; // 0행에는 4열
		score5[1] = new int[3]; // 1행에는 3열
		score5[2] = new int[2]; // 2행에는 2열
		
		// 3. 배열 출력
		// 3-1 for문으로 출력
//		int [][]score1 = {{1,2,3,4,5},{6,7,8,9}}; // 0~4행 0~3열
		for (int row=0; row<score1.length; row++) {
			for (int col=0; col<score1[row].length; col++) {
				System.out.print(score1[row][col]+" ");
			}
			System.out.println();
		}
		
		// 4. 배열 길이
		int[][] array = {{95,86},
						{83,92,96},
						{78,83,93,87,88}};
		System.out.println(array.length); // 3 , 3행이 있다.(0~2행)
		System.out.println(array[2].length); // 5, 3행(0~2)애 5열이 있다.
		


	}

}
