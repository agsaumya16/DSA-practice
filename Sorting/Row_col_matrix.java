import java.util.Arrays;
public class Row_col_matrix
{
	public static void main(String S[])
	{
		int[][] matrix{
				{20,30,40,50},
				{25,35,45,55},
				{26,36,46,56},
				{28,38,48,58}
			    };
		sort(matrix);
		System.out.printl(Arrays.toString(matrix));
		
	}
	static void sort(int[][] matrix)
	{	
		int row=0;
		int col=matrix.length-1;
		while(row<arr.length && c>=0)
		{
			if (matrix[r][c]==target)
			{
				return new int[]{r,c};
			}
			if(matrix[r][c]>target)
			{
				col--;
			}
			if(matrix[r][c]<target)
			{
				row++;
			}

		}
		return new int[]{-1,-1};
		
		
			
	}
}