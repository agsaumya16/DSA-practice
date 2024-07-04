import java.util.Arrays;
public class Binary_search
{
	public static void main(String S[])
	{
	 int[] arr={12,23,33,45,56,67,78,89,98,99};
	 int target=56;
	int ans =search(arr,target);
	
		System.out.println(ans);
	}
	static int search(int[] arr,int target)
	{
		int s=0;
		int e=arr.length-1;
		while(s<=e)
		{
			int mid=s+(e-s)/2;
			if(target>arr[mid])
			{
				s=mid+1;
			}
			if(target<arr[mid])
			{
				e = mid-1;
			}
			if(target==arr[mid])
			{
				return mid;
			}
		
			
		}
		return -1;
	}
}



