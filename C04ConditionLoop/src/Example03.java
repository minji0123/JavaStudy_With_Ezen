/*
 * for 문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성
 * ---------------------
 * 결과 = 3의 배수의 합 : 1683
 */
public class Example03 {

	public static void main(String[] args) throws Exception{
		int num ;
		int sum3 = 0;
		
		for (num = 0; num <=100; num++) {
			if (num%3==0) {
				sum3+=num;
			}
		}
		System.out.println("3의 배수의 합 : "+ sum3);
	}
	
}
