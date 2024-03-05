package Numbers;

public class KrishnaMurthyNum {
public static int factorial(int n) {
	if(n==1) {
		return 1;
	}
	return n*factorial(n-1);
}
public static boolean isKrishnaMurthy(int num) {
	if(num==1) {
		return true;
	}
	int sum=0;
	int temp=num;
	while(temp!=0) {
	  sum=sum+factorial(temp%10);
	  temp=temp/10;
	}
	return (sum==num);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=145;
		if(isKrishnaMurthy(n)) {
			System.out.println(n+" is Krishnamurthy number");
		}
		else
			System.out.println("Not ");
	}

}
