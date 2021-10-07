public class Bank4
{
public static void main(String[] args)
{
Bank4 saving = new Bank4();//object saving created
saving.deposit();//method deposit without argument called
Bank4 saving2 = new Bank4();//object saving2 created
saving2.deposit(500);//method deposit with parameters called
	saving2.custname("karthick");
	saving2.custbalance(23.1f);
	saving2.custpan(true);
	saving2.custint(8.235);
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
	void custbalance( float balance)
	{
	System.out.println("customer balance is" +balance);
	}
	
	void custpan( boolean pan)
	{
	System.out.println("Is pan card available" +pan);
	}
	void custint( double interest)
	{
	System.out.println("customer name is" +interest);
	}
}