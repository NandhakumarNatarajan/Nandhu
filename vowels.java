import java.util.Scanner;

public class vowels {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string to be reversed:");
	String s=sc.next();
	StringBuffer s1=new StringBuffer(s);
	StringBuffer s2=s1.reverse();
	String str=new String(s2);
	str=str.replaceAll("[aeiouAEIOU]","");
	System.out.println(str);
}
}
