
public class Varargs {

	public void method(int...a) {
		for(int i:a) {
			System.out.println(i);
		}
	}
	public static void main(String args[]) {
		Varargs obj=new Varargs();
		obj.method(1,2,3,4,5,6,7,8);
	}
}
