public class Search_in_String
{
	public static void main(String S[])
	{
		String name="Krishna";
		char target='n';
		int ans=search(name,target);
		System.out.println(ans);
	}
	static int search(String name,char target)
	{
		for(int i=0;i<name.length();i++)
		{
			if(target==name.charAt(i))
			{
				return i;	
			}	
		}
		return Integer.MAX_VALUE;
	}
}