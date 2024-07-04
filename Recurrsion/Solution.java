import java.util.Arrays;
class Solution {
    public void spiralOrder(int[][] matrix) {
        int row=0;
        int col=0;
	int rl=matrix.length;
	int cl=matrix[0].length;
        int[] arr=new int[matrix.length * matrix[0].length];
	int i=0;
        while(row<matrix.length &col<matrix[0].length )
        {
            arr[i]=matrix[row][col];
	    col++;
	    if(col=matrix[0].length && row=0)
		{
			row++;
		}
		else if(row=matrix.length)
		{
			col--;	
		}
		else if(row=matrix.length-1&& col=0)
		{
			row--;
			col++;	
		}
	
        }
	System.out.println(Arrays.toString(arr));
        
    }
}