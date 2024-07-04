import java.util.Arrays;
import java.util.Scanner;

public class multi_array
{
	public static void main(String S[])
	{	
		Scanner input =new Scanner(System.in);
		int[][] arr= new int[3][3];
		for (int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr[r].length;c++)
			{
				arr[r][c]=input.nextInt();	
			}

		}
		for(int[] a:arr)
		{
			System.out.println(Arrays.toString(a));
		}

	}	
}
