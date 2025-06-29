// Ethan Ondreicka // Feb 17 2022 //
import java.util.Scanner;
public class Problem1{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // calculating for the roots + discriminant
        double discriminant = ((Math.pow(b, 2)) - 4 * a * c);
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        if (discriminant > 0){
            System.out.println("The equation has two roots, " + root1 + " and " + root2);
        }
        else if (discriminant == 0){
            System.out.println("The equation has one root, " + root1);
        }
        else{
            System.out.println("The equation has no real roots");
        }


        
    }
}