public class Application {
	public static void main(String[] args) {
		
		int value1 = 0, value2 = 1, value3, i;
		
		System.out.printf(value1 + " " + value2);
		
		for(i = 2;i < 50;i++)
		{
			value3 = value1 + value2;
			System.out.printf(" " + value3);
			
			value1 = value2;
			value2 = value3;
		}
				
	}
}
