/*
 * 싱글톤 패턴 : 객체가 하나만 생성되는 패턴
 * - 생성자를 감춰서, 외부에서 new를 하지 못하도록 막음(private)
 */
package singleton2;

public class Singleton {
	private static Singleton singleton;
	private static int singlecount;
	private String id;
	
	private Singleton(){
		id = "unknown";
		System.out.println("Singleton() : 기본 생성자");
		System.out.println("싱글톤 수"+ ++singlecount);
	}

	public static Singleton getInstance(String ...args) {
		if (Singleton.singleton !=null) {
			return Singleton.singleton;
		}
		String id = (args.length >=1) ? args[0] : null;
		
		Singleton.singleton = ( id != null) ? new Singleton(id) : new Singleton();
		return Singleton.singleton;
	}
	
//	public static Singleton getInstance() {
//		if (Singleton.singleton !=null) {
//			return Singleton.singleton;
//		}
//		Singleton.singleton = new Singleton();
//		return Singleton.singleton;
//	}
	
	
	
	public static int singleCount() {
		System.out.println("singleCount : "+ Singleton.singlecount);
		return Singleton.singlecount;
	}
	
	private Singleton(String id){
		this.id = id;
		System.out.println("싱글톤 수"+ ++singlecount);
	}
	
	public void info() {
		System.out.println("아이디는 > "+ this.id);
		System.out.println("싱글톤 카운트 > "+ Singleton.singlecount);
	}
}
