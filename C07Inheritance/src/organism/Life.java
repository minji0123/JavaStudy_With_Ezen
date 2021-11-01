/*
 * [생명체]
 * 1. 식물, 동물
 * 2. 각 생명체의 특징을 도출해서 속성화(필드)
 * 3. 각 생명체의 행위를 도출해서 메소드화
 * 4. 최소 3~4단계로 계층화하여 상속단계를 만듦
 */
package organism;

public class Life {

	int age;
	boolean breath;
	
	public Life(int age, boolean breath) {
		this.age = age;
		this.breath = breath;
		System.out.print("[생명]");
	}
	
	
}
