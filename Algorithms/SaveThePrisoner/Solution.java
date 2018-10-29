import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        
        
        for(int j = 0; j < T; j++) {
            int N = s.nextInt();
            int M = s.nextInt();
            int S = s.nextInt();
            for(int i = M; i > 1; i--) {
                S++;
                if(S == N) {
                    S = 0;
                }
            }
            
            System.out.println(S);
        }
    }
}
