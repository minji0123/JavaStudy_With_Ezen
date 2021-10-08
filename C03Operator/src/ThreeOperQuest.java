/*
 * // [문제] 삼항 연산자를 사용하여 주어진 값의 등급을 지정하라.
 * score : 0부터 100까지의 임의 값
 * A : 90점 이상
 * B : 80점 이상
 * C : 70점 이상
 * D : 60점 이상
 * F : 60점 미만
 */
public class ThreeOperQuest {

	public static void main(String[] args) {
		int score = 90;
		// char grade = 'F';
		
		// boolean c = (a>b) ? true : false;
		char gradeKind = (score>=90) ? 'A' : (score>=80) ? 'B' : (score>=70) ? 'C' : (score <60) ? 'D' : 'F';
		
		
		System.out.printf("score(%d), scoreKind(%c)\n",score, gradeKind);
		// score(90), scoreKind(A)
	}

}
