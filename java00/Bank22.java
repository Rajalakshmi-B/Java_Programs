public class Bank22
{
	static int bankbalance = 1000000;//static or class variable or class specific , keyword static
	int custbalance = 500;// object specific variable
public static void main(String[] args)
{
	Bank22 customer = new Bank22();// object created
	customer.deposit(1000);//method calling
	
	System.out.println(Bank22.bankbalance);// static variable or class variable accessed by class
	System.out.println(customer.bankbalance);// static variable or class variable accessed by object
	System.out.println(customer.custbalance);
	System.out.println(Bank22.custbalance);
	System.out.println(custbalance);
}
	void deposit(int amt) // method created
	{
		System.out.println(" Customer deposit amount:" +amt);
	}
}