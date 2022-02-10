import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the ball travel time in seconds: ");
        double timeElapsed = input.nextDouble();

        double height = (0 * timeElapsed + 9.8 * Math.pow(timeElapsed, 2) / 2);

        System.out.println("The height of the building is " + height);


    }
    
}
