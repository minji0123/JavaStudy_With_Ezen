// long 배정도 정수
// 8바이트(64비트)
// 
public class LongType {

	public static void main(String[] args) {
		long intSize = 2147483647;
		// int 범위를 넘어가면 오류가 난다. 
		// 따라서 int 범위를 넘어서면 숫자 끝에 l, L을 입력해야 한다.
		// long longSize = 2147483648;
		long longSizel = 2147483648l;
		long longSizeL = 2147483648L;
		
		System.out.println("intSize : " + intSize);
		System.out.println("longSizel : " + longSizel);
		System.out.println("longSizeL : " + longSizeL);
		
		// 연산으로 값을 지정하는 경우, l,L을 안붙여도 된다.

		// long val = (long)(intSize + 1); 얘도 괄호처리 안해줘도 된다.
		long val = intSize + 1;
		System.out.println("val : " + val);
		
		

	}

}
