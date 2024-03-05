package Numbers;

public class EquationSolver {
	public static void Coefficients (double a1,double b1,double c1,double a2,double b2,double c2) {
		double determinant=a1*b2 - a2*b1;
		if(determinant==0) {
			System.out.print("Not Unique solution");
		}
		else {
			double x=(c1*b2 - c2*b1)/determinant;
			double y=(a1*c2 - a2*c1)/determinant;
			System.out.println("X= "+x+" y= "+y);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coefficients(5,7,3,6,7,8);
	}

}
