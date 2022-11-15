package module4;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringJoinerDemo {
	
	public static void main(String args[]) {
		StringJoiner joinStr=new StringJoiner(",");
		joinStr.setEmptyValue("its a empty string...");
		
		joinStr.add("hello");
		joinStr.add("hai");
		System.out.println("joinStr");
		
		joinStr=new StringJoiner(",","[","]");
		
		joinStr.add("hello222");
		joinStr.add("hai222");
		
		System.out.println("joinStr");
		
		StringTokenizer st=new StringTokenizer(joinStr.toString(),",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}