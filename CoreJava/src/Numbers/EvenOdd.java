package Numbers;
public class EvenOdd {
//Using % Symbol
	public static void CheckEvenOdd(int num) {
		if(num==0) {
			return;
		}
		if(num %2 != 0) {
			System.out.println(num+ " is Odd");
		}
		else {
			System.out.println(num+ " is Even");
		}
	}
	
//Without using % Symbol.
	public static void isEvenOdd(int num) {
		if(num==0) {
			return;
		}
		else if((num & 1)==1) {
			System.out.println(num+ " is Odd");
		}
		else {
			System.out.println(num+ " is Even");
		}
		
	}

//Without using Logical & Operator.
	public static void EvenOrOdd(int num) {
		if(num==0) {
			return;
		}
		if((num/2)*2==num) {
			System.out.println(num+ " is Even");
		}
		else {
			System.out.println(num+ " is Odd");
		}
	}
	public static double salIncrease(double inSal) {
	    double finalSal = inSal; // Initialize finalSal with the initial salary
	    for (int i = 0; i < 3; i++) {
	        finalSal =  finalSal * 1.10; // Increase the salary by 10%
	    }
	    return finalSal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=333;
		System.out.print(salIncrease(100.00));
	}

}
