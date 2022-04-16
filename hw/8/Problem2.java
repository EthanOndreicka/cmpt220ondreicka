// Ethan Ondreicka // April 14th 2022 // Professor Arias //
import java.util.*;

// JA: This seems to miss some weights
public class Problem2{
    //method to find the largest value
    public static int largest(int arr[], int size){
        int largestValue = arr[0];
  
        for(int i = 0; i < size; i++){
            if(largestValue < arr[i])
                largestValue = arr[i];
            }
  
        return largestValue;
    }
  
    //function to find the closest value
    public static int closestValue(int arr[], int size, int n){
        int diff = Math.abs(n - arr[0]);
        int closest = arr[0];
        for(int i = 0; i < size; i++){
            if(diff>Math.abs(n - arr[i])){
                diff = Math.abs(n - arr[i]);
                closest = arr[i];
            }
        }
  
        return closest;
    }
  
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
  
        //get user input
        System.out.print("Enter the number of object: ");
        int numOfObject = input.nextInt();
      
        int weight[] = new int[numOfObject];
      
        //get the weight of each object
        System.out.print("Enter the weights of the objects: ");
        for(int i = 0; i < numOfObject; i++){
            weight[i] = input.nextInt();
        }
      
        int x = 1;

        while(true){
            boolean flag = false;
            int max = largest(weight, numOfObject);
            int second = closestValue(weight, numOfObject, 10-max);
            System.out.println("Container " + x + " contains objects with weight "
            + max + " " + second);
      
            for(int i = 0; i < numOfObject; i++){
                if(weight[i] == max || weight[i] == second)
                    weight[i] = 0;
            }
            for(int i = 0; i < numOfObject; i++){
                if(weight[i]!=0)
                    flag = true;
            }
            if(!flag)
            break;

            x++;
       }

       input.close();
   }
}
