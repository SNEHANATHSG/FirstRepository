package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterationClass {

	public static void main(String[] args) {
		Set <String> D = new HashSet <String>();
		D.add("pen");
		D.add("paper");
		D.add("pencil");
		System.out.println(D);
		Iterator i = D.iterator();
        while(i.hasNext())
        {
        	System.out.println(i.next());//next -return next value
        }
        i.remove();
        System.out.println(D);
	}

}
