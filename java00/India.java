public class India
{
static String capital = "new delhi";// both are global variables one is static another is non static
String citizenName;
public static void main(String[] args)
{
India citizen = new India();
citizen.citizenName = "raji";
System.out.println(India.capital);// class.class variable
System.out.println(citizen.citizenName);// object.object variable
	System.out.println(citizen.capital);//object.class variable
	//System.out.println(India.citizenName);// error : non static variable cannot be referenced from a static context.
}
}