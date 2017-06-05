import java.util.Scanner;

public class Nandha {
public static void main(String args[])
{
	System.out.println("enter the string");
	Scanner input=new Scanner(System.in);
	String str= input.next();
	StringBuffer s1=new StringBuffer(str);
	StringBuffer s2=s1.reverse();
	System.out.println(s2);
	
	
	
}
}
