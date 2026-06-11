package superkeyword;

public class SuperChild extends SuperParent{
	String name="Child";//instance variable
	public SuperChild()//constructor
	{
		super();
		System.out.println("Child constructor");
	}
    void show()//default method
    {
    	System.out.println("Child method");
    }
    void display()
    {
    	System.out.println("Child variable: "+name);
    	System.out.println("Parent variable: "+super.name);//Accessing parent's and child variables
    	
    }
    void showCase()
    {
    	show();//calls child method
    	super.show();//calls parent method
    }
    
	public static void main(String[] args) {
		SuperChild obj=new SuperChild();
		obj.display();
		obj.showCase();
		
		

	}

}
