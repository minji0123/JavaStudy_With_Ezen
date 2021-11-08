package nullPointer;

public class NullPointerExceptionRun {

	public static void main(String[] args) {
		// 1. 정상 처리
//		String data = "작업처리";
		
		// 2. 컴파일 오류
//		String data; // 초기값을 지정하지 않음

		// 3. 실행오류
		String data = null; // java.lang.NullPointerException
		System.out.println("data.length : "+data.length());
		System.out.println(data.toString());
		System.out.println("작업 끝");
		
	}

}
