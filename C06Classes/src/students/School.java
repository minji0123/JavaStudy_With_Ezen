package students;

public class School {
	// 학교 정보 필드
	// 이 필드는 학생 클래스가 아니라, 학교 클래스에 있어야 잘 어울린다.
	String name;		// 학교이름
	String buildyear;	// 설립연도
	String address;		// 학교주소
	String telno;		// 전화번호
	
	School(){}
	
	public School(String name, String buildyear, String address) {
		super();
		this.name = name;
		this.buildyear = buildyear;
		this.address = address;
	}
	
	public void printSchool() {
		System.out.println("[학교정보]");
		System.out.println("학교이름 : "+ this.name);
		System.out.println("설립연도 : " + this.buildyear);
		System.out.println("학교주소 : " + this.address);
		System.out.println("전화번호 : " + this.telno);
	}

}
