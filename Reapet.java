import java.util.Scanner;

public class Reapet {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i,j,k=0;
	System.out.println("Enter the array");
	int n=sc.nextInt();
	int a[]=new int[n];
	int dup[]=new int[n];
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			if(a[i]==a[j]){
				dup[k]=a[i];
				k++;
				break;
		}
	}}
			for(i=0;i<k;i++){
				System.out.println(dup[i]);
			}
	
}

}
