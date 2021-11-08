package throwsExceptions;

public class ThrowsFindClass {

	public static void main(String[] args) {

	}

	public static void findClass() {
		final String StringClass = "java.lang.String";
		try {
			Class clazz = Class.forName(StringClass);
			if (clazz != null) {
				System.out.printf("(%s) class found\n", StringClass);
			}
		} catch (ClassNotFoundException e) {
			System.out.printf("(%s) class not found\n", StringClass);
		}
	}

}
