/*
 * while 문과 scanner 를 이용해서 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드 작성
 * -----------------------------------------
 * 
 */
import java.io.BufferedReader;
import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) throws Exception{
		boolean run = true;
		int balance = 0;
		String kindOfMoney = "";
		String inputString;
		
		
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
			System.out.println("--------------------------------------");
			System.out.print("선택> ");
			inputString = scanner.nextLine();
			
				if (inputString.equals("1")) {
//					balance = 10000;
//					kindOfMoney = "예금액";
					System.out.println("예금액>10000");
					}
				else if (inputString.equals("2")) {
//					balance = 2000;
//					kindOfMoney = "출금액";
					System.out.println("출금액>2000");
					}
				else if (inputString.equals("3")) {
//					balance = 8000;
//					kindOfMoney = "잔고";
					System.out.println("잔고>8000");
					}
				else if (inputString.equals("4")) {
//					balance = 0;
//					kindOfMoney = " ";
					run=false;
					System.out.println(" ");
					}
				else {
//					kindOfMoney = "잘못된 값";
					System.out.println("잘못된 값");
				}
		
//				System.out.println(kindOfMoney+">"+balance);
		}//while문 run		
		System.out.println("프로그램 종료");
		

	}

}
