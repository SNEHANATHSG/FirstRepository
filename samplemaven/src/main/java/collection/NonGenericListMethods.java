package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethods {

	public static void main(String[] args) {
		List D = new ArrayList();//NON GENERIC LIST
		D.add(null);
		D.add(3);
		D.add("sneha");
		D.add(2.3);
		D.add("athul");
		D.add("sakshi");
		D.add("sakshi");
		System.out.println(D);
		System.out.println(D.get(0));
		System.out.println(D.set(0, "sidharth"));
		System.out.println(D);
		System.out.println(D.indexOf("athul"));
		System.out.println(D.lastIndexOf("sakshi"));
		System.out.println(D.contains("sneha"));
		System.out.println(D.size());
		System.out.println(D.isEmpty());
		System.out.println(D.remove(3));
		System.out.println(D.remove("sakshi"));
		System.out.println(D);
	}

}
