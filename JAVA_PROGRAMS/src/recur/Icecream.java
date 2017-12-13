package recur;
//Basic Multiple Inheritance

public class Icecream {
	String name,flavour;
	int qty=9,price=10;
	int topay() {
		return(qty*price);
	}
	public static void main(String[] args) {
		Coneice obj=new Coneice();
		obj.display();
		int m=obj.topay();
		System.out.println("The price is "+m);
		Cupice obj2=new Cupice();
		obj2.display();
		
	}
}
class Coneice extends Icecream{
	void display() {
		super.name="Cone";
		System.out.println("Name is"+name);
	}
}
final class Cupice extends Icecream{
	void display() {
		super.flavour="Chocolate";
		System.out.println("flavour is "+flavour);
	}
}
