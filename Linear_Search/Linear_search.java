import java.util.Arrays;
public class Linear_search
{
	public static void main(String S[])
	{
		int[] arr={45,23,56,57,5,3,23,5,4,65};
		int target=57;
		int ans = search(arr,target);
		System.out.println(ans);
	}
	static int search(int[] arr, int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				return i;	
			}	
		}
		return 0;
	}
}