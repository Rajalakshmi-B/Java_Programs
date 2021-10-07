public class Multiple_obj
{
public static void main(String[] args)
{
Multiple_obj object1 = new Multiple_obj();//object name object1, and object is new Obj_method()
Multiple_obj object2 = new Multiple_obj();
Multiple_obj object3 = new Multiple_obj();
object1.display();
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