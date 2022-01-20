package strings;

import java.util.StringTokenizer;

public class StringBuliderRun5 {
	public static void main(String[] args) {

		String filePath = "C:/Users/user/.conda/environments.txt";
//		String filePath = "abc/"
		System.out.println("filePath : " + filePath);

		StringTokenizer st = new StringTokenizer (filePath, "/");
		int tokens = st.countTokens();
		
		System.out.println("countTokens : " + tokens);
		
		for (int cnt=0; cnt<tokens; cnt++) {
			String fileName = st.nextToken();
			System.out.print("countTokens : "+ st.countTokens());
			System.out.println(" fileName : "+fileName);
		}

	}

}
