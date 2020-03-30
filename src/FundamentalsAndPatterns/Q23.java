//Q23: Increasing Decreasing Sequence
package FundamentalsAndPatterns;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //input total numbers
        int n = obj.nextInt();

        //previous number
        int prev = obj.nextInt();

        int cnt = 1;
        boolean goingUp = false;
        boolean isValid = true;

        while (cnt<n){
            int cur = obj.nextInt();

            int diff = cur-prev;
            //diff determines if seq is strictly dec or inc

            if (diff == 0){
                isValid = false;
                break;
            }else if(diff > 0){  // If Sequence is increasing
                goingUp = true;
            }else if(goingUp && diff < 0){
                // If Sequence is Decreasing if its already increased once
                isValid = false;
            }
            prev = cur;
            cnt++;
        }

        System.out.println(isValid);
    }
}
