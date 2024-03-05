package Numbers;

public class MaxOfTwoNo {
// Using Comparator Operator
	public static int Comparator(int a,int b) {
		if(a==b) {
			return a;
		}
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	
//Without using Cpmparator
	public static int NoComparator(int a, int b){
		return (a+b+Math.abs(a-b))/2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NoComparator(5,6));
	}

}
