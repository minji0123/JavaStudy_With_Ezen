package singleton2;

public class SingletonMain {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		s1.info();

		Singleton s2 = Singleton.getInstance("Hello");
		
		s2.info();
		System.out.println("s1 == s3 :" + (s1 == s2)); 


		
	}

}
