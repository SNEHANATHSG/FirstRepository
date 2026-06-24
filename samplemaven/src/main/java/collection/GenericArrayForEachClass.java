package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericArrayForEachClass {

	public static void main(String[] args) {
		int arr[]= {23,56,78,43};
		//Generic array forEach class
		for(int d:arr)
		{
			System.out.println(d);
		}
		//generic set foreEach class
		Set <String> f = new HashSet <String>();
		f.add("java");
		f.add("python");
		f.add("html");
		for(String h:f)
		{
			System.out.println(h);
		}
        //non generic list forEach class
		List k = new ArrayList();
		k.add("leaf");
		k.add(56);
		k.add(45.6f);
        for(Object r:k)
        {
        	System.out.println(r);
        }
	}

}
