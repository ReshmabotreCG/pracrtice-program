package streamapi;

import java.util.*; 
class ArrayListOps
{
   public ArrayList<Integer> makeArrayListInt(int n)
   {
	   ArrayList<Integer> list = new ArrayList<>();
	   for(int i=0; i<n;i++)
	   {
		   list.add(0);
	   }
	return list;
   }
   public ArrayList<Integer> reverseList(ArrayList<Integer> list)
   {
	   Collections.reverse(list);
	   return list;
   }
   public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n)
   {
	    ArrayList<Integer> list1 = new ArrayList<>();
		for(Integer i : list)
		{
			if(i==m)
			list1.add(n);
			else
			list1.add(i);
		}
		return list1;
   }
}

public class List{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 25, 33, 28, 10, 12));

		ArrayListOps obj = new ArrayListOps();

		ArrayList<Integer> l1 = obj.makeArrayListInt(4);
		ArrayList<Integer> l2 = obj.reverseList(list);
		ArrayList<Integer> l3 = obj.changeList(l2, 28, 20);

		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
	}
}