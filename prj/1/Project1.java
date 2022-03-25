import java.util.Scanner;
// JA: Comments?
public class Project1{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter s1 and number T: ");
        int s1 = input.nextInt();
        int numT = input.nextInt();

        int s2 = ((numT * 2) - s1);
        
        System.out.println("s2 = " + s2);

    }
}