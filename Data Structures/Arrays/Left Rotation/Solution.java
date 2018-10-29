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
        for(int i = 0; i < n; i++) {
            array[(i+n-d) % n] = scan.nextInt();
        }
        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }    

/*
        // Rotate a
        a = rotate(d, a);
        // Print result
        print(a);
        */
    }

    /*

    public static int[] rotate(int nrOfRotations, int arr[]) {

      while(nrOfRotations > 0) {
        // First value of array
        int firstValue = 0;
        for(int i = 0; i < arr.length-1; i++) {
          if(i == 0)
            firstValue = arr[i];
          arr[i] = arr[i+1];
        }
        arr[arr.length-1] = firstValue;
        nrOfRotations--;
      }

      return arr;
    }

    public static void print(int arr[]) {
      for(int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }

    */
}