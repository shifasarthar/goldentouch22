import java.util.Scanner;
public class PensionCalculator {

	public static void main(String args[])
	{
		Scanner X=new Scanner(System.in);
		float basicPay=0;
		float employeeFund=0;
		
		float employerFund=0;
		float PensionFund=0;
		
		System.out.printf("Enter basic pay: ");
		basicPay=X.nextFloat();
		
		employeeFund=(basicPay/100)*12.0F;
		employerFund=(basicPay/100)*3.67F;
		PensionFund=(basicPay/100)*8.33F;
		
		System.out.printf("Basic Pay: %f\n",basicPay);
		System.out.printf("Employee contribution: %f\n",employeeFund);
		System.out.printf("Employer contribution: %f\n",employerFund);
		System.out.printf("Pension contribution: %f\n",PensionFund);
		
	}
}
