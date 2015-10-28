
public class Sorting {
	
	public static void main(String [] args){
		int [] arr = {5,1,12,-5,16, 2, 12,14,16};
		int result[] = mergeSort(arr, arr.length);
		print(result);
	}
	
	private static void print(int[] result) {
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i] + "\t");
		}
		System.out.println();
	}

	public static int[] insertionSort(int arr[]){
		
		for(int i = 0; i < arr.length-1; i++){
			for(int j = i+1; j>0; j--){
				if(arr[j] < arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}	
		}
		return arr;
	}
	
	public static int[] bubbleSort(int arr[]){
		for(int i = 0; i< arr.length; i++){
			for(int j = 1; j < arr.length - i ; j++){
				if(arr[j-1] > arr[j]){
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
 				}
			}
		}
		return arr;
	}
	
	public static int[] selectionSort(int arr[]){
		for(int i = 0; i<arr.length; i++){
			for(int j = i+1; j<arr.length; j++){
				int min = arr[i];
				int min_i = i;
				if(arr[j] < min){
					min = arr[j];
					min_i = j;
				}
				//swap ith element and min element
				int temp = arr[min_i];
				arr[min_i] = arr[i];
				arr[i] = temp;
			}
			print(arr);
		}
		return arr;
	}
	
	public static int[] mergeSort(int arr[], int n){
		if(n == 1){
			return arr;
		}
		int mid = n/2;
		int A[] = new int[mid];
		int B[] = new int[n - mid];
		
		for( int i = 0; i<mid; i++){
			A[i] = arr[i];
		}
		for(int j = 0; j < n-mid; j++){
			B[j] = arr[j+n-mid];
		}
		mergeSort(A, mid);
		mergeSort(B, n-mid);
		return mergeArrays(A, B, arr);
	}

	private static int[] mergeArrays(int a[], int b[], int []arr) {
		int aL = a.length;
		int bL = b.length;
		int i = 0; int j =0;  int k= 0;
		while(i < aL && j < bL){
			if (a[i] <= b[j]){
				arr[k] = a[i]; i++;
			}
			else if(a[i] > b[j]){
				arr[k] = b[j]; j++;
			}
			k++; 
		}
		while(i < aL){
			arr[k] = a[i]; k++; i++;
		}
		while(j < bL){
			arr[k] = b[j]; k++; j++;
		}
		//print(arr);
		return arr;
	}
	
}
