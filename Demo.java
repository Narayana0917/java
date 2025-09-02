package demo;

public class Demo {
	public static void main(String[] args) {
		int i=99;
		double d=125.68;
		System.out.println("i="+i);
		System.out.println("d="+d);
		System.out.println("After primitive type conversion");
		d=i;
		System.out.println("i="+i);
		System.out.println("d="+d);
	}
}
