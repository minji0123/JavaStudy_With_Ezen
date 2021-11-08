package exercise.exercise05;

public class AnonymousExample {
	public static void main(String[]args) {
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle(){// 파라미터 익명 객체로 전달
			
			@Override
			public void run() {
				System.out.println("anony : 트럭이 움직인다.");
			}
		});
	}

}
