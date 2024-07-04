import java.util.Arrays;
public class Change_Value
{
	public static void main(String S[])
	{
		int[] arr={1,3,5,7,35};
		change(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	static void change(int[] array)
	{
		array[0]=99;
		
	} 
}