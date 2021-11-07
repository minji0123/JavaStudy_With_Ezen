package exceptionTWR;

public class AutoCloseTest {

	public static void main(String[] args) {

//      AutoCloseableObj obj = new AutoCloseableObj();

      try(AutoCloseableObj  obj = new AutoCloseableObj()){
    	  
          System.out.println();
      }catch(Exception e){
          System.out.println("exception");
      }
      System.out.println("finish");
  }

}
