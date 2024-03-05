package ExceptionHandle;
import java.util.*;
class YoungerAgeException extends RuntimeException{
	YoungerAgeException(String msg){
		super(msg);
	}
}
public class ThrowKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter your age:-");
		int a=sc.nextInt();
		try {
			if(a<18) {
				throw new YoungerAgeException("You are not Eligible");
			}
			else {
				System.out.println("You are Eligible");
			}
		}catch(YoungerAgeException e){
			e.printStackTrace();
		}
		System.out.println("Hello Sambit");
	}

}
