
public class IntegerComparison {
	
	public static void main(String [] args){
		
		System.out.println(checkInteger(12, 13));
		System.out.println(checkInteger(12, 12));
		System.out.println(checkPowerOf2(16));
		System.out.println(checkPowerOf2(15));
		System.out.println(checkPowerOf2NoLoop(3));
	}

	private static int checkPowerOf2NoLoop(int i) {
		// TODO Auto-generated method stub
		return i & (i-1);
	}

	private static boolean checkPowerOf2(double i) {
		// TODO Auto-generated method stub
		while ( i != 1 && i > 1){
			i /= 2;
		}
		if(i == 1){
			return true;
		}
		else{
			return false;
		}	
	}

	private static int checkInteger(int i, int j) {
		// TODO Auto-generated method stub
		return i^j;
	}

}
