package SeleniumMethods;

public class TryCatchMethod {
	
	public static void main(String[] args) {
		
		try {
			
//			System.out.println("Hello Hero");
			int i = 1/0;
			
		} catch (Exception blu) {
			System.out.println("Im inside");
//			System.out.println("Message is : " + blu.getMessage());
//			blu.getStackTrace();
			}
	}

}
