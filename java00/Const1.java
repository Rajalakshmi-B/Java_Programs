public class Const1
{

public static void main(String[] args)
{
Const1 object1 = new Const1();
int dummyvar = object1.add(55,125);
object1.multiply(dummyvar);
System.out.println(dummyvar);// dummyvar holds the value of outcome ie 
}                            // 125+55 =  180
	public void multiply(int input)// dummyvar value is passed to input
	{                               // names different but valuse is same
		
	System.out.println(input*10   );	//180*10
	}

public int add(int no1,int no2)
{
//System.out.println("Hi! How are you");
return no1+no2;// return value is stored in dummyvar
}
}

//The names that relate to a method argument and its  parameter may 
//differ but the values passed are same...