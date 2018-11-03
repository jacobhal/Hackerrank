import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int[] array = new int[n];
        // Place each new element at previous index - rotation offset (need to add n to find the positive value)
        for(int i = 0; i < n; i++) {
            array[(i+n-d) % n] = scan.nextInt();
        }
        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
