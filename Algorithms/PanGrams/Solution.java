import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.toLowerCase();

        char[] chars = s.toCharArray();
        final Set set = new HashSet();

        for(char c: chars){
            set.add(c);
        }

        System.out.println(set.size());
		if(set.size() == 27) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }
}