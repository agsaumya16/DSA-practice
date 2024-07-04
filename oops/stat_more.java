public class stat_more{
	public static void main(String S[])
	{	
		/*Human Kunal=new Human(22);
		 
		Human rahul=new Human(22);
		System.out.println(Kunal.population);
		System.out.println(rahul.population);
		*/
		System.out.println(Human.population);
		System.out.println(Human.population);

	}
}
class Human{
	int age;
	static int population;
	Human(int age)
	{
		this.age=age;
		Human.population+=1;

	}

}