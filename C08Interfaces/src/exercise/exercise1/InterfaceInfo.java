package exercise.exercise1;

public interface InterfaceInfo {
	/*
	 * [1. 인터페이스에 대한 설명으로 틀린 것은?]
	 * 1. 인터페이스는 객체 사용 설명서 역할을 한다.
	 * 2. '구현 클래스'가 (인터페이스의 추상 메소드에 대한 )'실체 메소드'를 가지고 있지 않으면, '추상클래스'가 된다.
	 * 3. 인터페이스는 인스턴스 필드를 가질 수 있다.
	 * 4. 구현객체는 인터페이스 타입으로 자동변환된다.
	 * 
	 * 답 : 3번
	 * 인터페이스는 상수필드, 추상메소드, 디폴트메소드, 정적메소드를 가질 수 있다.
	 */

	// 상수필드
	public static final double PI = 3.14;
	// 추상메소드
	public void turnOn(); 
	// 디폴트메소드
	default void showStatement() {
		System.out.println("에베베");
	}
	// 정적메소드
	public static void showAnotherStatement() {
		System.out.println("베베베");
	}
}
