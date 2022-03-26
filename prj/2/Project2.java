// Ethan Ondreicka // Professor Arias // March 20th //
import java.util.Scanner;
public class Project2{
    public static void main(String[] args) {
        // scanner to take user input
        Scanner input = new Scanner(System.in);
        // keep track of remainders
        int remainder[] = new int[42];
        // keep track of amount of inputs
        int count = 1;
        System.out.println("Input 10 non-negative integers, each smaller than 1000: ");
        for(int i=0; i<10; i++) {
            // read user input
            System.out.print("Input " + count + ": ");
            int n = input.nextInt();
            // find remainder with 42
            int r = n % 42;
            // mark the remainder
            remainder[r] = 1;
            count++;
        }
        input.close();
        int ans = 0;
        // loop of all remainders
        for(int i = 0; i < 2; i++) {            
            // Count the remainder
            if(remainder[i] == 1) {
                ans++;
            }
        }
        // number of distinct integers
        System.out.println("Distinct Numbers: " + ans);
    }
}
