/*
 * 커맨드라인 (command line)
 * - 프로그램이 실행될 때 진입함수(main)의 인자로 전달
 * - 인자는 문자열의 배열로 전달
 * ---------------------------------------------------------
 * 1. 인자로 넘어온 문자열을 숫자로 변환하여 모두 더하기
 */
package Array;

public class CommandLineCalc {

	public static void main(String[] args) { // args 는 String 타입의 배열이다.
		
		// 1. args의 크기
		System.out.println("args.length = " + args.length);
		// 3. 값 넣어서 출력해보기
		for (String str : args) {
			System.out.printf("%s \n", str);
		}
		
		
		int argsLen = args.length;
		int total = 0;
		for(int cnt = 0; cnt<argsLen; cnt++) {
			int num = Integer.parseInt(args[cnt]); // Integer.parseInt : 문자열을 정수로 변환하는 함수
			total += num;
		}
		System.out.println("total = "+total);
//		args.length = 0
//		total = 0
		
//		2. run as -> con... -> argument
//		1 
//		2 
//		3 
//		4 
//		5 
//		6 
//		7 
//		8 
//		9 
//		10 
//		total = 55

	}

}
