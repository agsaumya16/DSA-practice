public class Find_element
{
	public static void main(String S[])
	{
		int[] arr={1,2,3,4,5,6};
		System.out.println(find(arr,4,0));
	}
	static boolean find(int[] arr,int target,int index)
	{
		if(index==arr.length)
		{
			return false;
		}
		return arr[index]==target||find(arr,target,index+1);
	}
}