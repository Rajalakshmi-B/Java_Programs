public class Bank20
{
	static int bankbalance = 1000000;//static or class variable or class specific , keyword static
	int custbalance;// object specific variable only declared
public static void main(String[] args)
{
	Bank20 customer1 = new Bank20();// object created
	customer1.custbalance = 5000;
	Bank20 customer2 = new Bank20();// object created
	customer2.custbalance = 53;
	Bank20 customer3 = new Bank20();// object created
	customer3.custbalance = 502;
	customer1.deposit(1000);//method calling
	
	System.out.println(Bank20.bankbalance);// static variable or class variable accessed by class
	System.out.println(customer1.bankbalance);
	System.out.println(customer1.custbalance);// static variable or class variable accessed by object
	System.out.println(customer2.custbalance);
	System.out.println(customer3.custbalance);
	//System.out.println(Bank20.custbalance);// shows an error msg as a stativ variale trying to access a non static varie object var
	//System.out.println(custbalance);non static var cant be cannot be referred from static context as main method is a static ..
}
	void deposit(int amt) // method created
	{
		System.out.println(" Customer deposit amount:" +amt);
	}
}