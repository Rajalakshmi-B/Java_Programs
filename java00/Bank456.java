public class Bank456
{
public static void main(String[] args)
{
Bank456 saving = new Bank456();//object saving created
saving.deposit();//method deposit without argument called
Bank456 saving2 = new Bank456();//object saving2 created
saving2.deposit(500);//method deposit with parameters called
	saving2.custname("karthick");
}
void deposit()
{
System.out.println("no deposit");
}
	void deposit(int box)
{
System.out.println("deposit amount is" +box);
}
	void custname( String name)
	{
	System.out.println("customer name is" +name);
	}
}