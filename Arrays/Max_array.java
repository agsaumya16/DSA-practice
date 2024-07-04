import java.util.Arrays;
public class Max_array
{
	public static void main(String S[])	
	{
		int[] arr ={34,12,54,21,43,65};
		int ans=swap(arr,0,5);
		System.out.println(ans);
	}
	static int swap(int[] array,int index1,int index2)
	{
		int max=array[0];
		for(int i=index1;i<index2;i++)
		{
			if(array[i]>max){
			max=array[i];}
		
		}
		return max;
		
	}
}

