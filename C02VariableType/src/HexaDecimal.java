/*
 * 16 진수 : 0~15 
 * 0~9,10,11,12,13,14,15
 * 0~9, A, B, C, D, E, F
 */
public class HexaDecimal {

	public static void main(String[] args) {
		int dc = 10;
		int he = 0xa;
		
		System.out.println("16진수를 10진수로 출력");
		System.out.println("dc : "+dc);
		System.out.println("he : "+he);
		
		System.out.println("10진수를 16진수로 출력");
		System.out.printf("dc : %x\n",dc);
		System.out.printf("he : %x\n",he);
		
		
		int maxDec = 2147483647;
		int maxHex = 0x7fffffff;
		int minDex = -2147483648;
		System.out.printf("maxDec :%d, %x\n",maxDec,maxDec);
		System.out.printf("maxHex :%d, %x\n",maxHex,maxHex);
		System.out.printf("minDex :%d, %x\n",minDex,minDex);
		
	}

}
