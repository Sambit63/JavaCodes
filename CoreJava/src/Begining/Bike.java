//Abstract Class
package Begining;

abstract class Vehicle {
	int noOftyres;
	abstract void Start();
}
class Car extends Vehicle{
	void Start() {
		System.out.println("Starts with Key");
	}
}
class Bike extends Vehicle{
	void Start() {
		System.out.println("Starts with Kick or Switch");
	}
	public static void main(String [] args) {
		Bike b=new Bike();
		b.Start();
		
		Car c=new Car();
		c.Start();
	}
}
