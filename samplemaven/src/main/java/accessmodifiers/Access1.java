package accessmodifiers;

public class Access1 {
	public void display1()//public method
	{
		System.out.println("public");
	}
	private void display2()//private method
	{
		System.out.println("private");
	}
	protected void display3()//protected method
	{
		System.out.println("protected");
	}
	void display4()// default method
	{
		System.out.println("default");
	}
	
    public static void main(String args[])
    {
    	
    	Access1 obj=new Access1();
    	obj.display1();
    	obj.display3();
    	obj.display2();  
    	obj.display4();
  
    	
    }
}
