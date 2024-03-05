package Practice;

public class MangoDistribute {
static int binomialCoeff(int n,int r) {
	if(r==0 || r==n) {
		return 1;
	}
	return binomialCoeff(n-1,r-1)+ binomialCoeff(n-1,r);
}
static int waysDistribute(int m,int p) {
	return binomialCoeff(m+p-1,p-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=2,n=2;
		int ways=waysDistribute(m,n);
		System.out.print(ways);
	}

}
