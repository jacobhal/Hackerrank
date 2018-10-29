import java.io.*;
import java.util.*;

public class Solution {

    public static int getMaxHourglass(int[][] arr) {
        int max = -1000, currentVal = -1000;
        int[] tmpArr = new int[7];

        for(int i = 0; i < 4; i++) { // Max y-value for hourglass top row
            for(int j = 0; j < 4; j++) {
                tmpArr[0] = arr[j][i];
                tmpArr[1] = arr[j+1][i];
                tmpArr[2] = arr[j+2][i];

                tmpArr[3] = arr[j+1][i+1];

                tmpArr[4] = arr[j][i+2];
                tmpArr[5] = arr[j+1][i+2];
                tmpArr[6] = arr[j+2][i+2];

                // Call calcsum with each hourglass
                currentVal = calcSum(tmpArr);

                if(currentVal > max) {
                    max = currentVal;
                }
                // DEBUG
/*       
                System.out.println(tmpArr[0] + " " + tmpArr[1] + " " + tmpArr[2]);
                System.out.println(tmpArr[3]);
                System.out.println(tmpArr[4] + " " + tmpArr[5] + " " + tmpArr[6]);
*/

            }
        }
        return max;
    }

    public static int calcSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int[][] arr = new int[6][6];
        
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                arr[j][i] = s.nextInt();
            }
        }

        int max = getMaxHourglass(arr);

        
        System.out.println(max);
        
        
    }
}