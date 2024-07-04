import java.util.Scanner;
public class MagicNumber
{
	public static void main(String S[])
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int ans=0;
		int base=5;
		while(n>0)
		{
			int last=n&1;
			n=n>>1;
			ans=ans +last*base;
			base=base*5;	
		}	
		System.out.println(ans); 	
	}
}