// Ethan Ondreicka // Professor Arias // March 1st //
import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter total seconds: ");
        long userSeconds = input.nextLong();
        input.close();

        System.out.print("The hours, minutes, and seconds for total seconds " +
        userSeconds + " is " + format(userSeconds));

    }

    public static String format(long seconds){
        
        long hours = ((seconds / 3600) % 24);
        seconds %= 3600;
        int minutes = (int)(seconds / 60);
        seconds %= 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);

    }
}
