
public class SumAverage {

	public static void main(String args[]) {
		
		int sum=0;
		int number;
		double average;
		
		final int LOWERBOUND =1;
		final int UPPERBOUND =100;
		
		for(number=LOWERBOUND;number<=UPPERBOUND;++number) {
			sum+=number;
		}
		System.out.println("Sum:"+sum);
		average=(double)sum/number;
		System.out.println("Average:"+average);
	}
}
