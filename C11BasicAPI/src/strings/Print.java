package strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Print {

	public static void main(String[] args) {

	}

	public static String read(String filePath) throws IOException {

		StringBuilder stringBuilder;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			stringBuilder = new StringBuilder();
			fileReader = new FileReader(filePath);
			bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null)
				stringBuilder.append(line).append('\n');

		} finally {
			if (bufferedReader != null)
				try {
					bufferedReader.close();
				} catch (Exception ex) {
					System.out.println(ex); }
			if (fileReader != null)
				try {
					fileReader.close();
				} catch (Exception ex) {
					System.out.println(ex); }
		}

		return stringBuilder.toString();
	}
}
