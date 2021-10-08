/*
 * 자동 타입 변환 Promotion
 * 1. 작은 타입에서 큰 타입으로 변환
 * 2. 문자형 char 은 양수값만 처리하므로 byte 의 마이너스 값을 캐스팅하면 플러스로 바뀐다.
 */
public class Promotion {

	public static void main(String[] args) {

		byte b1 = 65; //65 = 'A'
		int n1 = b1; //자동캐스팅
		
		System.out.println("b1 : "+b1);
		System.out.println("n1 : "+n1); // 얘는되는데
		
		
		char ca = 65;
		int na = ca;
		System.out.println("ca : "+ca);
		System.out.println("na : "+na);
		
		
		// byte에서 char는 못한다.
		byte b2 = Byte.MIN_VALUE;
		char c1 = (char)b2;
		int n2 = (int)b2;
		int n3 = (int)c1;
		
		System.out.println("b2 : "+b2);
		System.out.println("c1 : "+c1);
		System.out.printf("c1(%c)(0x%x)(%d)\n : ",c1,(int)c1,(int)c1);
		System.out.printf("n2(%d)(0x%x), n3(%d)(0x%x)\n : ",n2,n2,n3,n3);
		
		
	}

}
