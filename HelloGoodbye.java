public class HelloGoodbye {
	public static void main( String[] aArgs ) 
	{
		try 
		{
			System.out.println("Hello world");
			System.exit(0);
		} finally {
			System.out.println("Goodbye world");
		}
	}
}
