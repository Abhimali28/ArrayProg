package array;

public class Bus {
String Company ;
int seat ;
double price ;
public Bus(String company, int seat, double price) {
	//super();
	this.Company = company;
	this.seat = seat;
	this.price = price;
	System.out.println("Value Given by Parameterized method");
}
public void displayBus() {
	System.out.println(Company);
	System.out.println(seat);
	System.out.println(price);
}

}
