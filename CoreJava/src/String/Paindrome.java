package String;

public class Paindrome {
	public static boolean isPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i < j) {
			if(str.charAt(i) == str.charAt(j)) {
				return true;
			}
			i++;
			j--;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("mom");
		if(isPalindrome(str)) {
			System.out.print("Palindrome");
		}
		else {
			System.out.print("Not Palindrome");
		}
	}

}
