// Ethan Ondreicka / CMPT_220L_201_22S / Feb 2, 2021 //
public class Problem2 {
    public static void main(String[] args) {
        
        double startingVelo = 4.6;
        double endingVelo = 11.5;
        double time = 0.6;
        double average;
        // Calculates Average Acceleration
        average = ((endingVelo - startingVelo) / time);
        System.out.println("a = " + average);

    }
}
