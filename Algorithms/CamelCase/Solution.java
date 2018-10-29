import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        Pattern p = Pattern.compile("[A-Z]");
		Matcher m = p.matcher(s);

		int counter = 0;
		while (m.find())
    		counter++;


        System.out.println(counter + 1);
    }
}