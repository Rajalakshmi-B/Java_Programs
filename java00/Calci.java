public class Calci
{
public static void main(String[] args)
{
Calci calcobj1 = new Calci();// 
int output=calcobj1.add(65,89); 
	
System.out.println("addition value is:"+ output);//this is optional only if we want to see the value
}
	public int add(int no1,int no2)//method of return datatype int instead of void
{
	System.out.println("addition value is:"+(no1+no2));//till now no1 =65 and no2=89	
	no1=50;// this causes the values of no1 changed from 65 to 50
		no2=50;//this causes the values of no2 changed from 89 to 50
	//int no1=15; int no2=54;this line shows an error as no1, no2 are already given values assigned/declared in main method
//System.out.println("addition value is:"+(no1+no2));
	return no1+no2;// return value if outcome is visible
}
}