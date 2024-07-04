import java.util.Arrays;
public class Selection_sort
{
	public static void main(String S[])
	{
		int[] arr={6,3,4,2,8,7,5};
		Selection(arr);
		System.out.println(Arrays.toString(arr));	 	
	}
	static void Selection(int[] arr)
	{	
		for(int i=0;i<arr.length-1;i++)
		{	int max=0;
			for(int j=0;j<arr.length-i;j++)
			{	
				if(arr[j]>arr[max])
				{
					max=j;
				}

			}
			int temp=arr[arr.length-1-i];
			arr[arr.length-1-i]=arr[max];
			arr[max]=temp;

			
		}
	}

} 