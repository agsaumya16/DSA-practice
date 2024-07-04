import java.util.Scanner;
public class Prime
{
	public static void main(String S[])
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		boolean ans =prime(num);
		System.out.println(ans);
	}
	static boolean prime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		int c=2;
		while(c*c<=num)
		{
			if(num%c==0)
			{
				return false;
			}
			c++;
		}
		return c*c>num;
	}
}