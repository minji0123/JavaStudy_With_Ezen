package exercise.exercise06.teacher;

public class ChattingRun {

	public static void main(String[] args) {

		Chatting chatting = new Chatting();
		chatting.startChat("iiil");
		
		Chatting.Chat chat = chatting.create("iili");
		chat.start();
	}

}

/*
 * 로컬 메소드에서 선언된 String nickName을 내부 객체에서 사용하면 nickName 은 final 특성을 갖게 된다.
 * 그러므로 선언 후에 값을 대입해서 변경시킬 수 없다.
*/