import java.util.Scanner;
public class Project5{
   public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       Complex num1, num2;
       double input1, input2;
       // reads input for first complex #
       System.out.print("Enter the first complex number: ");
       input1 = input.nextDouble();
       input2 = input.nextDouble();
       num1 = new Complex(input1, input2);
       // reads input for second complex #
       System.out.print("Enter the second complex number: ");
       input1 = input.nextDouble();
       input2 = input.nextDouble();
       num2 = new Complex(input1, input2);
       System.out.println();
       // prints results
       System.out.println(num1.toString() + " + " + num2.toString() + " = " + num1.add(num2).toString());
       System.out.println(num1.toString() + " - " + num2.toString() + " = " + num1.subtract(num2).toString());
       System.out.println(num1.toString() + " * " + num2.toString() + " = " + num1.multiply(num2).toString());
       System.out.println(num1.toString() + " / " + num2.toString() + " = " + num1.divide(num2).toString());
       System.out.println("|" + num1.toString() + "| = " + num1.abs());
       input.close();
   }
}

