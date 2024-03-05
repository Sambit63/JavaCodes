package Numbers;

public class DiaMatrix {
static int max=100;
public static void diaElements(int arr[][],int n) {
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i==j) {
				System.out.print(arr[i][j]+" ");
			}
		}
	}
	System.out.println();
}
public static int sumdiaElements(int arr[][],int n) {
	int sum=0;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i==j) {
				
				sum+=arr[i][j];
			}
		}
	}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int [][]arr= {{1,2,3,4},
				      {5,6,7,8},
				      {1,3,5,7},
				      {2,4,6,8}};
		diaElements(arr,n);
		System.out.print("The sum of the diagomal elements are -"+sumdiaElements( arr, n));
	}
}
