## [10장] 예외처리

1. 컴파일오류   
	- 컴파일 할 때 문법오류를 검사   
	- 실행을 시키면 오류가 발생되면서 멈춤   
		- 오타, 빨간줄   
	
2. 실행오류   
	- 런타임 오류   
	- 논리적인 버그   
	- 비정상 종료   
		- 배열 선언 후 for 문 작성 시 배열 범위 오류   
		
3. 예외처리   
	- 실행 중, 비정상적인 오류가 있어도 프로그램을 종료하지 않고 처리를 계속함   
		- 프로그램 실행시, 오류때문에 프로그램을 종료하는 것보다, 어느 부분에서 잘못되었는지 알려주는게 더 나을 때   
		- 실행 오류가 발생되면 사용자에게 오류를 인지할 수 있도록 통보 처리를 하기 위해 사용   
	- RuntimeException 은 Exception를 상속받은 하위 클래스   
		- 자바의 예외 처리 클래스 : Exception   
		- 자바의 실행 예외 처리 클래스 : RuntimeException
	