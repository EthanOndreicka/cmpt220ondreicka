// Ethan Ondreicka / CMPT_220L_201_22S / Feb 2, 2021 //
public class Problem1 {
    public static void main(String[] args) {
        
        double a = 2;
        double b = 5;
        double c = 4;

        double answer;
        // calculates discriminant 
        answer = (Math.pow(b, 2) - (4 * a * c));

        System.out.println("The Discriminant of 2x^2 + 5x + 4 = 0 is: " + answer);
    }
}
