/*
 * [문제1] 아래와 같은 다섯 가지 과목의 성적을 처리하라
 * - 국어, 영어, 수학, 과학, 역사 과목은 0부터 100점 사이의 점수
 * - 총점과 평균을 구하라
 * - 배열을 이용하라.
 * - 평균은 실수(float)로 처리하라.
 * - 모든 과목의 점수와 총점 그리고 평균을 출력하라.
 */
package Array;

public class IntArrayExample01 {

	public static void main(String[] args) {
		
		// 1. 과목 점수 변수 선언, 값 할당
		float[] subjects = { 70.0f, 80.0f, 90.0f, 100.0f, 99.0f };
		float total = 0.0f, avg;
		System.out.println("--------------------------------------------");
		System.out.println("과목별 점수");
		
		
		// 2. for문으로 과목별 점수 출력, 총점 계산1
		for(int cnt=0; cnt < subjects.length; cnt++) {
			total += subjects[cnt]; 
			System.out.printf("[%6.2f] ", subjects[cnt]);
		}
		System.out.println(" ");
		
		// 3. 총점계산2
		float total2 = 0.0f; // 얘는 배열이 아니다.
		total2 += subjects[0]; // total2 = total2 + subjects[0]
		total2 += subjects[1]; // ...
		total2 += subjects[2]; 
		total2 += subjects[3]; 
		total2 += subjects[4]; // total2 = total2 + subjects[4]
		System.out.println("--------------------------------------------");
		
		// 4. 평균값 할당
		avg = total / subjects.length;
		
		// 5. 총점, 평균값 출력
		System.out.printf("총점 : %.2f/%.2f\n", total, total2);
		System.out.printf("평균 : %.2f\n", avg);
	}

}
