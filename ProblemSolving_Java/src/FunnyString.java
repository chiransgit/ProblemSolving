
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyString {

	public static void main(String[] args) throws IOException {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfLines= 0;
		noOfLines = Integer.parseInt(br.readLine());
		for (int i = 0; i < noOfLines; i++) {
			boolean funny = true;
			String line = br.readLine();
			for (int j = 0, k = line.length() - 1; j < line.length() - 1; j++, k--) {
				int val1 = Math.abs(line.charAt(j + 1) - line.charAt(j));
				int val2 = Math.abs(line.charAt(k - 1) - line.charAt(k));
				System.out.println("|" + line.charAt(j + 1) + "-"
						+ line.charAt(j) + "| " + " = " + val1);
				System.out.println("|" + line.charAt(k - 1) + "-"
						+ line.charAt(k) + "| " + " = " + val2);

				if (val1 != val2) {
					funny = false;
					System.out.println("Not Funny");
					break;
				}
			}
			if (funny) {
				System.out.println("Funny");
			}
		}
	}
}