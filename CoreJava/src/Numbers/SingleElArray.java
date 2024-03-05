package Numbers;
import java.util.Arrays;
public class SingleElArray {

	public static int CheckSingle(int arr[]) {
		int res=0;
		for(int i=0;i<arr.length;i++) {
			res=res ^ arr[i];
		}
		return res;
	}
	public static int SingleCheck(int arr[]) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i+=2) {
			if(arr[i]!=arr[i+1]) {
				return arr[i];
			}
		}
		return arr[arr.length-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,1,5,2};
		System.out.println(SingleCheck(arr)+" is the single element");
	}

}
