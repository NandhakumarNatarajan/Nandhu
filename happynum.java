import java.util.Scanner;

public class happynum {
public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
			System.out.println("enter the number: ");
			String s=sc.next();
			int a=s.length();
			int rem=0;
			int flag=0;
			if(a>=2){
			while(a!=1){
				int sum=0;
			for(int i=0;i<a;i++)
			{
				rem=(int) Math.pow(Integer.parseInt(s.substring(i, i+1)),2);
				sum=sum+rem;
			}
			s=String.valueOf(sum);
			if(sum==1)
			{
				flag=1;
				System.out.println("happy number");
				a=1;
			}
		}
			if(flag==0){
				System.out.println("unhappy number");
			}
			}
			else
				System.out.println("string must contain 2 element");
			
		}
		}



