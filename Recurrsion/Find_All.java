import java.util.ArrayList;
public class Find_All
{
	public static void main(String S[])
	{
		int[] arr={1,2,3,4,4,5};
		ArrayList<Integer> ans= findAll(arr,4,0);
		System.out.println(ans);
	}
	static ArrayList<Integer> findAll(int[] arr,int target,int index)
	{	
		ArrayList<Integer> list=new ArrayList<>();
		if(index==arr.length)
		{
			return list;
		}
		if(arr[index]==target)
		{
			list.add(index)	;
		}
		ArrayList<Integer> ansFromBelow=findAll(arr,target,index+1);
		list.addAll(ansFromBelow);
		return list;
	}
 

}