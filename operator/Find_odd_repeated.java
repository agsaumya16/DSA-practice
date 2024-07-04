public class Find_odd_repeated
{
	public static void main(String S[])
	{
		int[] arr={2,2,3,4,4,5,5,6,6};
		int ans=oddRepeatation(arr);
		System.out.println(ans);
	}
	static int oddRepeatation(int[] arr)
	{	int ans=0;
		for(int i=0;i<arr.length;i++)
		{
			ans=ans^arr[i];
		}return ans;
	}
}