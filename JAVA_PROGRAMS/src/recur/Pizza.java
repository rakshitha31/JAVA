//Basic inheritance

package recur;

abstract public class Pizza {
	String item_name="Margherita";
	int price=100,quantity=3;
	final  float calculate() {
		return(price*quantity);
	}
	public static void main(String[] args) {
		CheesePizza obj=new CheesePizza();
		obj.Display();
	}

}
class CheesePizza extends Pizza{
	
	void Display() {
	System.out.println("The price is "+calculate());
	}
}

