package CoreJavaExcercise;

public class TypeCasting {
	byte b=21;	
	int x=20;
	double d=100.5;
	long p=30;
	float q=10.60f;
	
	void sum() {   //automatic or implicit conversion
		int z=x+b;
		System.out.println("Sum of two numbers:"+z);
	}
	void sub() {//automatic or implicit conversion
		long r=p-b;
		System.out.println("Subtraction of two numbers:"+r);
	}
	void explicit() { //explicit conversion
		long p=(long)d;
		int x=(int)p;
		System.out.println("Double value"+d);
		System.out.println("Long value"+p);
		System.out.println("Int value "+x);
	}
	public static void main(String args[]) {
		TypeCasting obj=new TypeCasting();
		obj.sum();
		obj.sub();
		obj.explicit();
		
	}
	
}

