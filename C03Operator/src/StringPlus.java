/*
 * 문자열 연산
 * +로 문자열 연결
 */
public class StringPlus {

	public static void main(String[] args) {
		// 1. 문자열 연결 기본
		System.out.println("Hello, World!");
		System.out.println("Hello" + ", " + "World!");
		// 둘 다 Hello, World! 출력
		String hello = "Hello";
		String world = "World";
		String helloworld = hello + ", " + world + "!";		
		System.out.println(hello); // Hello
		System.out.println(world); // World
		System.out.println(helloworld); // Hello, World!
		
		// 2. 빈 문자열 출력
		String java = "Java";
		String ver = "Ver";
		//String version;		// 초기값이 할당되지 않아 없는 상태
		String version = "";	// 초기값으로 빈문자열이 할당된 상태
		System.out.printf("version=(%s)\n", version);
		// version=()
		
		// 3. 문자열과 숫자
		version = java + " ";
		version = version + ver;
		version = version + "." + 99;  // 여기 version은 JAVA Ver임
		System.out.println(version);
		// Java Ver.99

	}

}