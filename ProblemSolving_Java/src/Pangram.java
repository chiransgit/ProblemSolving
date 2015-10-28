
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangram {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String line = input.toLowerCase();
        HashSet<Character> characterSet = new HashSet<Character>();
        boolean pangram = false;
        for(int i = 0; i<line.length(); i++){
            characterSet.add(line.charAt(i));
            print(characterSet);
            if(characterSet.size()==26){
                System.out.println("pangram");
                pangram = true;
                break;
            }
        }
        if(!pangram){
            System.out.println("not pangram");
        }
    }

	private static void print(HashSet<Character> characterSet) {
		// TODO Auto-generated method stub
		System.out.println(characterSet);
	}
}
