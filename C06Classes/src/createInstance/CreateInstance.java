package createInstance;

public class CreateInstance {
	private int x,y,z;
	public String config="";
	
	// 생성자
	private CreateInstance() {
		System.out.println(this.x+ this.y+ this.z);
	};
	
	// 매개변수 있는 생성자
	private CreateInstance(int x, int y, int z) {
		System.out.println("CreateInstance"+ x + y+ z);
		this.x = x;
		this.y = y;
		this.z = this.x+this.y;
	}
	
	// config 세터 메소드
	void setConfig (String config) {
		this.config = config;
	}
	
	// static으로 메소드 return 해줌
	// args 지역배열변수를 매개값으로 하는 메소드	
	public static CreateInstance createInstance(String[]args) {
		
		// args 배열크기가 3보다 작으면 리턴해줌
		if (args.length<3) {
			return new CreateInstance();
		}
		
		// config : 전달받은 args 배열 첫번째 값을 받음
		String config =args[0];
		// x,y, : 전달받은 args 배열 두번째 세번째 값을 int로 변환해서 받음
		int x = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		int z = 0;
		
		// args 배열 첫번째 값이 + 면은 더하기
		if (config.equals("plus")) {
			z = x+y;
		}
		// args 배열 두번째 값이 - 면은 빼기
		else if (config.equals("minus")) {
			z = x-y;
		}
		// args 배열 두번째 값이 아무것도 없으면 null하기
		else {
			return null;
		}
		// obj 변수를 new해줌. 
		// static으로 선언되었던 createInstance 배열 메소드 
		// 매개변수는 x,y,z
		CreateInstance obj = new CreateInstance(x,y,z);
		// obj 변수에 config 세터메소드 넣어줌
		obj.setConfig(config);
		return obj;
	
		
		// 최종 리턴 : CreateInstance(x,y,z)
		// x,y,z는 int
	}
	
	public void print() {
		// 출력은 배열 전부다 
		System.out.println(this.config + this.x + this.y + this.z);
	}
	

}
