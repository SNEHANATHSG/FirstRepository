package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSetMethods {

	public static void main(String[] args) {
		Set x = new HashSet();//non generic set creation
		x.add("school");
		x.add("bus");
		x.add("student");
		System.out.println(x);
		Set y = new HashSet();
		y.add("book");
		y.add("pen");
		y.addAll(x);
		System.out.println(y);
		System.out.println(x.contains("pen"));
		System.out.println(y.containsAll(x));
		System.out.println(x.isEmpty());
		System.out.println(y.size());
		System.out.println(y.remove("bus"));
        System.out.println(y);
        y.removeAll(x);
        System.out.println(y);
        x.clear();
      	System.out.println(x);
	}

}
