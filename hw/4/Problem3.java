import java.util.Scanner;
public class Problem3 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a genome string: ");
        String genome = input.nextLine();
        boolean isGenome = false;
        int start = -1;
        for (int i = 0; i < genome.length() - 2; i++) {
            String triplet = genome.substring(i, i + 3);
            if (triplet.equals("ATG")) {
                start = i + 3;
            } 
            else if (((triplet.equals("TAG")) || (triplet.equals("TAA")) || (triplet.equals("TGA"))) && (start != -1)){
                String gene = genome.substring(start, i);
                if (gene.length() % 3 == 0){
                    isGenome = true;
                    System.out.println("Found: " + gene);
                    start = -1;
                }
            }
        }
            if (!isGenome){
            System.out.println("no gene is is found");
            }
    }
}


