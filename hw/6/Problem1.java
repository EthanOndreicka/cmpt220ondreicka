// Ethan Ondreicka // Professor Arias // March 24th //
public class Problem1{
    static int count[]=new int[10];
    public static void main(String[] args){
        int x;
        for(int i=1; i<100; i++){
            x = (int)(Math.random()* 10);
            count[x]++;
        }
        for(int i=0; i<10; i++){
            System.out.println("number of " + i + "'s=" + count[i]);
        }
 
    }
 
}
