import java.util.Scanner;
public class SumProductMInMax {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		double average;
		int count=0,sum=0,num,min=0,max=0;
		
		System.out.println("Please enter the numbers you wish to evalute: ");
		
		do { 
			
			num=scan.nextInt();
			sum+=num;
			count++;
		}while(count<3);
		
		average=sum/3;
		
		{
			if(num>max) {
				max=num;
			}
            if(num<min) {
            	min=num;
            }
		}
		System.out.println("Average is: "+average);
		System.out.println("Sum is: "+sum);
		
		System.out.println("Maximum number is: "+max);
		System.out.println("Minimum number is: "+min);
		
	}
}
