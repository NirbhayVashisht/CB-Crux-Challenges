//Von Neuman Loves Binary
//Given a binary number ,help Von Neuman to find out its decimal representation.
// For eg 000111 in binary is 7 in decimal.
package FundamentalsAndPatterns;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        //taking n inputs on the list
        while (n>0){
            list.add(obj.nextInt());
            n--;
        }
        //calling function for n inputs
        for (int num:list){
            BinToDec(num);
        }
    }

    public static void BinToDec(int n){
        int dec=0;
        int p = 0;
        while (n>0){
            dec =dec + (n%10)*(int)Math.pow(2,p);
            n/=10;
            p++;
        }
        System.out.println(dec);
    }
}
