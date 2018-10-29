import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack st = new Stack();
        
        int nrOfLines = s.nextInt();
        s.nextLine();
        for(int i = 0; i < nrOfLines; i++) {
            int operation = s.nextInt();
            switch(operation) {
                case 1: st.push(s.nextInt()); break;
                case 2: st.pop(); break;
                case 3: System.out.println(Collections.max(st)); break;
            }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}