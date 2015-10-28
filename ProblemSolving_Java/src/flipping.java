
public class flipping {
	
	public static void main(String [] args){
		
		int [] arr = {1,0,0,1,0,0,1,0};
		int result = flip(arr, 1,5);
		System.out.println(result);
	}
	
	public static int flip(int arr[], int l, int r){
		int countOnes = 0;
		for (int i = 0; i< arr.length; i++){
			if (i < l && arr[i] == 1 || i > r && arr[i] == 1 ){
				countOnes++;
			}
			else{
				if (arr[i] == 0 && i >= l && i <= r){
					countOnes++;
				}
			}
		}
		return countOnes;
		
	}

}
