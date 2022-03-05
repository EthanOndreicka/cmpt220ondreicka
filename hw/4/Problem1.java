import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int numOfSides = input.nextInt();
        System.out.print("Enter the side: ");
        double length = input.nextDouble();

        double area = ((numOfSides * (Math.pow(length, 2))) / (4 * Math.tan(Math.PI / numOfSides)));

        System.out.println("The area of the polygon is: " + area);

    }
}
