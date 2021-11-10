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
import java.util.Collections;

public class SortRun4 {
	public static void main(String[] args) {
		int[] scores = { 3, 2, 5, 6, 7, 8, 1, 0, 88, 34, 23 };

		System.out.println("내림차순");
		Integer[] descScores = Arrays.stream(scores).boxed().toArray(Integer[]::new);
		Arrays.sort(descScores, Collections.reverseOrder());
		System.out.println("====================================");
		

		print(descScores);

	}

	public static void print(Object [] a) {
		String str = "null";

		if (a == null) {
			str = "null";
		} else {
			System.out.println("len = "+a.length);
			int iMax = a.length - 1;
			if (iMax == -1) {
				str = "[]";
			}

			StringBuilder b = new StringBuilder();
			b.append('[');
			for (int i = 0;; i++) {
				b.append(a[i]);
				if (i == iMax) {
					b.append(']');
					str = b.toString();
					break;
				}
				b.append(", ");
			}
		}
		System.out.println(str);
	}
}
