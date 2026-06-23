package exceptionexample;

public class ExceptionClass {
	

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException d){//if we don't know the exception type just give it as exception only
			b=5;
			int c=a/b;
			System.out.println(c);
			System.out.println(d);
		}
		finally
		{
			
		 System.out.println("operation completed");
		}
	}

}
