
public class BinaryPrimeCheck {
	
	public static void main(String [] args){
		if(primeCheck(1010)){
			System.out.println("Prime");
		}
		else{
			System.out.println("Not Prime");
		}
	}
	
	public static boolean primeCheck(int x){
		int number = convertB2D(x);
		if (number == 2){
			return true;
		}
		if (number % 2 == 0){
			return false;
		}
		for (int i = 3; i < Math.sqrt(number); i++){
			if(number%i == 0){
				return false;
			}
		}
		return true;
	}

	private static int convertB2D(int x) {
		int decimal = 0;
		int p = 0;
		while(true){
			if(x == 0){
				break;
			}
			else{
				int temp = x % 10;
				decimal += (int) (temp * Math.pow(2, p));
				x = x / 10;
				p++;
			}
			
		}
		return decimal;
	}

}
