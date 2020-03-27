/*  Pattern With Zeroes
1
2 2
3 0 3
4 0 0 4
5 0 0 0 5
 */
package FundamentalsAndPatterns;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        int nst,cst;
        nst =1;
        while (nst<=n){
            cst=1;
            while (cst<=nst){
                if (cst==nst || cst==1){
                    System.out.print(nst);
                }else{
                    System.out.print("0");
                }
                cst++;
            }
            System.out.println();
            nst++;
        }
    }
}
