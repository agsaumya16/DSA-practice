import java.util.Arrays;
public class Colnofixed
{
	public static void main(String S[])
	{
		int[][] arr={
				{1,2,3,4},
				{5,6},
				{7,8,9}
			     };
		for(int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr[r].length;c++)
			{
				System.out.print(arr[r][c]+"");
			}
			System.out.println();
		}
		
	}
}
