package earnlearn;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo {

	public static void main(String args[]) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("India");
		list.add("Russia");
		
		String s=list.get(1);
		System.out.println("element is:"+s);
		Iterator<String>itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			}
		}
}
