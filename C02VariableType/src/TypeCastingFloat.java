/*
 * 강제 타입 변환(실수형float)
 */
public class TypeCastingFloat {

	public static void main(String[] args) {
			float fpi = 3.14159f;
			double dpi = 3.14159;
			int pi1 = (int)fpi;
			int pi2 = (int)dpi;
			
			System.out.println("fpi : "+fpi);
			System.out.println("dpi : "+dpi);
			// 소수점 이하 숫자는 버려진다.
			System.out.println("pi1 : "+pi1); 
			System.out.println("pi2 : "+pi2);
			
			
			// 10자리
			float fVal = 0.21e10f;
			int iVal = (int)fVal;
			System.out.println("fVal : "+fVal);
			System.out.println("iVal : "+iVal);
			
			// 10자리 이상을 적으면 값이 짤린다.
			float fVal2 = 0.21e10f;
			int iVal2 = (int)fVal2;
			System.out.println("fVal2 : "+fVal2);
			System.out.println("iVal2 : "+iVal2);
			
	}

}
