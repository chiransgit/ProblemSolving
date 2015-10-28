
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Lexicographically {

	public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int noOfStrings  = Integer.parseInt(br.readLine());
        for(int i = 0; i<noOfStrings; i++){
            String input = br.readLine();
            System.out.println(rearrange(input));
        }
    }
    
    public static String rearrange(String s){
        int largest_i = -1;
        int largest_j = -1;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) < s.charAt(i+1)){
                if(i > largest_i){
                    largest_i = i;
                }
            }
        }
        
        if(largest_i == -1){
            return "no answer";
        }
        
        for(int j=largest_i; j<s.length(); j++){
            if(s.charAt(j) > s.charAt(largest_i)){
                largest_j = j;
            }
        }
        

        
        char [] c = s.toCharArray();
        
        char temp = c[largest_i];
        c[largest_i] = c[largest_j];
        c[largest_j] = temp;
        
        String new_s = new String(c);
        
        String part = "";
        for(int k=new_s.length()-1; k>largest_i; k--){
            part += new_s.charAt(k);
        }
        
        String final_string = new_s.substring(0,largest_i+1);
        
        final_string += part;
        
        return final_string;
    }}