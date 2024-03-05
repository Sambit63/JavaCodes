package String;

public class StringQs {
	//Palindrome
	public static boolean isPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i) == str.charAt(j)) {
				return true;
			}
			i++;
			j--;
		}
		return false;
	}
//	public static void main(String[] args) {
//		String s=new String("MOM");
//		if(isPalindrome(s)) {
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("Not Palindrome");
//		}
//	}
	
	//Reverse String
	public static void reverse(String str) {
		String rev="";
		char ch;
		System.out.println(str);
		
		for(int i=0;i < str.length(); i++) {
			ch=str.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
	}
//	Enter the for loop:

//		In the first iteration, ch will be assigned 'h', and rev becomes "h".
//		In the second iteration, ch will be assigned 'e', and rev becomes "eh".
//		In the third iteration, ch will be assigned 'l', and rev becomes "leh".
//		In the fourth iteration, ch will be assigned 'l', and rev becomes "lleh".
//		In the fifth and final iteration, ch will be assigned 'o', and rev becomes "olleh".
	
	//Swap 2 strings Without 3rd variable
	public static void Swap(String str1,String str2) {
		System.out.println(str1 +" "+ str2);
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		
		System.out.println(str1 +" "+ str2);
	}
//	public static void main(String[] args) {
//		String s1=new String("Sam");
//		String s2=new String("Bit");
//		Swap(s1,s2);
//	}
	
	//Sort String
	public static void Sort(String str) {
		char arr[]=str.toCharArray();
		System.out.println(str);
	char temp;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j] < arr[i]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println(arr);
}
	public static void removeSpace(String str) {
		String str1=str.replaceAll("\\s", "");
		System.out.print(str1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("sambit");
//		removeSpace(s1);
		Sort(s1);
	}

}
