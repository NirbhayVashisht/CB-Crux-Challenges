/*   input = 5s
     *****
    *   *
   *   *
  *   *
 *****
*/
package FundamentalsAndPatterns;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        int nsp,nst,csp,cst,row;
        nst = n;
        nsp = n-1;
        row =1;

        while (row<=n){
            csp=1;
            while (csp<=nsp){
                System.out.print(" ");
                csp++;
            }

            cst=1;
            while (cst<=nst){
                if (row==1 || row==n){
                    System.out.print("*");
                }else {
                    if (cst==1 || cst == nst){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                cst++;
            }
            System.out.println();
            row++;
            nsp--;
        }

    }
}
