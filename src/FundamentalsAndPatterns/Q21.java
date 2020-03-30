//Q21: Conversion F to C
package FundamentalsAndPatterns;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int minF=obj.nextInt();
        int maxF=obj.nextInt();
        int step = obj.nextInt();
        //c=(5/9)(f-32)
        int c;
        for (int i = minF;i<=maxF;i+=step){
            c=(5*(i-32)/9);
            System.out.println(i+"\t"+c);
        }

    }
}
