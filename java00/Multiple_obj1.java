public class Multiple_obj1
{
public static void main(String[] args)
{
Multiple_obj1 object1 = new Multiple_obj1();//object name object1, and object is new Obj_method()
Multiple_obj1 object2 = new Multiple_obj1();
Multiple_obj1 object3 = new Multiple_obj1();
object1.display();
	object1.deposit();
	object1.withdraw();
object2.deposit();
object3.withdraw();// display method is called by object1
}
public void display()
{
System.out.println("Hi! How are you");
}
public void withdraw()
{
System.out.println("Please enter the amount to withdraw");
}
public void deposit()
{
System.out.println("Please enter the amount to deposit");
}
}