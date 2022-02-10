import java.util.Scanner;;
public class Problem1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of a circle: ");
        double radius = input.nextDouble();

        double diameter = (radius * 2);
        double area = (Math.PI * (Math.pow(radius, 2)));

        System.out.println("The diameter is: " + diameter);
        System.out.println("The area is: " + area);
        
    }
    
}
