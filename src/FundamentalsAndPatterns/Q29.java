/*
 5 4 3 2 1 0 1 2 3 4 5
   4 3 2 1 0 1 2 3 4
     3 2 1 0 1 2 3
       2 1 0 1 2
         1 0 1
           0
         1 0 1
       2 1 0 1 2
     3 2 1 0 1 2 3
   4 3 2 1 0 1 2 3 4
 5 4 3 2 1 0 1 2 3 4 5
 */
package FundamentalsAndPatterns;

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int nst,nsp,csp,cst,row,num;
        num=n;
        row=1;
        nst=2*n+1;
        nsp=0;
        while (row<=2*n+1){
            csp=1;
            while (csp<=nsp){
                System.out.print(" ");
                csp++;
            }

            cst=1;
            while (cst<=nst){
                System.out.print(num);
                if (cst<=nst/2){
                    num--;
                }else{
                    num++;
                }
                cst++;
            }
            num--;

            System.out.println();
            if (row<=((2*n)+1)/2){
                nst-=2;
                nsp++;
                num--;
            }else {
                nst+=2;
                nsp--;
                num++;
            }
            row++;

        }
    }
}
