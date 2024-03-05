package Begining;

public class Constructor {  //Constructor
	int a=10;
	static int b=20;
	void add() {
		int c=30,d;
		d=a+b+c;
		System.out.print("The Sum is-"+d);
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Constructor c=new Constructor();
		c.add();
	}

}
