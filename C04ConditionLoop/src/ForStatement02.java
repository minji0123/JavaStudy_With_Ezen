/*
 * 반복문 for
 * ------------------------------------------------------------
 * - 반복회수는 정수형을 쓰는 것을 권고
 * 		- 9번째 처리후의 값은 cnt(0.9000001)이므로
 * 		- 10번째는 cnt(1.---)여서, 1.0f값을 넘기 때문에, 9번만 수행힌다.
 * 
 */
public class ForStatement02 {

	public static void main(String[] args) {
		
		int count = 0;
		for (float cnt = 0.1f; cnt <= 2.0f; cnt += 0.1f) {
			count++;
			System.out.println(cnt +", "+ count+"번");
			
		}
		// 1.9000003, 19번

	}

}
