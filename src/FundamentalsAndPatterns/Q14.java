/*
                       1
                     2 3 2
                   3 4 5 4 3
                 4 5 6 7 6 5 4
 */

package FundamentalsAndPatterns;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int nst, cst, row, num, csp, nsp;
        row = 1;
        nst = 1;
        nsp = n - 1;
        while (row <= n) {
            num=row;
            csp=1;
            while (csp<=nsp){
                System.out.print(" ");
                csp++;
            }

            cst=1;
            while (cst<=nst){
                System.out.print(num);
                if (cst<=nst/2){
                    num++;
                }else{
                    num--;
                }
                cst++;
            }
            System.out.println();
            nsp--;
            nst+=2;
            row++;
        }
    }
}
