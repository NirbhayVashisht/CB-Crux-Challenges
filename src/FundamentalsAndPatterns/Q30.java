//Q30: Pattern Inverted Hourglass
/*
5                   5
5 4               4 5
5 4 3           3 4 5
5 4 3 2       2 3 4 5
5 4 3 2 1   1 2 3 4 5
5 4 3 2 1 0 1 2 3 4 5
5 4 3 2 1   1 2 3 4 5
5 4 3 2       2 3 4 5
5 4 3           3 4 5
5 4               4 5
5                   5
 */
package FundamentalsAndPatterns;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int nst,cst,nsp,csp,nr,row,num;
        nr=(2*n)+1;
        nst=1;
        nsp=(2*n)-1;
        row=1;

        while (row<=nr){
            num=n;
            cst=1;
            while (cst<=nst){
                System.out.print(num);
                cst++;
                num--;
            }
            num++;


            csp=1;
            while (csp<=nsp){
                System.out.print(" ");
                csp++;
            }

            cst=1;
            if (row==(nr/2)+1){
                cst=2;
                num++;
            }
            while (cst<=nst){
                System.out.print(num);
                cst++;
                num++;
            }


            System.out.println();

            if (row<=(nr/2)){
                nst++;
                nsp-=2;
            }else {
                nst--;
                nsp+=2;
            }

            row++;
        }
    }
}
