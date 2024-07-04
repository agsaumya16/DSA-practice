import java.util.Scanner;

public class Greatest_number
{
	public static void main(String S[])
	{
		Scanner input = new Scanner(System.in);
		{
			int x=Integer.parseInt(input.nextLine());
			int y=Integer.parseInt(input.nextLine());
			int z=Integer.parseInt(input.nextLine());
			int max=x;
			if(y>max)
			{
				max=y;
			}
			if(z>max)
			{
				max=z;
			}
			System.out.println(max);			
		}


	}
}