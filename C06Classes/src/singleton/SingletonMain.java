package singleton;

public class SingletonMain {

	public static void main(String[] args) {
		
		// 1. 다른 객체의 같은 생성자가 계속 만들어진다.
		// 하나만 만들기 위해서는 new를 막아야 한다.
		// 하지만 private으로 설정하면, 다른 클래스에서 공유되지 않기 때문에 오류가 난다.
//		Singleton s1 = new Singleton();
//		Singleton s2 = new Singleton();
//		System.out.println("s1 == s2 :" + (s1 == s2)); // 다른주소 방향을 가리키는 같은 생성자

		
		
		// 2. 싱글톤 패턴으로 생성한 객체
		// 같은 주소 방향을 가리키는 객체를 생성했다.
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println("s1 == s2 :" + (s1 == s2)); 
		
		// 3. 같은 방향을 가리키는 단 하나의 객체이기 때문에 
		// 아무리 생성을 해도 개수눈 1로 항상 같게나온다.
		s1.singleCount();
		s2.singleCount();
		Singleton.singleCount();// 접근은 이렇게 하는게 통상적임.
		
		
		// 4. 뚫리는 생성자에 s3 객체를 만들어봄
		// 싱글톤 카운트가 늘어나버림
		// 다른 주소를 가진 다른 생성자가 생겨버림
		Singleton s3 = new Singleton("s3");
		System.out.println("s1 == s3 :" + (s1 == s3)); 
		s2.info();
		s3.info();
		
		// 4-1 뚫렸기 때문에 생성 가능하다.
		// 마찬가지로 다른 주소를 가진 다른 생성자가 생겨벼린다.
		Singleton s4 = s3.getInstance();
		System.out.println("s3 == s4 :" + (s3 == s4)); 
		
	}

}
