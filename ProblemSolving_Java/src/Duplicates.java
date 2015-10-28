
import java.util.HashMap;
import java.util.Map;


public class Duplicates{
	public static void main(String [] args){
		int [] arr = {5,1,12,-5,16, 2, 12,14,16, 6 ,7, 7, 5, 3, 16};
		findDuplicates(arr);
		
	}
	
	public static void findDuplicates(int [] arr){
		
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++){
			if (!h.containsKey(arr[i])){
				h.put(arr[i], 1);
			}
			else{
				h.put(arr[i], h.get(arr[i]) +1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry: h.entrySet()){
			if(entry.getValue() > 1){
				System.out.println(entry.getKey() + "\t" + entry.getValue());
			}
		}
	}
}
