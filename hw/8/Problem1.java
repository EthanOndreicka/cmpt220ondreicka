// Ethan Ondreicka // April 14th 2022 // Professor Arias //
import java.util.*;

public class Problem1 {

    public static ArrayList<String> split(String s, String delimiters){
        ArrayList<String> ls = new ArrayList<String>();
        ArrayList<Character> delims = new ArrayList<Character>();

        //adding delimeters to an arraylist
        for(int i = 0;i<delimiters.length();++i){
            delims.add(delimiters.charAt(i));
        }
       
        int i = 0;
        int j = i+1;

        while(j<s.length()){
            if(delims.contains(s.charAt(j))){
                String temp = s.substring(i, j);
                ls.add(temp);
                i = j+1;
                ++j;
            }
            else{
                ++j;
            }
        }
        //returns the ArrayList
        return ls;
    }
   
    public static void main(String[] args) {
        System.out.println(split("AB#C D?EF#45", "# ?"));
    }

}