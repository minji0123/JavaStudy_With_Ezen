/*
 * 조건문: if ~ else if ~ else
 * -----------------
 * if(조건식) {
 * 	실행문
 * }
 * else if(조건식){
 * 	실행문
 * }
 * else if(조건식){
 * 	실행문
 * }
 * ...
 * else {
 * 	실행문
 * }
 * 
 * ----------------------------------
 * [문제] if문을 사용하여 주어진 값의 등급을 지정하라.
 * score(0부터 100까지의 임의 값)에 따라서 등급 결정
 * A : 90 점 이상
 * B : 80 점 이상
 * C : 70 점 이상
 * D : 60 점 이상
 * E : 60 점 미만
 */
//import java.util.Scanner;
public class IfStatement04 {

	public static void main(String[] args) {
//		
//		int score = 111;
//		if (score >= 90 && score <= 100) {
//			System.out.println("A");
//		}
//		else if (score >= 80) {
//			System.out.println("B");
//		}
//		else if (score >= 70) {
//			System.out.println("C");
//		}
//		else if (score >= 60) {
//			System.out.println("D");
//		}
//		else if (score < 60 && score >= 0) {
//			System.out.println("E");
//		}
//		else {
//			System.out.println("범위가 잘못되었습니다.");
//		}
		// 결과는 B가 나온다.
		
		//해결하기 위해서는
		int score = 89;
		if (score >= 90 && score <= 100) {
			System.out.println("A");
		}
		else if (score >= 80 && score < 90) {
			System.out.println("B");
		}
		else if (score >= 70 && score < 80) {
			System.out.println("C");
		}
		else if (score >= 60 && score < 70) {
			System.out.println("D");
		}
		else if (score < 60 && score >= 0) {
			System.out.println("E");
		}
		else {
			System.out.println("범위가 잘못되었습니다.");
		}
		
		
//		Scanner score1 = new Scanner(System.in);
//		System.out.println("점수를 입력하세요 (0~100사이의 수) : ");
//		int a = score1.nextInt();
//		
//		if ((a >= 90) || (a < 100)) {
//			System.out.println("A");
//		}
//		else if (a >= 80) {
//			System.out.println("B");
//		}
//		else if (a >= 70) {
//			System.out.println("C");
//		}
//		else if (a >= 60) {
//			System.out.println("D");
//		}
//		else if (a < 60) {
//			System.out.println("E");
//		}
//		else {
//			System.out.println("범위가 잘못되었습니다.");
//		}
//		score1.close();
		
		
//		int score1 = 111;
//		if (score1 >= 0 && score1 <= 100) {
//			if (score1 >= 90 && score1<=100) {
//				System.out.println("A");
//			}
//			else if (score1 >= 80) {
//				System.out.println("B");
//			}
//			else if (score1 >= 70) {
//				System.out.println("C");
//			}
//			else if (score1 >= 60) {
//				System.out.println("D");
//			}
//			else {
//				System.out.println("E");
//			}
//		}
//		else {
//			System.out.println("범위가 잘못되었습니다.");
//		}

	}

}
