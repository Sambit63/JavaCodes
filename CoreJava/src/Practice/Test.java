package Practice;
import java.util.*;
public class Test {
//	public static int function(int a, int b) {
//        if (a < b) {
//            return function(b, a);
//        } else if (b != 0) {
//            return a * function(a, b - 1);
//        } else {
//            return 0;
//        }
//    }
	static int x=10;
	public  void varStatic(int x) {
//		x=11;
		this.x=x;
		x=this.x;
		
		System.out.println(x);
	}

    public static void main(String[] args) {
       Test t=new Test();
       t.varStatic(x);
    }
}
