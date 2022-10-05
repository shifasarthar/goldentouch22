package CoreJavaExcercise;

public class CheckLeapYearSwitch {

	public static void main(String args[]) {
		int month=4,year=2022;
		boolean leap=false;
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0)
					leap=true;
				else
					leap=false;
				}
			else
				leap=true;
		}
		else
			leap=false;
		if(leap)
			System.out.println(year+" is a leap year.");
		else
			System.out.println(year+" is not a leap year.");
		
		switch(month) {
		//cases for 31days
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Number of days is 31");
			break;
		//cases for 30days	
		case 4:
		case 6:
		case 9:
		case 11:
		System.out.println("Number of days is 30");
		break;
		
		//cases for 28/29 days
		case 2:
			if((year%400==0)||((year%100!=0)&&(year%4==0)))
				System.out.println("number of days is 29");
			else
				System.out.println("Number of days is 28");
			break;
			
			default:
				System.out.println("Invalid month.");
				break;

		}
	}
}
