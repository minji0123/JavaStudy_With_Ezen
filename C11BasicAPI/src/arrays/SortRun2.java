/*
 * 정렬 Sort
 * 2. 내림차순
 * ---------------------------------------------
 * Arrays.sort()
 * - 배열 정렬해주는거임
 * - 기본 오름차순
 * - 배열 위치가 변하는거지, 크기가 변하는건 아님
 */
package arrays;

import java.util.Arrays;

public class SortRun2 {
	public static void main(String[] args) {
		int[] scores = { 3, 2, 5, 6, 7, 8, 1, 0, 88, 34, 23 };

		Arrays.sort(scores);
		System.out.println("내림차순");
		for (int x = scores.length-1; x >= 0; x--) {
			System.out.printf("scores[%d] : [%d]\n", x, scores[x]);
		}

	}

}
