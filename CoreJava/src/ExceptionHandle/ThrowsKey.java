package ExceptionHandle;
import java.io.*;
public class ThrowsKey {
static void readfile() throws FileNotFoundException {
	FileInputStream fis=new FileInputStream("d:/xyz.txt");
	//Statements
}
static void savefile() throws FileNotFoundException {
	FileOutputStream fos=new FileOutputStream("d:/abc.txt");
	//Statements
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			readfile();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
				
	}

}
