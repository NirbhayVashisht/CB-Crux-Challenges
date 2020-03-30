//  Q25: Pattern Number and Stars - 2
/*
 1******
 12*****
 123****
 1234***
 12345**
 123456*
 1234567
 */
package FundamentalsAndPatterns;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        int nst,num,cst,cnum,row;
        nst=n-1;
        row=1;
        num=1;

        while (row<=n){
            cnum=1;
            while (cnum<=num){
                System.out.print(cnum);
                cnum++;
            }

            cst=1;
            while (cst<=nst){
                System.out.print("*");
                cst++;
            }

            System.out.println();
            row++;
            nst--;
            num++;
        }
    }
}
