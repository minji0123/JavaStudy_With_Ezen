package peopleTeacher;

public class PeopleTest2 {

	public static void main(String[] args) {
		Brother brother = new Brother("돌쇠");
		Sister sister = new Sister("공주");
		brother.work();
		sister.work();
		sister.childBirth(5);
		sister.childBirth(5);
//		brother.childBirth(5);
		brother.hunt();

	}

}
