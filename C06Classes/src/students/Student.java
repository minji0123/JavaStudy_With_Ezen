/*
 * 클래스는 속성과 메소드로 구성
 */

package students;

public class Student {

		// 1. 필드
		// 학생이 가질 수 있는 속성 (맴버필드)
		// property(자원) field(분야) attribute(속성)
		String sNumber; // 학번
		String name;	// 이름
		String major;	// 학과
		int age;		// 나이
		
	public static void main(String[] args) {
		//2. 생성자로 정의 안해주면 사용 불가능
//		sNumber = 1;
		
		// 3. 로컬 변수 선언
		int x = 10;
		String n = new String("홍길동");
		
		// 객체 생성
		// 4-1. student1 객체 생성
		Student student1 = new Student();
		System.out.println("학번 : "+ student1.sNumber);
		System.out.println("이름 : "+ student1.name);
		System.out.println("학과 : "+ student1.major);
		System.out.println("나이 : "+ student1.age);

		// 4-2. student2 객체 생성
		Student student2 = new Student();
		System.out.println("학번 : "+ student2.sNumber);
		System.out.println("이름 : "+ student2.name);
		System.out.println("학과 : "+ student2.major);
		System.out.println("나이 : "+ student2.age);
		
		// 4-3. 두 객체는 다르다.
		System.out.println("student1 = student2 ? : "+(student1 == student2));
	}

}
