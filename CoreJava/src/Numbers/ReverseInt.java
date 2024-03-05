package Numbers;

public class ReverseInt {

	public static int reverse(int x) {
	       int reversed=0;
	       boolean isNegative=x<0;
	       x=Math.abs(x);
	       while(x!=0){
	           int num=x%10;
	           reversed=reversed*10+num;
	           x=x/10;
	       } 
	       return isNegative ? -reversed : reversed;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=-123;
		System.out.println(reverse(num));
	}

}
