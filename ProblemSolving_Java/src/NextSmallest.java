
import java.util.Arrays;

public class NextSmallest {
	
	public static void main( String args[]){
		
		int[] arr = {1, 2, 2, 2, 5, 4, 91, 29 ,11, 28};
		Arrays.sort(arr);
		int mid=nextSmallest(arr, 2, 0, arr.length-1);
		while(mid != 0 && arr[mid] == arr[mid-1]){
			--mid;
		}
		if (mid == 0){
			System.out.println("No next smallest number");
			//System.exit(0);
			
		}
		else{
			System.out.println("Next smallest number --> " + arr[mid-1]);
			//sssSystem.exit(0);
		}
	}

	private static int nextSmallest(int[] arr, int no, int left, int right) {
		// TODO Auto-generated method stub
		int mid = (left + right)/2;
		
		if(no != arr[mid]){
			if (no > arr[mid]){
				left = mid +1;
				mid=nextSmallest(arr, no, left, right);
			}
			else if(no < arr[mid]){
				right = mid -1;
				mid=nextSmallest(arr, no, left, right);
			}
		}
		return mid;
			
	}
}
