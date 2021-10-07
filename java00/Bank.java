public class Bank
{
public static void main(String[]args)
{
Bank Cashier = new Bank();
Cashier.deposit();
Cashier.withdraw();
}
void deposit();
{
System.out.println("depositing");
}
void withdraw();
{
System.out.println("withdrawing");
}
}