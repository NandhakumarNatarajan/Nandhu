import java.util.Scanner;

public class Longestpalin {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int a=s.length();
	String s1="";
	int k=0;
	String nk="";
	for(int i=0;i<a;i++)
	{
		for(int j=i+1;j<a;j++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				s1=s.substring(i,j+1);
				StringBuffer s2=new StringBuffer(s1);
				StringBuffer s3=s2.reverse();
				String s4=new String(s3);
				
				int n=s4.length();
				if(s1.equals(s4))
				{
					if(n>k)
					{
						nk=s1;
						k=n;
					}
				}
						
				
			}
		}
	}
	System.out.println(nk);
}
}
