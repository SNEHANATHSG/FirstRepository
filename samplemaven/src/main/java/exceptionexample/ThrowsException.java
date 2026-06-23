package exceptionexample;

public class ThrowsException {

	public static void main(String[] args) throws VoteEligibilityException {
		int age=14;
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new VoteEligibilityException("Not eligible to vote"); 
		}


	}

}
