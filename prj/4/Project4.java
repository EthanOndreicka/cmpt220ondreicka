// Ethan Ondreicka // April 20 // Professor Arias
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project4{

    public static void main(String[] args){

        // gets user input for all info of baby
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        String year = input.next();

        System.out.print("Enter gender: ");
        String gender = input.next();

        System.out.print("Enter name: ");
        String name = input.next();
        input.close();

        File file = new File("babynamesranking" + year + ".txt");
        if (!file.exists()){
            System.out.println("No record for " + year);
            System.exit(1);
        }

        int rank = 0;
        // scans file 
        try{
            Scanner in = new Scanner(file);
            while (in.hasNext()){

                String s = in.nextLine();
                String[] temp = s.split(" ");

                if (gender.equalsIgnoreCase("M") && temp[1].contains(name))
                    rank = Integer.valueOf(temp[0]);
                else if (temp[3].contains(name))
                    rank = Integer.valueOf(temp[0]);
            }
            in.close();
            // catch the exception
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        // if else statement that prints rank of name
        if (rank == 0){
            System.out.println("The name " + name + " is not ranked in year " + year);
        } 
        else{

            System.out.println(name + " is ranked #" + rank + " in year " + year);
        }


    }
}