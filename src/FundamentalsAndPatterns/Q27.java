//Q27: Pattern Number and Stars - 1
/*
1 2 3 4 5
1 2 3 4 *
1 2 3 * * *
1 2 * * * * *
1 * * * * * * *
 */
package FundamentalsAndPatterns;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int num,nst,cst,cnum;
        num=n;
        nst=0;
        while (n>=1){
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
            if (nst==0){
                nst=1;
            }else{
                nst+=2;
            }
            num--;
            n--;
        }
    }
}
