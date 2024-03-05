package String;

public class SubString {
public static boolean isSubstring(String str1,String str2) {
	
	int j=0;
	for(int i=0;i<str1.length();i++) {
		if(j<str2.length() && str1.charAt(i)==str2.charAt(j)) {
			j++;
		}
	}
	return j==str2.length();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sambit Sahoo";
		String s2="Sahoo";
		if(isSubstring(s1,s2)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}