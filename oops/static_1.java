public class static_1
{
	public static void main(String S[])
	{
	//human rahul=new human(20,"Rahul");
	//human kunal=new human(21,"kunal0");
	System.out.println(human.population);
	//System.out.println(human.population);
	}
	static void fun(){
		greeting();
	}
	static void greeting(){
		System.out.println("Hello World");
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
