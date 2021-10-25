package statics;

public class CircleAreaMain2 {

	public static void main(String[] args) {
		CircleArea circle = new CircleArea(3.0f);
		System.out.println("원의 넓이 : "+circle.area());
		System.out.println("원주율 : "+CircleArea.PI); 
		System.out.println("원주율 : "+circle.PI);
		
		System.out.println("---------circle1의 카운트---------");
		System.out.println("circle개수(정적클래스.) : "+ CircleArea.COUNTCREATION);
		System.out.println("circle개수(정적인스턴스.) : "+ circle.COUNTCREATION);
		System.out.println("circle개수(변수) : "+ circle.getCount());
		
	
		CircleArea circle2 = new CircleArea(4.0f);
		System.out.println("---------circle2의 카운트---------");
		System.out.println("circle개수(정적클래스.) : "+ CircleArea.COUNTCREATION);
		System.out.println("circle개수(정적인스턴스.) : "+ circle2.COUNTCREATION);
		System.out.println("circle개수(변수) : "+ circle2.getCount());
		
		CircleArea circle3 = new CircleArea(5.0f);
		System.out.println("---------circle2의 카운트---------");
		System.out.println("circle개수(정적클래스.) : "+ CircleArea.COUNTCREATION);
		System.out.println("circle개수(정적인스턴스.) : "+ circle3.COUNTCREATION);
		System.out.println("circle개수(변수) : "+ circle3.getCount());
		

		
	}

}
