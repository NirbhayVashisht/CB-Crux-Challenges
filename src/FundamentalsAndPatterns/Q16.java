/*  Pattern Mountain
1						1
1	2				2	1
1	2	3		3	2	1
1	2	3	4	3	2	1
 */
package FundamentalsAndPatterns;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int nst,cst,nsp,csp,row;
        nst=1;
        nsp=2*n-3;
        row=1;
        while (row<=n){
            cst=1;
            while (cst<=nst){
                System.out.print(cst+"\t");
                cst++;
            }

            csp=1;
            while (csp<=nsp){
                System.out.print("\t");
                csp++;
            }

            cst--;
            if (row==n){
                cst--;
            }
            while (cst>=1){
                System.out.print(cst+"\t");
                cst--;
            }

            System.out.println();
            nst++;
            nsp-=2;
            row++;
        }

    }
}
