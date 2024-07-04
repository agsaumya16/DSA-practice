class shapes{

	void area()
	{
		System.out.println("Area of a shape");
	}
}
class circle extends shapes{

	void area()
	{
		System.out.println("Area of a circle");
	}
}
class square extends shapes{

	void area()
	{
		System.out.println("Area of a square");
	}
}
class triangle extends shapes{

	void area()
	{
		System.out.println("Area of a triangle");
	}
}
public class poly
{
	public static void main(String S[])
	{
		square sq=new square();	
		circle cr=new circle();
		sq.area();	
		shapes sh=new square();
		sh.area();
	}	

}