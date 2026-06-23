package interfacepackage;

public class Interface2 implements Interface1 {
	public void showCase()
	{
		System.out.println("output of showcase");
	}
	
	public static void main(String[] args) {
		Interface2 obj = new Interface2();
		obj.showCase();
		obj.show();
		obj.display();
		Interface1 ref = new Interface2();
		ref.display();
		ref.show();//reference is created
		
	}

	@Override
	public void display() {
		System.out.println("display output");
		
	}

	@Override
	public void show() {
		System.out.println("show output");
		
	}
		

}
