package statics;

public class CircleAreaMain4 {

	public static void main(String[] args) {
		CircleArea circle1 = new CircleArea(3.0f);
		circle1.print("circle1");
		CircleArea.printStatic("circle1_정적");
		CircleArea.printStatic(circle1, "circle1_정적");
		
		
		CircleArea circle2 = new CircleArea(4.0f);
		circle2.print("circle2");
		CircleArea.printStatic("circle2_정적");
		CircleArea.printStatic(circle2, "circle2_정적");
		
		CircleArea circle3 = new CircleArea(5.0f);
		circle3.print("circle3");
		CircleArea.printStatic("circle3_정적");
		CircleArea.printStatic(circle3, "circle3_정적");

	}

}
