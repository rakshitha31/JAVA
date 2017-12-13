//Passing object as parameter
package recur;

public class Tourist {
	String name="Abc",gender="f";
	int age=20;
	
	public static void main(String[] args) {
		Tourist a=new Tourist();
		MakeMyTrip obj=new MakeMyTrip();
		
		obj.makeiternary(a);
		
	}

}
class MakeMyTrip{
	int dateofjourney=7;
	String departurePoint="blore",arrivalPoint="mysore";
	void makeiternary(Tourist a) {
		System.out.println("Name is "+a.name+"\nGender: "+a.gender+"\nAge is "+a.age);
		System.out.println("Date of journey is "+dateofjourney+"\nDeparture: "+departurePoint+"\nArrival: "+arrivalPoint);
	}

	
}
