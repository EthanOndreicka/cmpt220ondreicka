// Ethan Ondreicka // Professor Arias // May 5 //
import java.util.*;

public class Problem2{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        
        int items = input.nextInt();
        int [] w = new int[items];
        
        System.out.print("Enter the weights for each item: ");
        
        for(int i = 0; i < items; i++){
            w[i] = input.nextInt();
        }
        
        System.out.print("Enter the weight limit for the bag: ");
        int weightLimit = input.nextInt();

        ArrayList<Integer> result = m(items, weightLimit, w);
        
        input.close();
    }

    public static ArrayList<Integer> m(int items, int weightLimit, int[] w){
        ArrayList<Integer> result = new ArrayList<Integer>();

        boolean matchFound = false;
        boolean matchPartialFound = false;
        int matchIndex1 = -1;
        int matchIndex2 = -1;
        int maxWeight = -1;

        for(int j = 0; j < items-1; j++){
            for(int k = j+1; k< items; k++){
                int sum = w[j] + w[k];

                if(sum == weightLimit){
                    matchFound = true;
                    matchIndex1 = j;
                    matchIndex2 = k;
                    break;
                }

                else if(sum < weightLimit){
                    if(sum > maxWeight){
                        maxWeight = sum;
                        matchIndex1 = j;
                        matchIndex2 = k;
                        matchPartialFound = true;
                    }
                }
            }
            if(matchFound){
                break;
            }
        }

        System.out.println("");
        if(matchFound || matchPartialFound){
            System.out.println("The maximum weight of the items placed in the bag is " + weightLimit);
            System.out.println("The items in the bag are #" + (matchIndex1+1) + " #" + (matchIndex2+1));
            System.out.println("The weights of the items in the bag are " + w[matchIndex1] + " " + w[matchIndex2]);
            result.add(w[matchIndex1]);
            result.add(w[matchIndex2]);

        }
        return result;
    }
}