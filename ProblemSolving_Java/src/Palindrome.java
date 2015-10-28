
public class Palindrome {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z ]", "");
        str = str.replaceAll(" ", "");
        str = str.toLowerCase();
        int i,j;
        System.out.println(str);
        for (i = 0,j=str.length()-1; i < str.length(); i++, j--)
        {
            char a = str.charAt(i);
            char b = str.charAt(j);
			if (a == b)
            {
             	continue;
            }else{
                return false;
            }   
        }
        return true;
    }

    public static void main(String[] args) {
        
        System.out.println(isPalindrome("Noel sees Leon. Noel sees Leon."));
        System.out.println(isPalindrome("Noel sees Leon, Noel sees Leon."));
        System.out.println(isPalindrome("A"));
        System.out.println(isPalindrome("a"));
    }
}