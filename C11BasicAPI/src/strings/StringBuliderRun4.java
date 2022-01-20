package strings;

public class StringBuliderRun4 {
	public static void main(String[] args) {
		// 1. 경로 적어주고 출력
		StringBuilder filePath = new StringBuilder("C:/Users/user/.conda/environments.txt");
		System.out.println("filePath : " + filePath);

		// 2. 경로 크기랑, / 위치 찾는거 출력
		int fileLen = filePath.length();
		int fromIndex = filePath.indexOf("/", 0) + 1;
		System.out.println("fileLen : " + fileLen + " fromIndex : " + fromIndex);

		// 3. 경로 크기가 0보다 크고, / 위치가 1보다 작다(/가 없다)
		// / 위치는 0으로 설정
		if (fileLen > 0 && fromIndex < 1) {
			fromIndex = 0;
		}
		
		if(fileLen > 0 && fromIndex == fileLen) {
			String fileName = filePath.substring(0, fromIndex-1);
			System.out.println("fileName : "+fileName);
		}
		
		// 4. 경로 크기가 0보다 크고, / 위치가 있을 동안에
		while (fileLen > 0 && fromIndex >= 0 && fromIndex < fileLen) {
			int filePos = filePath.indexOf("/", fromIndex); // filePos는 /의 위치 (시작위치는 fromIndex)
			System.out.println("fileLen : " + fileLen + " fromIndex : " + fromIndex + " filePos : " + filePos);

			// 5. /
			if (filePos < 0) {
				if (fromIndex < fileLen) {
					String fileName = filePath.substring(fromIndex);
					System.out.println("fileName : " + fileName);
				}
				break;
			}
			String fileName = filePath.substring(fromIndex, filePos);
			System.out.println("fileName : " + fileName);
			fromIndex = filePos + 1;
		}

	}

}
