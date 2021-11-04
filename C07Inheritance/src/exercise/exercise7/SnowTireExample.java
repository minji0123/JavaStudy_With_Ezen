package exercise.exercise7;

public class SnowTireExample {

	public static void main(String[] args) {

		SnowTire snowTire = new SnowTire(); // 자식클래스
		Tire tire = snowTire; // 부모클래스로 형변환
		
		
		snowTire.run(); // 자식 데이터 타입, 자식 메소드
		tire.run();	// 부모 데이터 타입, 자식 메소드
		
//		스노우 타이어가 굴러갑니다.
//		스노우 타이어가 굴러갑니다.
	}

}
