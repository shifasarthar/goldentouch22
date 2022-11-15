package module4;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringExperiment {
	public static void main(String args[]) {
		String s="hello world";
		String ss=new String("hello world");
		
		if(s.equals(ss)) {
			System.out.println("Both the strings are equal");
			}
		else {
			System.out.println("the string are not same....");
		}
		System.out.println(s.substring(2));
		System.out.println(s.charAt(3));
		System.out.println(s.indexOf('l'));
		
		System.out.println(s.contains("world"));
		System.out.println(String.join("...","hello","world"));
		
		String x="hell....."; 
 		System.out.println(x);
		System.out.println(x.trim());
		StringJoiner joinstr=new StringJoiner("-");
		System.out.println(joinstr);
		joinstr.add("hello");
		joinstr.add("world");
		System.out.println(joinstr);
		
		
		joinstr=new StringJoiner("-","[","]");
		joinstr.add("hello");
		joinstr.add("world");
		System.out.println(joinstr);
		
		StringTokenizer st=new StringTokenizer("hello-world","-");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		String temp=s;
		s=s+"other world";
		System.out.println(s);
		System.out.println(temp);
		
		StringBuilder sbb=new StringBuilder("string builder string....");
		sbb.append("world...");
		System.out.println("sbb");
	}

		
		
		
		
		
		
	}



