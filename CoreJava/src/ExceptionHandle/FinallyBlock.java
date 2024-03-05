package ExceptionHandle;

public class FinallyBlock {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=100,b=0,c;
			System.out.print(a/b);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Hello Sambit");
		}
	}

}
