//Decimal to Octal
package FundamentalsAndPatterns;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int ans = 0;
        int mult = 1;
        while (n > 0) {
            ans = ((n % 8) * mult) + ans;
            mult*=10;
            n /= 8;
        }
        System.out.println(ans);
    }
}
