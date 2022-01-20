package wrapper;

public class WrapperClassRun3 {
	public static void main(String[] args) {

		Byte objByte = 15;
		Character objChar = 'a';
		Short objShort = 12345;
		Integer objInt = 123456;
		Long objLong = 12345678L;
		Float objFloat = 3.14f;
		Double objDouble = 3.1415927;
		Boolean objBool = true;

		// 같은 타입은 붙여도 되고 안붙여도 된다.
		byte b1 = objByte;
		byte b2 = objByte.byteValue();
		byte b3 = (byte) (b1 + b2 + 1);
		Byte b4 = (byte) (objByte + 15); // wrapper 타입을 변환없이 연산 수행 -> 연산 수행 전에 기본타입으로 변환시켜버림
//		byte b5 = (Byte) (objByte + 15); // Byte 객체를 byte 로 변환시켜서 정수형 연산을 수행함
		byte b5 = (byte)(int)(objByte + 15);
		
		System.out.println("b1 : " + b1 + ", b2 : " + b2 + ", b3 : " + b3);
		System.out.println("b4 : " + b4);
		
		char c = objChar.charValue();
		short s = objShort.shortValue();
		int i = objInt.intValue();
		long l = objLong.longValue();
		float f = objFloat.floatValue();
		double d = objDouble.doubleValue();
		boolean bl = objBool.booleanValue();

		// 다른 타입은 붙여야 한다.
		int iF = objFloat.intValue();
	}

}


