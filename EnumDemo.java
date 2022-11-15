package jdksevendpack;

public class EnumDemo {
	public static void main(String args[]) {
		Cars c;
		c=Cars.maruthi;
		if(c==Cars.maruthi) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equals");
		}
		switch(c) {
		case maruthi:
		{
			System.out.println("maruthi........."+c);
	    }
		}
		Cars cc[]=Cars.values();
		for(Cars s:cc) {
			System.out.println(s);
		}
		System.out.println(Students.ramu.getAge());
		for(Students s:Students.values()) {
			System.out.println(s+":"+s.getAge());
		}
	}

}
enum Cars{
	maruthi,suzuki,benz,skoda;
}
enum Students{
	ramu(30),somu(40),dummy;
	private int age;
	Students(int age){
		this.age=age;
		}
	Students(){
		this.age=0;
	}
	int getAge() {
		return this.age;
	}
}
class ProcessStudents{
	
	public static void main(String args[]) {
		System.out.println(Students.ramu.getAge());
		for(Students s:Students.values()) {
			System.out.println(s.getAge());
		}
	}
}