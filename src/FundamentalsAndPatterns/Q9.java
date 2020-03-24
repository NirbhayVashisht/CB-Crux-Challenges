//Print Reverse
package FundamentalsAndPatterns;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        reverse(n);
    }

    public static void reverse(int n){
        int rev=0;
        while (n>0){
            rev = rev*10 + n%10;
            n/=10;
        }
        System.out.println(rev);
    }
}
