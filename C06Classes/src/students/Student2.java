/*
 * 필드에 값 넣기, 객체에 값 넣기
 */

package students;

public class Student2 {

	// 1. 필드에 값 넣기
	// 보통 공통되는 변수에만 값을 넣어줌
	String sNumber;
	String name;
	String major;
	String grade = "1학년";
	int age=33;
		
	public static void main(String[] args) {
		
		
		// 객체 생성
		// 2. student1 객체 생성
		Student2 student1 = new Student2();
		student1.sNumber = "1234";
		student1.name = "홍";
		student1.age = 34;
		student1.major = "컴공";
		student1.grade = "2학년";
		
		System.out.println("학번 : "+ student1.sNumber);
		System.out.println("이름 : "+ student1.name);
		System.out.println("학과 : "+ student1.major);
		System.out.println("나이 : "+ student1.age);

		// 4-2. student2 객체 생성
		Student2 student2 = new Student2();
		System.out.println("학번 : "+ student2.sNumber);
		System.out.println("이름 : "+ student2.name);
		System.out.println("학과 : "+ student2.major);
		System.out.println("나이 : "+ student2.age);
		
		// 4-3. 두 객체는 다르다.
		System.out.println("student1 = student2 ? : "+(student1 == student2));
	}

}
