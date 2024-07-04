import java.util.Arrays;
public class Reverse_Array
{
	public static void main(String S[])	
	{
		int[] arr ={34,12,54,21,43,65};
		Reverse(arr,0,5);
		System.out.println(Arrays.toString(arr));
	}
	static int[] Reverse(int[] arr,int start,int end)
	{
		while(end>start)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			end--;
			start++;
		}
		return arr;
		
		
	}
}

