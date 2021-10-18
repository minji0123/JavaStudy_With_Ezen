package NullValue;
/*
 * String 타입
 * - 기본타입과 참조타입의 값 비교(=, .equals)
 */
public class StringType {

	public static void main(String[] args) {
		
		
		int x = 10;
		int y = 10;
		int c = x;
		
		String hello1 = "hello";
		String hello2 = "hello";
		String hello3 = hello1;
		
		String hW1 = hello1 + "world";
		String hW2 = hW1;
		String hW3 = new String(hW2); // 클래스를 객체화 시킬 때 new를 사용
		
		
		// 1. 기본 타입은 값을 비교했더니 같은 값을 가진다. 
		// (변수가 갖고 있는 값으로 비교)
		System.out.printf("x(%d)==y(%d) : %b\n" ,x,y, (x==y) );
		System.out.printf("c(%d)==x(%d) : %b\n" ,c,x, (c==y) );
//		x(10)==y(10) : true
//		c(10)==x(10) : true
	
		
		// 2. 참조 타입 (=)
		// String 은 힙 영역의 같은 방향을 가리킨다.
		System.out.printf("hello1(%s)=hello2(%s) : %b\n" ,hello1, hello2, (hello1==hello2) );	
		System.out.printf("hello3(%s)=hello1(%s) : %b\n" ,hello3, hello1, (hello3==hello1) );	
//		hello1(hello)=hello2(hello) : true
//		hello3(hello)=hello1(hello) : true

		
		// 3. 참조 타입 (new)
		// String 은 힙 영역의 다른 방향을 가리킨다.
		// new를 사용해서 객체화 시킨 클래스의 값을 비교하고 싶을 때는 equals를 사용해야 한다.
		System.out.printf("hW1(%s)=hW2(%s) : %b\n" ,hW1, hW2, (hW1==hW2) );	// 주소 비교
		System.out.printf("hW2(%s)=hW3(%s) : %b\n" ,hW2, hW3, (hW2==hW3) );	// 주소 비교
		System.out.printf("hW2(%s)=hW3(%s) : %b\n" ,hW2, hW3, (hW2.equals(hW3)) );	// 주소가 참조하고 있는 값 비교
//		hW1(helloworld)=hW2(helloworld) : true
//		hW2(helloworld)=hW3(helloworld) : false
//		hW2(helloworld)=hW3(helloworld) : true
	
	
	}

}
