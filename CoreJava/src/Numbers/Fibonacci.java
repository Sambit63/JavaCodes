package Numbers;
import java.util.*;
public class Fibonacci {
	static int n1=0,n2=1,n3=0;
public static void useRecursion(int count) {
	
	if(count>0) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(" "+n3);
		useRecursion(count-1); //As one number already printed
	}
}
public static void withoutRecursion(int count) {
	
	for(int i=2;i<count;i++) {
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int count=sc.nextInt();
		System.out.print(n1+" "+n2);
//		useRecursion(count-2);  //As 2 numbers already printed
		withoutRecursion(count);
	}

}
