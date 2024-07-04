//Sum of digits in a given numbers
import java.util.Scanner;
public class Concept
{
	public static void main(String S[])
	{	Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		concept(n);
		
	
	}
	static void concept(int n)
	{
		if(n==0)
		{
			return ; 
		}
		System.out.println(n);
		concept(--n);
	}
}