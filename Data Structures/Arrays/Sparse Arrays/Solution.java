import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nrOfStrings = s.nextInt();
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i <= nrOfStrings; i++) {
            list.add(s.nextLine());
        }
       
        
        int nrOfQueries = s.nextInt();
        s.nextLine();
        for(int i = 0; i <= nrOfQueries; i++) {
            String ez = s.nextLine();
            //System.out.println(ez);
            System.out.println(Collections.frequency(list, ez));
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}