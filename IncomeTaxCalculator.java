import java.util.Scanner;
public class IncomeTaxCalculator {

	public static void main(String args[])
	{
		double taxPayable=0,taxableIncome;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Income ");
		taxableIncome=sc.nextDouble();
		
		if(taxableIncome<=20000)
			taxPayable=0;
		else if(taxableIncome<=40000)
			taxPayable=0.1*(taxableIncome-20000);
		else if(taxableIncome<=60000)
			taxPayable=(0.2*(taxableIncome-40000))+(0.1*10000);
		else if(taxableIncome<=80000)
			taxPayable=(0.3*(taxableIncome-60000))+(0.2*20000)+(0.1*10000);
		else
			taxPayable=(0.4*(taxableIncome-100000))+(0.3*50000)+(0.2*20000)+(0.1*10000);
		
		System.out.println("Income Tax amount is "+taxPayable);
	}
}
