package TEST1;
import java.util.*;
public abstract class Vehicle {
	static Scanner sc=new Scanner(System.in);
	int year_of_manu;
	 abstract public void getdata();
	 abstract public void putdata();
	 public static void main(String[] args) {
			TwoWheeler obj1=new TwoWheeler();
			obj1.getdata();
			obj1.putdata();
			FourWheeler obj2=new FourWheeler();
			obj2.getdata();
			obj2.putdata();
			MyTwoWheeler obj3=new MyTwoWheeler("Rashi","Dio","Black",50000);	
		}
}
class TwoWheeler extends Vehicle{
	String color,brand;
	int cost;
	public void getdata() {
		System.out.println("Enter brand of 2 wheeler");
		brand=sc.next();
		System.out.println("Enter color of 2 wheeler");
		color=sc.next();
		System.out.println("Enter cost of 2 wheeler");
		cost=sc.nextInt();
	}
	public void putdata() {
		System.out.println("Brand is "+brand+"\nColor is "+color+"\nPrice is "+cost);
	}
	
}
final class FourWheeler extends Vehicle{
	String color,brand;
	int cost;
	public void getdata() {
		System.out.println("Enter brand of 4 wheeler");
		brand=sc.next();
		System.out.println("Enter color of 4 wheeler");
		color=sc.next();
		System.out.println("Enter cost of 4 wheeler");
		cost=sc.nextInt();
	}
	public void putdata() {
		System.out.println("Brand is "+brand+"\nColor is "+color+"\nPrice is "+cost);
	}
}
class MyTwoWheeler extends TwoWheeler{
	String name;
	MyTwoWheeler(String ow,String bran,String col,int cos){
		name=ow;
		super.brand=bran;
		super.color=col;
		super.cost=cos;
	}
	void display() {
		System.out.println("Name is "+name+"\nBrand is "+brand+"\nColor is "+color+"\nCost is "+cost);
	}
}

	
