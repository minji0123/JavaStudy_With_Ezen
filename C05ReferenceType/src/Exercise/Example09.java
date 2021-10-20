/*
 * [문제9] 키보드로부터 학생수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램을 만들기
 */
package Exercise;
import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료}");
			System.out.println("-------------------------------------------------------------");		
			System.out.println("선택> ");
			
			int seletNo = scanner.nextInt();
			
			if (seletNo==1) {
				
			} else if( seletNo==2) {

			
			}else if( seletNo==3) {

			
			}else if( seletNo==4) {

			
			}else if( seletNo==5) {

			run = false;
			}
			
			}
		
		
		System.out.println("프로그램 종료");
	}
}
