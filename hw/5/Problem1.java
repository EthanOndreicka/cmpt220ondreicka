// Ethan Ondreicka // Professor Arias // March 1st //
import java.util.Scanner;
public class Problem1{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long userDigit = input.nextLong();
        input.close();

        System.out.print("Result: " + multiplyDigits(userDigit));

    }

    public static int multiplyDigits(long n){
        long x = 1;

        while(n > 0){
            x = x * (n % 10);
            n /= 10;
        }

        return (int)x;

    }
}