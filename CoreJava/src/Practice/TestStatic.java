package Practice;

public class TestStatic {
	public int  divide(int a,int b) {
		int c=-1;
		try {
			c=a/b;
		}
		catch(Exception e) {
			
			System.err.print("Exception");
		}
		finally {
			
			System.err.print("Finally");
		}
		
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=21;
		TestStatic t=new TestStatic();
		t.divide(4,0);
	}

}
