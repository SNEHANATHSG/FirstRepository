package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {
	

	public static void main(String[] args) {
		List <String> L = new ArrayList <String>();//generic list creation
		L.add(null);
		L.add("apple");
		L.add("orange");
		L.add("banana");
		L.add("orange");
		System.out.println(L);
        System.out.println(L.get(0));
        L.set(0, "kiwi");
        System.out.println(L);
        System.out.println(L.contains("cherry"));
        System.out.println(L.isEmpty());
        System.out.println(L.indexOf("kiwi"));
        System.out.println(L.indexOf("orange"));
        System.out.println(L.lastIndexOf("orange"));
        System.out.println(L.size());
        System.out.println(L.remove(1));
        System.out.println(L.remove("kiwi"));
        List <Integer> G = new ArrayList <Integer>();
        List <Float> H = new ArrayList <Float>();
	}

}
