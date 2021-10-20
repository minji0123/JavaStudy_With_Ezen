/*
 * [문제8] 주어진 배열의 전체 항목의 합과 평균값을 구해보세요(중첩 for문 이용)
 */
package Exercise;

public class Example08 {

	public static void main(String[] args) {
		int[][]array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int valueCnt = 0;
		
		
		
		for(int col=0; col<array.length; col++) {
			for (int row=0; row<array[col].length; row++) {
			System.out.printf("[%d] ",array[col][row]);
				sum +=array[col][row];
				valueCnt++;
			}
		System.out.println();
		}
		System.out.println("sum : "+sum);
		System.out.println("valueCnt : "+valueCnt);
		
		avg = (double)sum/valueCnt;
		System.out.println("avg : "+avg);
	}

}
