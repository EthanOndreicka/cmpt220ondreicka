import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double frictionCoefficient;

        System.out.print("Enter the friction force in Newtons: ");
        double frictionForce = input.nextDouble();
        System.out.print("Enter the object's mass in kg: ");
        double objectMass = input.nextDouble();
        System.out.print("Enter the object's acceleration in m/s^2: ");
        double objectAcceleration = input.nextDouble();

        frictionCoefficient = ((frictionForce - objectMass * objectAcceleration)/ (objectMass * 9.8));
        System.out.println("The coefficient of friction is: " + frictionCoefficient);


    }
}
