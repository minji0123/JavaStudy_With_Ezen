/*
 * 반복문 for
 * ------------------------------------------------------------
 * [문제2] 반복문(for)를 이용한 구구단 출력
 */
public class ForExample02 {

	public static void main(String[] args) {
		for (int x =2; x<10; x++) {
			System.out.println("-----------------------------");
			System.out.println(x+"단");
			
			for (int y=1; y<10; y++) {
				System.out.printf("%d x %d = %d\n", x,y,x*y);
			}
		}

	}

}
