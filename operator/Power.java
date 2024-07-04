public class Power
{
	public static void main(String S[])
	{
		int base=0;
		int power=0;
		int ans=1;
		while(power>0)
		{
			if((power&1)==1)
			{
				ans=ans*base;
			}
			power=power>>1;
			base=base*base;
		}	
		System.out.println(ans);
	}
}