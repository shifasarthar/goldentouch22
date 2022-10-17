import java.util.Scanner;
public class AverageWithInputValidation {

	public static void main(String args[])
	{
		final int Num_STUDENTS=3;
		int numberIn,studentNo;
		boolean isValid,notValid;
		int sum=0;
		double average;
		
		Scanner sc=new Scanner(System.in);
		average=sc.nextDouble();
	
		//System.out.println("Enter the mark(0-100)for student 1:"+numberIn);
		//System.out.println("Enter the mark(0-100)for student 2:"+numberIn);
		//System.out.println("Enter the mark(0-100)for student 3:"+numberIn);
		
		for(studentNo=1;studentNo<=Num_STUDENTS;++studentNo)
		{
	    System.out.println("Average is"+average);
		isValid=true;
		do {
			System.out.println("Enter the mark(0-100)for student 1:"+numberIn);
			numberIn=sc.nextInt();
			System.out.println("Enter the mark(0-100)for student 2:"+numberIn);
			numberIn=sc.nextInt();
			System.out.println("Enter the mark(0-100)for student 3:"+numberIn);
			numberIn=sc.nextInt();
			notValid=false;
		}while(isValid);
		sum+=average;
		}
		
		
	}
}
