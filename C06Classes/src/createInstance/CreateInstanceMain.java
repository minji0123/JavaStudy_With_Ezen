package createInstance;

public class CreateInstanceMain {

	public static void main(String[] args) {
		// privite로 막혀있기 때문에 new불가능
//		CreateInstance ci = new CreateInstance();
		String []array1 = {"plus", "1", "2"};
		
		
		CreateInstance ci = CreateInstance.createInstance(array1);
		if (ci != null) {
			ci.print();
		}
		else {System.out.println("잘못된 파라미터를 전달했다.");}
		CreateInstance c0 = CreateInstance.createInstance(new String[] {});
		c0.print();
		if (c0 != null) {
			c0.print();
		}
		

	}

}
