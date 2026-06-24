package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		Set <String> x = new HashSet<String>();
		x.add("apple");
		x.add("orange");
		x.add("kiwi");
		x.add(null);
		System.out.println(x);
		Set <String> b = new HashSet<String>();
        b.add("pen");
        b.add("pencil");
        x.addAll(b);
        System.out.println(x);
        System.out.println(x.contains(null));
        System.out.println(x.containsAll(b));
        System.out.println(x.size());
        System.out.println(x.isEmpty());
        //x.clear();
        //System.out.println(x);
        System.out.println(x.remove("pen"));//can not add index since set is unordered
        System.out.println(x);
        x.removeAll(b);
        System.out.println(x);
	}

}
