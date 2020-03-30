//Binary to Decimal
package FundamentalsAndPatterns;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int bin = obj.nextInt();
        bintodec(bin);
    }

    public static void bintodec(int n) {
        int dec = 0;
        int num =0;
        while (n>0){
            dec += (n%10)*(int)Math.pow(2,num);
            num++;
            n/=10;
        }
        System.out.println(dec);
    }
}
