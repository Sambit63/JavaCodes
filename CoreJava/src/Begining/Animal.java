package Begining;

public class Animal {
	String color;
	int age;
	void initObj(String color,int age) {
		this.color=color;
		this.age=age;
		
	}
	void display() {
		System.out.println(color+" & "+age);
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Animal dog=new Animal();
	dog.initObj("black",10);
	dog.display();
	
  }
}


