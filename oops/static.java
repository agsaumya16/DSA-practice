public class static_1
{
	public static void main(String S[])
	{
	human rahul=new human(20,"Rahul");
	human kunal=new kunal(21,"kunal0");
	System.out.println("human.population");
	System.out.println("human.population");
	
	}
}
class human
{
 	int age;
 	String name;
 	static long population;
 	public human(int age,String name)
	{
		this.age=age;
		this.name=name;
		human.population+=1;

	}
}
