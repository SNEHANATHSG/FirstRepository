package inheritance;

public class MultiLevelChild extends MultiLevelParent {

	
		public int add(int a, int b)
		{
			int c=a+b;
			return c;
		}

	public static void main(String args[])
	{
		MultiLevelChild obj = new MultiLevelChild();
		System.out.println(obj.add(12, 34));
		obj.show();
		obj.display();
	}
	}

      
