public class BS_Recurrsion
{
	public static void main(String S[])
	{
		int[] arr={12,23,33,34,45,56,76,78,89,99};
		int target=34;
		System.out.println(search(arr,target,0,arr.length-1)); 
	}
	static int search(int[] arr,int target,int s,int e)
	{
		if(s>e)
		{
			return-1;
		}
		int mid= s+(e-s)/2;
		if(arr[mid]==target)
		{
			return mid;
		}
		if(arr[mid]>target)
		{
			return search(arr,target,s,mid-1);
		}
		return search(arr,target,mid+1,e);
		
		

	}
}