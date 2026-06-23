package exceptionexample;

public class ExceptionClass2 {

	public static void main(String[] args) {
		int age=14;
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new ArithmeticException("Not eligible to vote"); 
		}

	}

}
