package statics;

public class CircleAreaMain {

	public static void main(String[] args) {
		CircleArea circle = new CircleArea(3.0f);
		System.out.println("원의 넓이 : "+circle.area());
		
		// static 변수 PI를 클래스 이름으로 가져옴
		System.out.println("원주율 : "+CircleArea.PI); 
		System.out.println("원주율 : "+circle.PI);
		
		
	}

}
