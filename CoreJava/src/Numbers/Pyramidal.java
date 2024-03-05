package Numbers;
import java.util.*;
public class Pyramidal {
//    1
//	2 1 2
//3 2 1 2 3
    public static void Pyramid1(int n) {
        for (int i = 1; i <= n; i++) {    //if you want to reverse horizontally+:-for (int i = n; i >= 1; i--)
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print left half of the row in decreasing order
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Print right half of the row in increasing order
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println(); // Move to the next row
        }
	}
    
//    1
//  1 2 1
//1 2 3 2 1
    public static void Pyramid2(int n) {
    	//Printing the no of rows
    	for(int i=1;i<=n;i++) {
    		
    		for(int j=1;j<=n-i;j++) {
    			System.out.print("  ");  //Printing spaces with 2 space inside the sop to  each row to be centered in the console. 
    		}
    		for(int j=1;j<=i;j++) {      // Print left half of the row in increasing order
    			System.out.print(j+" ");
    		}
    		for(int j=i-1;j>=1;j--) {    // Print right half of the row in decreasing order
    			System.out.print(j+" ");
    		}
    		System.out.println();
    	}
    }
    
//  1
// 222
//33333
    public static void Pyramid3(int n) {
    	for(int i=1;i<=n;i++) {
    		
    		for(int j=1;j<=n-i;j++) {
    			System.out.print(" ");
    		}
    		for(int j=1;j<=2*i-1;j++) {
    			System.out.print(i);
    		}
    		System.out.println();
    	}
    }

//  1
// 123
//12345  
    public static void Pyramid4(int n) {
    	for(int i=1;i<=n;i++) {
    		
    		for(int j=1;j<=n-i;j++) {
    			System.out.print(" ");
    		}
    		for(int j=1;j<=2*i-1;j++) {
    			System.out.print(j);
    		}
    		System.out.println();
    	}
    }
    
// 33333
//  222
//   1
    public static void Pyramid5(int n) {
    	for(int i=n;i>=1;i--) {
    		for(int j=1;j<=n-i;j++) {
    			System.out.print(" ");
    		}
    		for(int j=1;j<=2*i-1;j++) {
    			System.out.print(i);
    		}
    		System.out.println();
    	}
    }
//  *
// ***
//*****
    public static void starPyramid(int n) {
 
    	for(int i=1;i<=n;i++) {
    		
    		for(int j=1;j<=n-i;j++) {
    			System.out.print(" ");
    		}
    		for(int j=1;j<=2*i-1;j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of input:-");
		int n=3;
//		Pyramid1(n);
//		Pyramid2(n);
		Pyramid1(n);
//		starPyramid(n);
	}

}
