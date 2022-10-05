package CoreJavaExcercise;
import java.util.Scanner;
public class SearchingArray {
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		
		int n,x,i=0,flag=0;
		System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		int[]a=new int[n];
		
		System.out.println("Enter the elements:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element you want to find:");
		x=sc.nextInt();
		for(i=0;i<n;i++) {
			if(a[i]==x)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
			
		}
			if(flag==1)
			{
				System.out.println("Element found at position:"+(i+1));
			}
			else
			{
				System.out.println("Element not found");
			}
		}
		
	}


