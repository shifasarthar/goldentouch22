package earnlearn;

public class TestGenericMethod {

	public static <E>void printArray(E[]elements){
		for(E element:elements) {
			System.out.println(element);
		}
		System.out.println();
	}
	public static void main(String args[]) {
		Integer[]intArray= {100,200,300,400,500};
		Character[]charArray= {'J','A','V','A'};
		
		System.out.println("Printing Integer Array");
		printArray(intArray);
		
		System.out.println("Printing Character Array");
		printArray(charArray);
	}
}
