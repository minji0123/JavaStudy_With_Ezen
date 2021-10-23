package students;

public class StudentMain {

	public static void main(String[] args) {

		// 기본 생성자를 이용한 인스턴스 생성
//		Student student1 = new Student();
//		student1.printStudent();
//		System.out.println("THE END");

		// 생성자를 이용한 인스턴스 생성
		Student student2 = new Student("1234", "박찬호", "체육학과", "4학년");
		student2.printStudent();
		System.out.println("THE END");
		
		// 생성자를 이용한 인스턴스 생성
		Student student3 = new Student("1234", "박찬호", "체육학과", "4학년",null );
		student3.printStudent();
		System.out.println("THE END");
		
		Student student4 = new Student(student2);
		student4.printStudent();
		student4.setSchool(new School("서울대", "1960", "서울시 관악구"));
		student2.printStudent();
		student4.printStudent();
	}

}
