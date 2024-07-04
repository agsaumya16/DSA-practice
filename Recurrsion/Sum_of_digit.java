//Sum of digits in a given numbers
import java.util.Scanner;
public class Sum_of_digit
{
	public static void main(String S[])
	{	Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int ans=factorial(n);
		System.out.println(ans);
	
	}
	static int factorial(int n)
	{
		if(n==0)
		{
			return 0;
		};
		return n%10+factorial(n/10);
	}
}