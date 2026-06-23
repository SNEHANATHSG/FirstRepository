package abstractionpackage;

public class AbstractClass2 extends AbstractClass1{

	public static void main(String[] args) {
		AbstractClass2 obj = new AbstractClass2();
		obj.show();
		obj.childMethod();
		obj.display();
		

	}

	@Override
	public void show() {
		
		System.out.println("output from show method");
	}
	public void childMethod()
	{
		System.out.println("hello");
	}

}
