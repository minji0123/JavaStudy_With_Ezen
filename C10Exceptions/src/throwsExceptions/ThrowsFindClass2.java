package throwsExceptions;

public class ThrowsFindClass2 {

	public static void main(String[] args) throws ClassNotFoundException {
		findClass();
	}

	public static void findClass() throws ClassNotFoundException{
		final String StringClass = "java.lang.String";

		Class clazz = Class.forName(StringClass);
		if (clazz != null) {
			System.out.printf("(%s) class found\n", StringClass);

		}

	}
}