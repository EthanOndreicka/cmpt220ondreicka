// Ethan Ondreicka // April 20th // Professor Arias //
import java.util.Scanner;

public class Problem3 {

    public static class BinaryFormatException extends NumberFormatException {
        public BinaryFormatException() {
        }

        public BinaryFormatException(String s) {
            super(s);
        }
    }

    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        int total = 0;
        for(int i = 0; i < binaryString.length(); ++i) {
            if(binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
                throw new BinaryFormatException(binaryString + " is not a binary number");
            }
            total += Math.pow(2, binaryString.length() - i - 1) * (binaryString.charAt(i) - '0');
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String str = input.nextLine();
        try {
            System.out.println("Decimal value of " + str + " is " + bin2Dec(str));
        } catch (BinaryFormatException e) {
            System.out.println(e.getMessage());
        }
        input.close();
    }
}