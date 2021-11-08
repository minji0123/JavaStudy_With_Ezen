package nullPointer;

public class NullPointerExceptionRun7 {

	public static void main(String[] args) {

		String step1 = "step1";
		String step2 = null;
		try {
			System.out.println("try 1");
			System.out.println("-데이터 크기 : "+ step1.length() + step1.toString());
			
			System.out.println("try 2");
			System.out.println("-데이터 크기 : "+ step2.length() + step2.toString());
			}
		catch(Exception e){
			System.out.println("catch (Exception) : data에 값이 할당되어 있지 않습니다.");
			System.out.println("e : "+e.getMessage());
			e.printStackTrace();
	//			java.lang.NullPointerException
	//			at nullPointer.NullPointerExceptionRun7.main(NullPointerExceptionRun7.java:14)
			
			
		}
		System.out.println("작업끝");
	}

}
