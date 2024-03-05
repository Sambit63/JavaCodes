package Begining;

class Test {
	public static void isEven(int n) {
		if(n==0) {
			return;
		}
		if((n/2)*2==n) {
			System.out.print("Even num");
		}
		else {
			System.out.print("Odd num");
		}
	}
	public static void main(String[] args) {
		int n=10;
		isEven(n);
	}
}