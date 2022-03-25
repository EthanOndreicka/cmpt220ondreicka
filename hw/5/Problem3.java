
// Ethan Ondreicka // Professor Arias // March 1st //
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userString = input.nextLine();
        input.close();

        System.out.print("The new string is: " + title(userString));

    }

    public static String title(String s) {
        String words[] = s.split("\\s");
        String newString = "";

        for (String w : words) {
            String firstWord = w.substring(0, 1);
            String restOfWords = w.substring(1);
            newString += firstWord.toUpperCase() + restOfWords + " ";
        }
        return newString.trim();
    }
}
