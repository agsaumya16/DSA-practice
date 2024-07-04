public class Armstrong
{
	public static void main(String s[])
	{	
		for(int i=100;i<1000;i++)
		{ 
			if(is_armstrong(i))
			{
			System.out.println(i);
			}
			

		}
	}
	static boolean is_armstrong(int i)
	{		int original=i;
			int ans=0;
			while(i>0)
			{
				int r=i%10;
				ans=ans+r*r*r;
				i=i/10;
			
			}
			return ans==original;					
	}
	
}