import java.util.Scanner;

public class Weekdays {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("enter the day");
String s=in.next();
s=s.toLowerCase();
String workingday="monday tuesday wednesday thursday friday saturday";
if(workingday.contains(s))
{
  System.out.println("true");	
}
else if(s.equals("sunday"))
{
   System.out.println("false");	
}
	}
}

