public class obj_more
{
	public static void main(String S[])
	{
		//Student obj=new Student();
		//obj.rollno=25;
		//System.out.println(obj.rollno);
		Student Rahul=new Student();
		//Rahul.rollno=40;
		//System.out.println(Rahul.rollno);
		/*Student Krish=new Student(2100,"krishna",1000);
		System.out.println(Krish.rollno);
		Student obj=new Student();
		System.out.println(obj.rollno);*/
		/*Student first=new Student(211,"lADDU",111);
		Student Second=new Student(first);

		System.out.println(Second.rollno);*/	
		Student first=new Student(211,"lADDU",111);
		Student Second=first;
		System.out.println(Second.rollno);
		
		
		
	}
}
class Student{
	int rollno;
	String name;
	float marks;
	
	Student(){
		//this.rollno=21;
		//this.name="KC";
		//this.marks=100;
		this(121,"kanha",101)	;
		
	}
	Student(int rn,String naam,float mark){
		this.rollno=rn;
		this.name=naam;
		this.marks=mark;	
		
	}
	Student(Student other)
	{
		this.rollno=other.rollno;
		this.name=other.name;
		this.marks=other.marks;
	}
}