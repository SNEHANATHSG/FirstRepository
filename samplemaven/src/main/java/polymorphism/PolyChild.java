package polymorphism;

public class PolyChild extends PolyParent {
	String name;
	public void display(String name)
	{
		this.name=name;
		System.out.println("The name of child is: "+name);
	}
    public void show()
    {
    	display("Thara");
    	super.display("sneha");
    }
    public PolyChild()
    {
    	super();
    	System.out.println("Paramteterized");
    }
	public static void main(String[] args) {
		PolyChild obj = new PolyChild();
        obj.show();
	}

}
