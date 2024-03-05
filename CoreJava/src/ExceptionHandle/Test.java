package ExceptionHandle;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Sambit";
		int i;
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i) =='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				System.out.println("The vowel is present at index -"+i);
			}
			else {
				System.out.println("The vowel is not present-"+i);
			}
		}
	}
	
}
