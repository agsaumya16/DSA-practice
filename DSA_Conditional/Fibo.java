import java.util.Scanner;
public class Fibo
{
	public static void main(String S[])
	{
		Scanner input=new Scanner(System.in);
		int num= input.nextInt();
		int z=0;
		int o=1;
		int count=2;
		while(count<=num)
		{
			int temp=o;
			o=z+o;
			z=temp;
			count++;
		

		}
		System.out.println(o);
			
	}

}
