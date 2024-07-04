import java.util.Scanner;
public class Factorial
{
	public static void main(String S[])
	{	Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		long ans=factorial(n);
		System.out.println(ans);
	
	}
	static long factorial(int n)
	{
		if(n<=1)
		{
			return 1;
		};
		return (long)(n*factorial(n-1));
	}
}