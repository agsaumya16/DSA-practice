import java.util.Arrays;
public class Insertion_Sort
{
	public static void main(String S[])
	{
		int[] arr={76,87,89,98,23,34,43,54,65,-56,0};
		sort(arr);
		System.out.println(Arrays.toString(arr));	
	}
	static void sort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}	
		}
	}
}