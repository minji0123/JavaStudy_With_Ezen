/* 
 * 강제 타입 변환
 * 1. 특정한 타입으로 강제 변환
 * 2. 큰 타입에서 작은 타입으로 변환 (자료의 손실이 발생)
 * 		자료의 손실이 발생함을 감수하고도 변환함
 */
public class TypeCasting {

	public static void main(String[] args) {
		int intValue = 300;
		
		// 원래는 변환할 수 없다.
		// byte byteValue = intValue;
		
		byte byteValue = (byte) intValue;
		
		System.out.printf("int(%d)(%x) : byte(%d)(%x)\n", intValue,intValue,byteValue,byteValue);

	}

}
