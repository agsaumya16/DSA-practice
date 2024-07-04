import java.util.Scanner;
public class Function
{
	public static void main(String S[])
	{
		//sum();
		//int ans=sum_2();
		//System.out.println(ans);
		String message=greet();
		System.out.println(message);

		

	}
	static void sum()
	{
		Scanner input=new Scanner(System.in);
		int num_1=input.nextInt();
		int num_2=input.nextInt();
		int sum=num_1+num_2;
		System.out.println(sum);

		
	}
	static int sum_2()
	{
		Scanner input=new Scanner(System.in);
		int num_1=input.nextInt();
		int num_2=input.nextInt();
		int sum=num_1+num_2;
		return sum;
		
	}
	
	static String greet()
	{
		String greetings="Hello,Namaste";
		return greetings;
	}

	
}