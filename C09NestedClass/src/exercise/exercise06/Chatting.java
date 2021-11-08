/*
 * 다음 Chatting 클래스는 컴파일 에러가 발생합니다. 원인이 무엇입니까?
 */
package exercise.exercise06;

public class Chatting {
	
	void startChat(String chatId) {
		final String nickName = "닉네임";
		
		Chat chat = new Chat() {
			@Override
			public void start() {
			
					String inputData = "안녕하세요";
					String message = String.format("[%s] %s", nickName, inputData);
					sendMessage(message);
				
			}
		};
		chat.start();
	}

	class Chat{
		void start() {}
		void sendMessage(String message) {
			System.out.println("chat : "+message);
		}
	
	}
}
