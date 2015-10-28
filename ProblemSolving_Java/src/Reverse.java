
public class Reverse{
    public static void main(String[] args) {
        //System.out.println("Reverse of no. is " + reversDigits(91));
        reversDigits(98198187, "");

    }

    /* Recursive function to reverse digits of num */
    public static void reversDigits(long number, String rev) {
        if (number < 10){
            //System.out.println(number) ;
            rev = rev + number;
            System.out.println(rev);
        }
        else {
            rev =  rev + (number % 10);
            reversDigits(number/10, rev);
        }
    }
}
