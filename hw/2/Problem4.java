import java.util.Scanner;;
public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int numOfMinutes = input.nextInt();

        int numOfDays = ((numOfMinutes / 60)/24);
        int numOfYears = numOfDays / 365;
        int remainingDays = (numOfDays % 365);

        System.out.print(numOfMinutes + " minutes is approximately " + 
                        numOfYears + " years and " + remainingDays + " days");


    }
}
