
//equal number of Odd and Even Numbers
public class OddEvenRearrange {
	
	public static void main(String [] args){
		
		int [] arr = {2,1,3,4,7,9,24,98};
		rearrange(arr);
	}
	
	private static void print(int[] result) {
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i] + "\t");
		}
		System.out.println();
	}

	private static void rearrange(int[] arr) {
		int [] new_arr  = new int[arr.length];
		int even_counter = -1;
		int odd_counter = -2;
		for (int i = 0; i<arr.length; i++){
			if(arr[i] % 2 != 0){
				odd_counter += 2;
				new_arr[odd_counter] = arr[i];
			}else{
				even_counter += 2;
				new_arr[even_counter] = arr[i];
			}
		}
		print(new_arr);
	}

}
