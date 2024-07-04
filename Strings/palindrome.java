public class palindrome
{
	public static void main(String S[])
	{
		String name="abcdba";
		
		System.out.println(check(name));
	}
	static boolean check( String name)
	{
		name=name.toLowerCase();
		for(int i=0;i<=name.length()/2;i++)
		{
			char start=name.charAt(i);
			char end=name.charAt(name.length()-1-i);
			if(start!=end)
			{
				return false;
			}
		}
		return true;

	}
	
}