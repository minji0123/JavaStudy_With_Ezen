package exercise;

public class ExerciseIF01 {

	int 성인 = 6500;
	int 경로 = 1000;
	int 학생 = 4500;
	int 유아 = 2000;
	int dc;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int fee;
		String people="유아";
		int totFee = 0;
		int num = 0;
		
		
			if(people == "유아") {
				System.out.println("유아");
				totFee += 2000;
				num++;
			}
			if(people == "성인") {
				System.out.println("성인");
				totFee += 6500;
				num++;
			}
			if(people == "경로") {
				System.out.println("경로");
				totFee += 1000;
				num++;
			}
			if(people == "학생") {
				System.out.println("학생");
				totFee += 4500;
				num++;
			}
			

			if(num<11 && num>=20) {
				totFee *= 0.1;
			}
			else if (num<21 && num>=30) {
				totFee *= 0.2;
			}
			
	}

}
