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
public class IfStaatement04C {

	public static void main(String[] args) {
	
		int score1 = 111;
		char grade = 'F';
		if (score1 >= 0 && score1 <= 100) {
			if (score1 >= 90 && score1<=100) {
				grade = 'A';
			}
			else if (score1 >= 80) {
				grade = 'B';
			}
			else if (score1 >= 70) {
				grade = 'C';
			}
			else if (score1 >= 60) {
				grade = 'D';
			}
			else {
				grade = 'E';
			}
		}
		
		// System.out.printf("점수 (%d)의 등급은 (%c)입니다.",score1, grade); // if 문 범위 밖의 값은 char의 초기값인 F가 출력된다.
//		 System.out.printf("점수 (%d)의 등급은 %s", score1, (grade == 'F') ? "범위 오류 입니다." : (grade + "입니다."));

		String gStr = (grade + "입니다.");
		
		// .format함수 사용
		 String msg = String.format("점수 (%d)의 등급은 %s", score1, (grade == 'F') ? "범위 오류 입니다." : gStr);
		 System.out.println(msg);
	
	
	
	
	
	
	
	}

	
}
