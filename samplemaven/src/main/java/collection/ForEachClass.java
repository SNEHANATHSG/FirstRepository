package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ForEachClass {

	public static void main(String[] args) {
		//generic list
		List <String> v = new ArrayList<String>();
		v.add("pen");
		v.add("pencil");
		v.add("paper");
		v.add(null);
		
		for(String d:v)
		{
			System.out.println(d);
		}
		//non generic set
        Set s = new HashSet();
        s.add(3);
        s.add("sneha");
        s.add(null);
        for(Object c:s)
        {
        	System.out.println(c);
        }
	}  //Array-generic
	//gneric set
	//non generic list

}
