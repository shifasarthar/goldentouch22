
public class SphereComputation {

	public static void main(String args[])
	{
		double r=5.0,surfacearea=0.0,volume=0.0;
		surfacearea=4*3.14*(r*r);
		volume=((double)4/3)*3.14*(r*r*r);
		
		System.out.println("SurfaceArea of Sphere="+surfacearea);
	    System.out.println("Volume of sphere="+volume);	
	}
}
