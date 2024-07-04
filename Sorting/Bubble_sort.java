import java.util.Arrays;
public class Bubble_sort
{
	public static void main(String S[])
	{
		int[] arr={6,3,4,2,8,7,5};
		bubble(arr);
		System.out.println(Arrays.toString(arr));	 	
	}
	static void bubble(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}

			}
		}
	}

}