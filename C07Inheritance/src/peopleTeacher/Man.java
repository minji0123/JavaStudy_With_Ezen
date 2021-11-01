package peopleTeacher;

public class Man extends People{
	
	Man(){}
	public Man(String name) {
		super(name);
	}
	
	void hunt(boolean tf) {
		System.out.println("Man : hunt()");
	}
	
	void hunt() {
		System.out.printf("Man : hunt(%s)\n",this.name);
	}
	
}
