import java.util.Arrays;
public class Search_in_multi_array
{
	public static void main(String S[])
	{	
		int[][] arr={{1,2,3475},{54,34,33},{32,56},{42}};
		int target=54;
		int[] ans=search(arr,target);
		System.out.println(Arrays.toString(ans));
	}
	static int[] search(int[][] array,int target)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int col=0;col<array[i].length;col++)
			{
				if(array[i][col]==target)
				{
					return new int[]{i,col};
				}	
			}
		}
		return new int[] {0,0};
	}
}