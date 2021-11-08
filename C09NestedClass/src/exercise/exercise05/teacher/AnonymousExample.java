package exercise.exercise05.teacher;

public class AnonymousExample {
	public static void main(String[]args) {
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		// 파라미터 익명 객체로 전달
		anony.method2(new Vehicle(){
			
			@Override
			public void run() {
				System.out.println("anony : 트럭이 움직인다.");
			}
		});
		
		// 만들어놓은것을 계속 재활용
		anony.field2.run();
		anony.field3.run();
		anony.field4.run();
		anony.field5.run();
		anony.method2(new Bicycle());
		
	}

}
