
import java.util.Random;

public class kSmallest {
	
	public static void main(String[]args){
		int [] arr = {5,1,12,-5,16, 2, 12,14,5,5};
		int result = SELECT_RAND(arr, 0);
		System.out.println(result);
		
	}
	
	private static void print(int[] result) {
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i] + "\t");
		}
		System.out.println();
	}
	
	public static int SELECT_RAND(int arr[], int k)
	{
		Random rand = new Random();
		int lptr = 0;
		int rptr = arr.length-1;
		int pivot = rand.nextInt(arr.length);

		int [] a = new int[arr.length];
		for (int  i=0; i<a.length; i++){
			if(arr[i] < arr[pivot]){
				a[lptr] = arr[i];
				lptr++;
			}
			else if(arr[i] > arr[pivot]){
				a[rptr] = arr[i];
				rptr--;
			}
		}
		for(int i = lptr; i <= rptr; i++){
			a[i] = arr[pivot];
		}
		//System.out.println("K " + k + " rptr " + rptr + " lptr " + lptr);
		if(k < lptr){ 
			int [] left = new int [lptr];
			for (int i = 0; i < lptr; i++){
				left[i] = a[i];
			}
			return SELECT_RAND(left, k);
		}
		if(k>= lptr && k <= rptr){
			return a[k];
		}
		if(k > rptr){
			int j = rptr;
			int [] right = new int [a.length-1-rptr];
			for (int i =0; i < a.length-1-j; i++){
				right[i] = a[++rptr];
			}
			//System.out.println("=====");
			print(right);
			return SELECT_RAND(right, k-j-1);
		}
		return a[k];
	}

}
