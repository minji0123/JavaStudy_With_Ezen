package exercise.exercise05.teacher;

public class Anonymous {
	Vehicle field = new Vehicle() {// 로컬 메소드
		@Override
		public void run() {
			System.out.println("field : 자전거가 움직인다.");
		}
	};
	
	// 이렇게 사용하는게 정석이다.
	Vehicle field2 = new Bicycle();
	Vehicle field3 = new Bicycle();
	Vehicle field4 = new Bicycle();
	Vehicle field5 = new Bicycle();
	
	// 이런 코드는 일회성이기 때문에 객체가 계속 만들어지고 사라지고를 반복해서 비효율적이다.
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("local : 자동차가 움직인다.");
			}
		};
				
		localVar.run();
	}
	
	void method2(Vehicle v) {
				
		v.run();
	}

}
