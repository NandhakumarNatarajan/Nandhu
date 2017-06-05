import java.util.Scanner;

public class Factorial {
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	System.out.println("enter the number");
	int i,a=1;
       i=in.nextInt();
       for(int j=i;j>=1;j--)
       {
    	   a=a*j;
       }
       System.out.println(a);
	
	
	
}
}