public class reverse
{
	/*static int sum=0;
	static void rev(int n){
		if(n==0)
		{
			return;
		}
		int rem=n%10;
		sum=sum+10*rem;
		revl(n/10);
	}*/
	static int rev2(int n)
	{
		int digits =(int)(Math.log10(n))+1;
		return helper(n,digits);
	}
	static int helper(int n,int digits )
	{
		if(n%10==n)
		{
			return n;
		}
		int rem=n%10;
		return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);	
	}
	static boolean palin(int n)
	{
		return n==rev2(n);
	}
	public static void main(String S[])
	{	System.out.println(palin(1244321));
		//System.out.println(sum);
	}
}