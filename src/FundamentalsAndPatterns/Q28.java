
/*      Pythagoras Triplet
If m>n>0 are integers, then (m2-n2, 2mn, m2-n2) is a Pythagorean triple.
 */
package FundamentalsAndPatterns;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        long n = scn.nextLong();
        evaluate(n);
    }
    static void evaluate(long n) {
        if (n == 1 || n == 2)
            System.out.println(-1);

        else if (n % 2 == 0) {

            // Calculating for even case
            System.out.println(((n * n) / 4) - 1 + " " + (((n * n) / 4) + 1));
        }

        else if (n % 2 != 0) {

            System.out.println((n * n - 1) / 2 + " " + (n * n + 1) / 2);
        }
    }

}

