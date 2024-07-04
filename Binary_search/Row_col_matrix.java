import java.util.Arrays;
public class Row_col_matrix
{
	public static void main(String S[])
	{
		int[][] matrix={
				{20,30,40,50},
				{25,35,45,55},
				{26,36,46,56},
				{28,38,48,58}
			    };
		int target=35;
		
		int[] ans=sort(matrix,target);
		System.out.println(Arrays.toString(ans));
		
	}
	static int[] sort(int[][] matrix,int target)
	{	
		int r=0;
		int c=matrix.length-1;
		while(r<matrix.length && c>=0)
		{
			if (matrix[r][c]==target)
			{
				return new int[]{r,c};
			}
			if(matrix[r][c]>target)
			{
				c--;
			}
			if(matrix[r][c]<target)
			{
				r++;
			}

		}
		return new int[]{-1,-1};
		
		
			
	}
}