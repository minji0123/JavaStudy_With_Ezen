/*
 * 변수의 사용 범위
 * 블럭 밖에서 블력안에 선언되어 있는 변수에 접근할 수 없다.
 * 블럭 안에서는 블럭 밖에 선언되어있는 변수에 접근할 수 있다.
 */
public class VariableScope {
	static int g1 = 99;

	public static void main(String[] args) {

		int a1 = 10; // local variable
		
		System.out.println("a1 : "+a1);
		System.out.println("main.al = "+a1);
		System.out.println("main.g1 = "+g1);
		
		{
			int b1 = 20;
			System.out.println("block.g1 = "+g1);
			System.out.println("block.a1 = "+a1);
			System.out.println("block.b1 = "+b1);
			
		}

	}

}
