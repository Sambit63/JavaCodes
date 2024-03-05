package Numbers;
import java.util.*;
public class NthPrime {
		static boolean isPrime(int num) {
			if(num<=1) {
				return false;
			}
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					return false;
				}
			}
			return true;
		}
		static int nthPrime(int n) {
			if(n<=0) {
				System.exit(1);
			}
			int count=0;
			int num=2;
			while(count<n) {
				if(isPrime(num)) {
					count++;
				}
				num++;
			}
			return num-1;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the value of n:-");
		int n;
		n=sc.nextInt();
		
		System.out.println("The value of "+n+" th prime is-"+nthPrime(n));
		}

}
