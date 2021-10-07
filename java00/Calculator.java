public class Calculator
{
public static void main(String[] args)
{
Calculator calcobj1 = new Calculator();// 
int output=calcobj1.add(65,89); 
	
System.out.println("addition value is:"+ output);//this is optional only if we want to see the value
}
	public int add(int no1,int no2)//method of return datatype int instead of void
{
		
	//int no1=15; int no2=54;
//stem.out.println("addition value is:"+(no1+no2));
	return no1+no2;// return value if outcome is visible
}
}
