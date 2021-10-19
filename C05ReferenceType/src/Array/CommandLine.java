/*
 * 커맨드라인 (command line)
 * - 프로그램이 실행될 때 진입함수(main)의 인자로 전달
 * - 인자는 문자열의 배열로 전달
 */
package Array;

public class CommandLine {

	public static void main(String[] args) { // args 는 String 타입의 배열이다.
		// 1. args의 크기
//		String [] abcs = {};
		System.out.println("args.length = " + args.length);
//		System.out.println("args.length = " + abcs.length);
		// args.length = 0 
		// args는 비어있기 때문에 0이다.
		
		
//		2. run as -> con... -> argument
		// 홍길동 30 입력 후 run
//		args.length = 2

		// 3. 값 넣어서 출력해보기
		for (String str : args) {
			System.out.printf("%s \n", str);
		}
		
		String abcs[] = {"홍길동", "30"};
		for (String str : abcs) {
			System.out.printf("%s \n", str);
		}
		
		// 4. bin 파일이 있는 경로로 cmd이동해서 java Array.CommandLine 입력
//		경로............bin>java Array.CommandLine
//		args.length = 0
//		홍길동
//		30
		
//		경로............bin>java Array.CommandLine test 0123
//		args.length = 2
//		test
//		0123
//		홍길동
//		30
	}

}
