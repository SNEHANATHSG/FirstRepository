package inheritance;

public class SingleChild extends SingleParent{

	public static void main(String[] args) {
		System.out.println(static_name);
		SingleChild obj = new SingleChild();
		System.out.println(obj.name);
		obj.display();

	}

}
