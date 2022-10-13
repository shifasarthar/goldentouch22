import java.util.Scanner;
public class AbsoulteDiff {

	public static void main(String args[]) {
		int i,num;
		int sumOdd=0;
		int sumEven=0;
		//int absDiff;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number for num:\n");
		num=scan.nextInt();		
		for(i=1;i<=num;i++)	
		{
			if(i%2==0)
			
				sumEven=sumEven+i;
			
			else 
				sumOdd=sumOdd+i;
			
		}
		
		System.out.println("sumOdd:"+sumOdd);
		//absDiff=(sumOdd>sumEven);
		System.out.println("sumEven:"+sumEven);
	}

}
