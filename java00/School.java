public class School
{
String name;
int grade;
int age;
public static void main(String[] args)
{
School student1 = new School();
	School student2 = new School();
	// In a school there are so many students and we cant create 
	//an seperate object for each of them//
student1.name = "Karthick";
student1.grade = 1;
student1.age = 25;
student2.name = "Karthick";
student2.grade = 1;
student2.age = 25;
System.out.println(student1.name);
System.out.println(student1.grade);
System.out.println(student1.age);
System.out.println(student1.name);
System.out.println(student1.grade);
System.out.println(student1.age);
}
}