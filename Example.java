package demo;

public class Example {
	String name;
	int price;
	double GST;
	int discount;
	int quantity;
	public static void main(String[] args) {
		Example S1=new Example();
		S1.name="Car";
		S1.price=10000;
		S1.GST=12.5;
		S1.discount=40;
		S1.quantity=1;
		System.out.println("Name of the car"+S1.name);
		System.out.println("Price of the car"+S1.price);
		System.out.println("GST of the car"+S1.GST);
		System.out.println("Discount of the Car"+S1.discount);
		System.out.println("Quantity of the cars"+S1.quantity);
		Example S2=new Example();
		S2.name="Bike";
		S2.price=20000;
		S2.GST=22.5;
		S2.discount=20;
		S2.quantity=1;
		System.out.println("Name of the Bike"+S2.name);
		System.out.println("Price of the Bike"+S2.price);
		System.out.println("GST of the Bike"+S2.GST);
		System.out.println("Discount of the Bike"+S2.discount);
		System.out.println("Quantity of the Bike"+S2.quantity);
		Example S3=new Example();
		S3.name="Bus";
		S3.price=1000000;
		S3.GST=15.5;
		S3.discount=20;
		S3.quantity=2;
		System.out.println("Name of the car"+S3.name);
		System.out.println("Price of the car"+S3.price);
		System.out.println("GST of the car"+S3.GST);
		System.out.println("Discount of the Car"+S3.discount);
		System.out.println("Quantity of the cars"+S3.quantity);
		Example S4=new Example();
		S4.name="Jeep";
		S4.price=10000;
		S4.GST=16.5;
		S4.discount=10;
		S4.quantity=3;
		System.out.println("Name of the car"+S4.name);
		System.out.println("Price of the car"+S4.price);
		System.out.println("GST of the car"+S4.GST);
		System.out.println("Discount of the Car"+S4.discount);
		System.out.println("Quantity of the cars"+S4.quantity);
	}
}
