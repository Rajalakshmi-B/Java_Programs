public class School3
{
String name;
int grade;
int age;
	String dept;
	int fees;
public static void main(String[] args)
{
School3 student1 = new School3("ABI",1,23);
School3 student2 = new School3("ARUN",2,23);
	School3 student4 = new School3("science",9000);
	School3 student5= new School3("commerce",7000);
	student2.display();
	student1.display();
	student5.display();
	student4.display();
		
}
	 public School3(String name,int grade,int age)
	 {
		 this.name = name;
		 this.grade = grade;
		 this.age = age;
		 this.dept = dept;
		 this.fees = fees;
	 }
	 public School3(String dept,int fees)
	 {
		 this.dept = dept;
		 this.fees = fees;
	 }
	 public void display()
	{
		System.out.println(name);
		System.out.println(grade);
		System.out.println(age);
		 System.out.println(dept);
		System.out.println(fees);
	}
}

	
	