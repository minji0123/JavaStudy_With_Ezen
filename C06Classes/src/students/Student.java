/*
 * 학생정보 클래스
 */
package students;

class Student {

	// 1. 필드
	// 1-1 학생 필드
	// main에서 변수.sno <-- 이렇게 사용 가능
	String sno; 	// 학번
	String name; 	// 이름
	String subject; // 학과
	String major;	// 학년
	School school;
	Student student;
	
	
	// 1-2 학교 정보 필드
//	// 이 필드는 학생 클래스가 아니라, 학교 클래스에 있어야 잘 어울린다.
//	String school_name;		// 학교이름
//	String school_buildyear;// 설립연도
//	String school_address;	// 학교주소

	// 2. 생성자
	// 2-1 기본 생성자
	Student() { 
		System.out.println("생성함수 : 기본생성자");
	}
	
	// 2-2 생성자
	// 생성자 오버로딩

	public Student(String sno, String name, String subject, String major) {
		System.out.println("생성함수 : 학생정보");
		this.sno = sno;
		this.name = name;
		this.subject = subject;
		this.major = major;
	}
	
	
	public Student(String sno, String name, String subject, String major, School school) {
		System.out.println("생성함수 : 학생정보, 학교정보");
		this.sno = sno;
		this.name = name;
		this.subject = subject;
		this.major = major;
		this.school = school;
	}
	Student(Student student){
		this.sno = student.sno;
		this.name = student.name;
		this.subject = student.subject;
		this.major = student.major;
		this.school = student.school;
	}
	void setSchool(School school) {
		this.school = school;
	}
	
	School getSchool() {
		return this.school;
	}

		// 3. 메소드
		// 리턴과 매개변수가 없음
		public void printStudent() {
		// 3-1 리턴을 하게 되면 리턴 밑의 명령이 생략되므로 오류가 발생한다.
		//return;
		System.out.println("[학생정보]");
		
		// 3-2 void로 해놓았기 때문에 return 할 수 없다.
//		int x=0;
//		if (x==0) { return; }
		if(this.sno == null) {
			System.out.println("학생 정보가 비어 있습니다.");
			return;
		}
		
		System.out.println("학번 : " + this.sno);
		System.out.println("이름 : " + this.name);
		System.out.println("학과 : " + this.subject);
		System.out.println("학년 : " + this.major);
		System.out.println("---------------------------------");
//		System.out.println("학교정보 : " + this.school);
//		System.out.println("학교이름 : " + this.school.name);
		if (this.school==null) {
			System.out.println("학교 정보가 비어 있습니다.");
			return;
		}
		this.school.printSchool();
		
	}
		
}
