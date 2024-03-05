//Java Inheritance
package Begining;
 class manimal{
	void eat() {
		System.out.println("Aniaml is Eating");
	}
}
public class Dog extends manimal   {
	void eat() {  
		super.eat();
		System.out.println("Dog is eating");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//manimal d=new Dog();
		Dog d=new Dog();
		d.eat();  

 }
}
