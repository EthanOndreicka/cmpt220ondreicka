import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a numerator: ");
        int numerator = input.nextInt();
        System.out.print("Enter a denominator: ");
        int denominator = input.nextInt();

        int mixed = (numerator % denominator);

        if (numerator < denominator){
            System.out.println(numerator + " / " + denominator + " is a proper fraction");
        }
        else if (numerator % denominator == 0){
            System.out.println(numerator + " / " + denominator + " is an improper fraction and can be reduced to " +
            (numerator / denominator));
        }
        else{
            System.out.println(numerator + " / " + denominator + " is an improper fraction and its mixed fraction is " + 
            (numerator / denominator) + " + " + (numerator % denominator + " / " + denominator));
        }

    }
}
