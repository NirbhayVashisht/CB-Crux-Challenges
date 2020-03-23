/*
1
11
202
3003
40004
 */
package FundamentalsAndPatterns;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int nst,cst,num;
        nst=1;
        num=1;
        while (n>=1){
            cst=1;
            while (cst<=nst){
                if (cst==1 || cst==nst){
                    System.out.print(num);
                }else {
                    System.out.print("0");
                }
                cst++;
            }
            System.out.println();
            if (nst!=1){
                num++;
            }
            nst++;
            n--;
        }
    }
}
