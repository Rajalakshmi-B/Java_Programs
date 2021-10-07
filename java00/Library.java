public class Library
{
static String library_name = "Sri Ramakrishna Library";
static int fees = 500;
	static String readerName;//IF this not kept static it shows error as 
public static void main(String[] args)//non stat var readerName cannot be accessed from static area ie the main method
{                                          // but that is of no use to keep reader as 
Library reader = new Library();// 
reader.readerName = "Raji"; 
System.out.println("Reader name is:"+reader.readerName);
}
}