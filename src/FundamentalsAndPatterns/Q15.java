package FundamentalsAndPatterns;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int nst,cst,a,b,num;
        nst =1;
        a=0;
        b=1;

        while (n>=1){
            cst=1;

            while (cst<=nst){
                System.out.print(a+"\t");
                cst++;
                num=a+b;
                a=b;
                b=num;
            }

            System.out.println();
            nst++;
            n--;
        }
    }
}
