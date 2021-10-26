package exercise15;

public class Member {

	String name = "";
	String id = "";
	String password = "";
	int age = 0;
	boolean loginTF = false;
	Member(){}
	
	
	boolean login (String id, String password) {
		if (this.id.equals("hong") && this.password.equals("12345")) {
			this.loginTF = true;
			return true;
		}
		
		return false;
	}

	
	void logout (String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
