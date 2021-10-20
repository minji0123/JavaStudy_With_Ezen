package Exercise;
import java.util.Arrays;

public class StudyAlone01 {

	public static void main(String[] args) {
		// 1. 1차원 배열 선언
		// 비어있는 배열을 생성했다.
		int []score1;
		int []score2 = {};
		int []score3 = new int []{2,4,6,8,10};
		int []score4 = new int [5]; 
		
		// 2. 1차원 배열 생성
		// 2-1 값 목록으로 배열 생성
		int []scoreVal = {1,2,3,4,5};
		// 이렇게 직접 값을 넣어주는 것을 '값 목록으로 배열 생성'이라 부른다.
		// ...
		// 하지만 배열 초기화는 안된다.
//		score1 = {1,2,3,4,5}; // 오류가 발생한다.
		
		
		// 2-2 new연산자로 배열 생성
		int []scoreNew = new int [5]; // 괄호 안에 배열의 크기를 입력해줘야 한다.
		// 이렇게 new연산자로 배열을 생성해주는 것을 new 연산자로 배열 생성이라 부른다.
		// 이렇게 생성한 배열은 안에 null값으로 초기화되어있기 때문에
		// 이렇게 값을 넣어줘야 한다.
		scoreNew[0] = 10;
		scoreNew[1] = 10;
		// 보통 이렇게 값과 함께 변수를 선언한다.
		int []scoreNew1 = new int [] {1,2,3,4,5};
		// ...
		// 처음에 생성만 해놨던 배열 초기화도 가능하다.
		// 생성만 했었기 때문에 null이 아니라 그냥 빈칸이여서, 값을 넣어줄 수 있다.
		score1 = new int[] {1,2,3,4,5};
		score2 = new int[] {1,2,3,4,5};

		
		// 3. 배열 값
		// 3-1 배열 값 하나씩 출력이 가능하다.
		System.out.println(score1[1]); // score1의 1번째 값 출력
		System.out.println(scoreVal[0]); // scoreVal의 0번째 값 출력
		// ...
		// 3-2 그냥 출력하면 배열이 가리키는 힙 메모리의 주소값이 나온다.
		System.out.println(score1); // [I@7d6f77cc
		
		// 4. 배열 전체 출력
		// 4-1 printf로 출력
		System.out.printf("[%d] [%d] [%d] [%d] [%d]\n", score1[0], score1[1], score1[2], score1[3], score1[4]);
		
		// 4-2 for문으로 출력
		// 4-2-1 배열 개수 직접 입력
		for (int i = 0; i<5; i++) {
			System.out.println("score["+i+"]= "+score1[i]);
//			System.out.printf("i%d = [%d]\n", i,score1[i]);
		}
		// 4-2-1 배열 개수 직접 입력
		for (int i = 0; i<score1.length; i++) {
			System.out.println("score["+i+"]= "+score1[i]);
//			System.out.printf("i%d = [%d]\n", i,score1[i]);
		}
		// 4-3 for문 :사용
		for (int i : score1) {
			System.out.println("score["+i+"]= "+score1[i]);
//			System.out.printf("i%d = [%d]\n", i,score1[i]);
		}
		// 4-4 라이브러리 사용
		System.out.println(Arrays.toString(score1));
		
		// 5. 배열 복사
		// 5-1 대입연산자로 복사
//		score2 = score1;
//		System.out.println("score2 : "+Arrays.toString(score2));
//		// 하지만 대입연산자로 복사하게 되면 주소값이 같아져버리면서, score1의 값이 바뀌면 score2의 값도 바뀌게 된다.
		
		// 5-2 메소드 이용 System.arraycopy()
//		System.arraycopy(score1, 0, score2, 0, score1.length);
//		for (int i = 0; i <= score1.length; i++) {
//			System.out.printf("i%d = [%d]\n",i,score1[i]);
//		}
		// 6. 배열 역순 출력
		for (int i=score1.length-1; i>=0; i--) { // i=score1.length-1 : 배열은 0부터 시작하기 때문에 -1을 해줘야 한다.
			System.out.printf("i%d = [%d]\n",i,score1[i]);
		}

	}

}
