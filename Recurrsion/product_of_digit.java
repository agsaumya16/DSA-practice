//Sum of digits in a given numbers
import java.util.Scanner;
public class product_of_digit
{
	public static void main(String S[])
	{	Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int ans=product(n);
		System.out.println(ans);
	
	}
	static int product(int n)
	{
		if(n%10==n)
		{
			return n;
		};
		return n%10*product(n/10);
	}
}