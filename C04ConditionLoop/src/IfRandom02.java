/*
 * 난수 : 임의의 수를 컴퓨터가 발생
 * double x = Math.random()
 * 범위 : 0.0 <= x < 1.0
 * ----------------------------
 */
public class IfRandom02 {

	public static void main(String[] args) {
		/* 
		 * [문제1] 0점부터 100점 사이의 난수를 발생시켜서 등급을 나눠라.
		 * A : 95점 이상 B : 90점 이상, C : 80점 이상, D : 70점 이상, E : 60점 이상, F : 60점 미만
		 */
//		double score = Math.random();
//		int scoreCal = (int)(score*100)+1;
//		char grade = 'F';
//		System.out.println(scoreCal);
//		
//		if (scoreCal>=0 && scoreCal<=100) {
//			if(scoreCal>=95) {
//				grade = 'A';
//			}
//			else if (scoreCal>=90) {
//				grade = 'B';
//			}
//			else if (scoreCal>=80) {
//				grade = 'C';
//			}
//			else if (scoreCal>=70) {
//				grade = 'D';
//			}
//			else if (scoreCal>=60) {
//				grade = 'E';
//			}
//			else {
//				grade = grade;
//			}
//			System.out.println(grade);
//		}
//		else {
//			System.out.println("잘못된 값");
//		}
		
		/*
		 * [문제2] 60점부터 100점 사이의 난수를 발생시켜서 등급을 나눠라.
		 * A : 95점 이상 B : 90점 이상, C : 80점 이상, D : 70점 이상, E : 60점 이상
		 */
		// 경우의수 = 최대값 - 최소값 + 1
		// 최종결과 = 난수 * (경우의 수 + 1) + 시작값
		double score = Math.random();
		int n = 100 - 60 + 1;
		int scoreCal = (int)(score * n) + 60;
		System.out.println(scoreCal);
		System.out.printf("scoreCal : y(%f), n(%d), scroeCal(%d)\n",score,n,scoreCal);
		
	}

}
