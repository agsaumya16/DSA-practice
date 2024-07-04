import java.util.ArrayList;

public class ArrayListExample
{
	public static void main(String S[])
	{
		ArrayList<Integer> list=new ArrayList<>(10);
		list.add(1);
		list.add(11);
		list.add(111);
		list.add(21);
		list.add(31);
		list.add(14);
		list.add(156);
		list.add(145);
		list.add(134);
		list.add(132);
		list.add(156);
		list.add(14);
		list.add(17);
		list.add(71);
		list.add(81);
		list.add(51);
		System.out.println(list);
		System.out.println(list.contains(81));
		list.set(0,99);
		System.out.println(list);
	


		
	}
}