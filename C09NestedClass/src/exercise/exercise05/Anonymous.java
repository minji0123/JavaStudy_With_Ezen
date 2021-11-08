package exercise.exercise05;

public class Anonymous {
	Vehicle field = new Vehicle() {// 로컬 메소드
		@Override
		public void run() {
			System.out.println("field : 자전거가 움직인다.");
		}
	};
	
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
