public class static_block{
	
		static int a=2;
		static int b;
		static
		{
			b=a*5;
		
		
		}
		public static void main(String S[])
		{
			static_block obj=new static_block();
			System.out.println(static_block.a+" "+static_block.b);
			static_block.b+=3;
			System.out.println(static_block.a+" "+static_block.b);
			static_block obj1=new static_block();
			System.out.println(static_block.a+" "+static_block.b);

		}
		

}
