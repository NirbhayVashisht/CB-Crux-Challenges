/*   for input n = 6
1
11
111
1001
11111
100001
*/
package FundamentalsAndPatterns;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int nst,cst,row;
        nst=1;
        row=1;
        while (row<=n){
            cst=1;
            while (cst<=nst){
                if (cst==1 ||cst==nst){
                    System.out.print("1");
                }else {
                    if (row%2==0){//if row is even
                        System.out.print("0");
                    }else {//if row is odd
                        System.out.print("1");
                    }
                }
                cst++;
            }
            System.out.println();
            nst++;
            row++;
        }
    }
}
