import java.util.Scanner;

public class ascii {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the input1");
	String s1=sc.nextLine();
	System.out.println("enter the input2");
	String s2=sc.nextLine();
	int a=s1.length();
	int b=s2.length();
	int s3;
	for(int i=0;i<a;i++)
	{
		int n=s1.charAt(i);
		encoded(n);
	}	
	System.out.print(" ");
	for(int i=0;i<b;i++)
	{
		if(i==0||i==b-1)
		{
			System.out.print(s2.charAt(i));
		}
		else
		{
			int n=s2.charAt(i);
			encoded(n);
		}
	}
}
static void encoded(int n)
{
	if(n>=97)
	{
		if(n>=97&&n<=122)
		{
			if(n+10<=122)
				  System.out.print((char)(n+10));
				else
					System.out.print((char)(n-16));
		}	}
	else
	{
		if(n>=65&&n<=90)
		{
			if(n+10<=90)
			  System.out.print((char)(n+10));
			else
				System.out.print((char)(n-16));
		}
	}
}
}
