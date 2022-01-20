package wrapper;

public class WrapperClassRun {
	public static void main(String[] args) {

		// 안쓰는 표현임
		Byte objByte = new Byte((byte) 15);
		Character objChar = new Character('a');
		Short objShort = new Short((short) 12345);
		Integer objInt = new Integer(123456);
		Long objLong = new Long(12345678L);
		Float objFloat = new Float(3.14f);
		Double objDouble = new Double(3.1415927);
		Boolean objBool = new Boolean(true);


		System.out.println(objByte);
		System.out.println(objChar);
		System.out.println(objShort);
		System.out.println(objInt);
		System.out.println(objLong);
		System.out.println(objFloat);
		System.out.println(objDouble);
		System.out.println(objBool);

	}

}
