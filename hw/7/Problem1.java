// Ethan Ondreicka // Professor Arias // March 31 //
import java.util.Scanner;

// JA: Is this the QuadraticEquation?
public class Problem1{

   private int a;
   private int b;
   private int c;

   public Problem1(){

   }

   public Problem1(int a, int b, int c) {
       this.a = a;
       this.b = b;
       this.c = c;
   }

   public int getA() {
       return a;
   }

   public int getB() {
       return b;
   }

   public int getC() {
       return c;
   }

   public int getDiscriminant() {
       int discriminant;
       discriminant = (b * b - 4 * a * c);
       return discriminant;
   }

   public double getRoot1() {
       double root1;
       root1 = (double) (-b + Math.sqrt(getDiscriminant())) / (2 * a);
       return root1;
   }

   public double getRoot2() {
       double root2;
       root2 = (double) (-b - Math.sqrt(getDiscriminant())) / (2 * a);
       return root2;
   }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, c;
        System.out.print("Enter coefficient a, b, c: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        input.close();

        Problem1 qe = new Problem1(a, b, c);
        int discriminant = qe.getDiscriminant();

        if (discriminant > 0) {
            System.out.println("\nThe equation has two roots: ");
            System.out.println("Root1 : " + qe.getRoot1());
            System.out.println("Root2 : " + qe.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("\nThe equation has one root: ");
            System.out.println("Root : " + qe.getRoot1());
        } else {
            System.out.println("\nEquation has no roots.");
        }
    }
}
