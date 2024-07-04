public class Patterns
{
	public static void main(String S[])
	{
		//pattern_1(4);
		//pattern_2(5);
		//pattern_3(5);
		//pattern_4(5);
		//pattern_5(5);
		//pattern_6(5);
		//pattern_7(5);
			pattern_8(4);

	}
	/*static void pattern_1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int col=1;col<=i;col++)
			{
				System.out.print("* ");
			}	
			System.out.println("");
		}
	}*/
	/*static void pattern_2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int col=1;col<=n;col++)
			{
				System.out.print("* ");
			}	
			System.out.println("");
		}
	}*/
	//
	//
	/*static void pattern_3(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int col=1;col<=n-i+1;col++)
			{
				System.out.print("* ");
			}	
			System.out.println("");
		}
	}*/
	/*static void pattern_4(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int col=1;col<=i;col++)
			{
				System.out.print(col );
			}	
			System.out.println("");
		}
	}*/
	/*static void pattern_5(int n)
	{
		for(int i=1;i<2*n;i++)
		{	if (i<=n)
			{
			for(int col=1;col<=i;col++)
			{
				System.out.print("*" );
			}	
			System.out.println("");
			}
			else
			{
				for(int col=1;col<=2*n-i;col++)
			{
				System.out.print("*" );
			}	
			System.out.println("");

			}
		}
		*/
		/*static void pattern_6(int n)
		{
			for(int row=0;row<2*n;row++)
			{
				if(row<=n)
				{
					for(int s=0;s<n-row;s++)
					{
						System.out.print(" ");
					}
					for(int col=0;col<row;col++)
					{
						System.out.print("* ");
					}
					System.out.println("");
				}
				else
				{
					for(int s=0;s<(row-n);s++)
					{
						System.out.print(" ");
					}
					for(int col=0;col<2*n-row;col++)
					{
						System.out.print("* ");
					}
					System.out.println("");

		
				}
				
			}
		}*/
		/*static void pattern_7(int n)
		{
			for(int row=0;row<=2*n-1;row++)
			{	if(row<=n){
				for(int s=0;s<n-row;s++)
				{
					System.out.print("  ");

				}
				for(int col=row;col>0;col--)
				{
					System.out.print(col+" ");
				}
				for(int coll=2;coll<=row;coll++)
				{
					System.out.print(coll+" ");

				}
				System.out.println("");}
				else
				{
					for(int s=0;s<(row-n);s++)
					{
						System.out.print("  ");
					}
					for(int col=2*n-row;col>0;col--)
					{
						System.out.print(col+" ");
					}
					for(int coll=2;coll<=2*n-row;coll++)
					{
						System.out.print(coll+" ");

					}
					System.out.println("");


		
				}

			}	
		}*/
		static void pattern_8(int n)
		{
			for (int row=0;row<=2*n;row++)
			{
				for(int col=0;col<=2*n;col++)
				{
					int num_index=n-Math.min(Math.min(row,2*n-row),Math.min(col,2*n-col));
					System.out.print(num_index);
				}
				System.out.println(" ");
			}
		}
	
	 
	


	
}