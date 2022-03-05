// Ethan Ondreicka // Professor Arias // March 1st //
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userNum = input.nextInt();
        input.close();
        
        System.out.println("The binary value is " + decimalToBinary(userNum));


    }

    public static String decimalToBinary(int value){
        
        return Integer.toBinaryString(value);
        
    }
}
