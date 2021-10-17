/*
 * [문제] 0점부터 100점 사이의 난수를 발생시켜서 등급을 나눠라
 *  A : 95점 이상 B : 90점 이상, C : 80점 이상, D : 70점 이상, E : 60점 이상, F : 60점 미만
 *  A : 합격, 전액장학생
 *  B : 합격, 반액장학생
 *  C : 합격, 내년을 기약하세요
 *  D : 합격, 내년을 기약하세요
 *  E : 합격, 좀 더 노력하세요
 *  F : 과락
 */
public class IfRandom04 {
	
	public static void main(String[] args) {
	
		
		// 내 풀이
//		double score = Math.random();
//		int scoreCal = (int)(score*100)+1;
//		char grade = 'F';
//		System.out.println(scoreCal);		

		
//		if (scoreCal>=0 && scoreCal<=100) {
//			if(scoreCal>=95) {
//				grade = 'A';
//				System.out.println("전액장학생");
//				System.out.println("합격");
//			}
//			else if (scoreCal>=90) {
//				grade = 'B';
//				System.out.println("반액장학생");
//				System.out.println("합격");
//			}
//			else if (scoreCal>=80) {
//				grade = 'C';
//				System.out.println("내년을 기약하세요");
//				System.out.println("합격");
//			}
//			else if (scoreCal>=70) {
//				grade = 'D';
//				System.out.println("내년을 기약하세요");
//				System.out.println("합격");
//			}
//			else if (scoreCal>=60) {
//				grade = 'E';
//				System.out.println("좀 더 노력하세요");
//				System.out.println("합격");
//			}
//			else {
//				grade = grade;
//				System.out.println("과락");
//			}
//			System.out.println("성적 : "+grade);
//			
//		}
//		else {
//			System.out.println("잘못된 값");
//		}
	}

}
