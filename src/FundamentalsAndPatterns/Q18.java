//Count Digits
package FundamentalsAndPatterns;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int n = obj.nextInt();
        int count = 0;
        while (num > 0) {
            if ((num % 10) == n) {
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
}
