/*  Hollow Diamond Pattern
 *****
 ** **
 *   *
 ** **
 *****
 */
package FundamentalsAndPatterns;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int nst,cst,nsp,csp,row;
        nst = n/2 + 1;
        nsp =0;
        row=1;
        while (row<=n){
            cst = 1;
            while (cst<=nst){
                System.out.print("*\t");
                cst++;
            }

            csp = 1;
            if (row==2){
                nsp=1;
            }
            while (csp<=nsp){
                System.out.print("\t");
                csp++;
            }

            if (row==1||row==n){
                cst=2;
            }else {
                cst = 1;
            }

            while (cst<=nst){
                System.out.print("*\t");
                cst++;
            }

            System.out.println();
            if (row<=n/2){
                nst--;
                nsp+=2;
            }else{
                nst++;
                nsp-=2;
            }
            row++;
        }
    }
 }

