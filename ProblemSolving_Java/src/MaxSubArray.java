
public class MaxSubArray {
	
	public static void main(String args[]){
		int arr[] = {-1,1,1,-1,1,1,1};
		int max = maxSubArray(arr);
		System.out.println(max);
	}
	
	@SuppressWarnings("unused")
	private static void print(int[] result) {
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i] + "\t");
		}
		System.out.println();
	}
	
	 public static int maxSubArray(int[] A) {
	       int newsum=A[0];
	       int max=A[0];
	       int S[] = new int[A.length];
	       for(int i=1;i<A.length;i++){
	           newsum=Math.max(newsum+A[i],A[i]);
	           max= Math.max(max, newsum);
	           S[i] = max;
	       }
	       print(S);
	       int end = S[S.length -1];
	       int end_pos = 0;
	       for (int i = S.length-1; i >= 0; i--){
	    	   if(S[i] < end){
	    		   end_pos = i+1;
	    		   break;
	    	   }
	       }
	       System.out.println(end_pos-end+1 + " - " + end_pos);
	       
	       return max;
	    }
}
