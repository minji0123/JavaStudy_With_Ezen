/*
 * 싱글톤 패턴 : 객체가 하나만 생성되는 패턴
 * - 생성자를 감춰서, 외부에서 new를 하지 못하도록 막음(private)
 */
package singleton;

public class Singleton {
	
	private static int singlecount;
	// 1. new를 막기 위해서는 생성자 앞에 private를 붙이면 된다.
	private Singleton(){
		System.out.println("Singleton() : 기본 생성자");
		System.out.println("싱글톤 수"+ ++singlecount);
	}
	
	
	// 2. static으로 singleton을 하나 생성해준다.
	// static은 공유되는 변수이다.
	private static Singleton singleton = new Singleton();
	
	public static Singleton getInstance() {
		return Singleton.singleton;
	}
	
	
	// 3. 싱글톤 수 return
	public static int singleCount() {
		System.out.println("singleCount : "+ Singleton.singlecount);
		return Singleton.singlecount;
	}
	
	// 4. 뚫릴 수 있게 다른 생성자 하나 만들어봤음
	private String id;
	Singleton(String id){
		this.id = id;
		System.out.println("싱글톤 수"+ ++singlecount);
	}
	
	public void info() {
		System.out.println("아이디는 > "+ this.id);
		System.out.println("싱글톤 카운트 > "+ Singleton.singlecount);
	}
}
