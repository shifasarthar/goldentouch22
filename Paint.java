package earnlearn;

import java.util.ArrayList;
import java.util.List;

abstract class Paint {
	abstract void color();
}
class RedPaint extends Paint{
	void color() {
		System.out.println("red");
	}
class BluePaint extends Paint{
		void color() {
			System.out.println("blue");
		}
public class Test{
public static void doPaint(List<?extends Paint>lists) {
	for(Paint s:lists) {
		s.color();
	}
}
public static void main(String args[]) {
	List<RedPaint>list1=new ArrayList<RedPaint>();
	list1.add(new RedPaint());
	
	List<BluePaint>list2=new ArrayList<BluePaint>();
	list2.add(new BluePaint());

	
	doPaint(list1);
	doPaint(list2);
	
	List<Water>list3=new ArrayList<Water>();
	list3.add(new Water());
	doPaint(list3);
}
}
class Water{}
}
}