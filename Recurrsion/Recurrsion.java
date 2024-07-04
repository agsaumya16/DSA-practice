public class Recurrsion
{
	public static void main(String S[])
	{
	 print(1);
	}
	static void print(int n)
	{
		if (n==5){
			System.out.println(5);
			return;
		}
		System.out.println(n);
		print(n+1);
	}

}