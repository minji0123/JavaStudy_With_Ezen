/*
 * 난수 : 임의의 수를 컴퓨터가 발생
 * double x = Math.random()
 * 범위 : 0.0 <= x < 1.0
 */
public class IfRandom01 {

	public static void main(String[] args) {
		double x1 = Math.random();
		double x2 = Math.random();
		double x3 = Math.random();
		double x4 = Math.random();
		double x5 = Math.random();
		
		System.out.println("x1 : " + x1);
		System.out.println("x2 : " + x2);
		System.out.println("x3 : " + x3);
		System.out.println("x4 : " + x4);
		System.out.println("x5 : " + x5);
		
//		// 주사위 : 1부터 6까지의 수
//		double x = Math.random();
//		double y = x*6;
//		int z = (int)y;
//		int dice = (int)(z+1);
////		System.out.println("주사위값 : "+dice);
//		System.out.printf("주사위값 : x(%f), y(%f) , z(%d),dice(%d)\n", x, y, z,dice);
		
		
		// 주사위 : 1부터 6까지의 수
		double x = Math.random();
		double y = x*6;
		int z = (int)y;
		int dice = (int)(z+1);
		int last = (int)(x*6.0)+1;
//		System.out.println("주사위값 : "+dice);
		System.out.printf("주사위값 : x(%f), y(%f) , z(%d),dice(%d)\n", x, y, z,dice);
		System.out.printf("주사위값 : last(%d)\n", last);
		


	}

}
