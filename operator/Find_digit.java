//number of digits in any number in base b
import java.util.Scanner;
public class Find_digit
{
	public static void main(String S[])	
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int base=input.nextInt();
		int ans=(int)(Math.log(num)/Math.log(base))+1;
		System.out.println(ans);
	}
}