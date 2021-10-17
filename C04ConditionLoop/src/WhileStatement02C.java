/*
 * 반복문(while)
 *----------------------------
 * 무한루프일 때, 반복문 탈출하기 break
 */
public class WhileStatement02C {

	public static void main(String[] args) {
	
		int cnt = 0;
		int sum = 0;

		while(true) {
			if (cnt>=10) {break;}
			cnt++;
			sum+=cnt;
			
			System.out.printf("cnt: %d, sum: %d\n", cnt, sum);
		}
		System.out.printf("합계 : %d\n", sum);

	
	}

}
