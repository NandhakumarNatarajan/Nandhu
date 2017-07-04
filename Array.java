import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" Elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("How many times do you want to rotate");
		int r=sc.nextInt();
	    int temp=0;
		for(int i=0;i<r;i++)
		{
			temp=a[0];
			for(int j=0;j<n;j++)
			{
				if(j!=n-1)
				{
					a[j]=a[j+1];
				}
				else
				{
					a[j]=temp;
				}
			}
		}
		for (int k:a)
		{
		System.out.print(k+" ");	
		}
    }
}