public class Library1
{                                       // Constructor
static String name = "Vivekananda Library";
String bookName;
String custName;
int deposit;
	
	public Library1(String custName, String bookName, int deposit)
	{
		this.custName = custName;
		this.bookName = bookName;
		this.deposit = deposit;
		}
	public static void main(String[] args)
	{
	 Library1 Customer1 = new Library1("rahul", "three roses", 500);
		 Library1 Customer2 = new Library1("abdul", "self realisation", 500);
		 Library1 Customer3 = new Library1("anbu", "comics for kids", 500);
		 Library1 Customer4 = new Library1("vidya", "yellow shower", 500);
		Customer1.display();
		Customer2.display();
		Customer3.display();
		Customer4.display();
		
	}
	
	public void display()
	{
		System.out.println("Customer name is :" + custName);
		System.out.println("Book name is :" + bookName);
		System.out.println("deposited amount is  :" + deposit);
	}
}