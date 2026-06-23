package inheritance;

public class MultipleChild implements interface1,interface2{
	
	public static void main(String[] args) {
		interface1 i1 = new MultipleChild();
		i1.student();
		interface2 i2 = new MultipleChild();
		i2.department();		

	}

	@Override
	public void department() {
		System.out.println("output of interface2");
		
	}

	@Override
	public void student() {
		System.out.println("output of interface1");
		
	}

}
