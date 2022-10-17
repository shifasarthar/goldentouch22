import java.util.Scanner;
public class SalesTaxCalculator {

	public static void main(String args[])
	{
		final double SALES_TAX_RATE=0.07;
		final int SENTINEL=-1;
		
		double price,actualPrice,salesTax;
		double totalPrice=0.0,totalActualPrice=0.0,totalSalesTax=0.0;
		
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
		price=in.nextDouble();
		
		while(price!=SENTINEL)
		{
			salesTax=SALES_TAX_RATE*price;
			actualPrice=price-salesTax;
			
			totalPrice=actualPrice+salesTax;
			totalActualPrice=actualPrice+actualPrice;
			totalSalesTax=salesTax+salesTax;
			
			System.out.println("Actual price is $"+String.format("%.2f",actualPrice));
			System.out.println("Sales Tax is $"+String.format("%.2f",salesTax));
			
			System.out.print("Enter the tax-inclusive price in dollars(or -1 to end): ");
			price=in.nextDouble();
			
		}
		System.out.println("Total price is:"+String.format("%d.2f", totalPrice));
		System.out.println("Total Actual Price is:"+String.format("%.2f",totalActualPrice));
		System.out.println("Total Sales Tax is:"+String.format("%.2f",totalSalesTax));
	}
}
