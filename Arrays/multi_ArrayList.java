import java.util.ArrayList;
import java.util.Scanner;

public class multi_ArrayList
{
	public static void main(String S[])
	{
		Scanner input=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		//add some arraylist
		for(int i=0;i<3;i++)
		{
			list.add(new ArrayList<>());
		}
		//fill that array list
		for(int i=0 ;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				list.get(i).add(input.nextInt());
			}
					
		}
		System.out.println(list);
	}
}