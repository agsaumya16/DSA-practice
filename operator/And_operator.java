import java.util.Scanner;
public class And_operator
{
	public static void main(String S[])
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		boolean ans=findEvenOdd(num);
		System.out.println(ans);
   
	}
	static boolean findEvenOdd(int num)
	{
		return (num&1)==1;
	}
}