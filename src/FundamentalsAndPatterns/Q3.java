package FundamentalsAndPatterns;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int n;
        for (; ; ) {
            n = obj.nextInt();
            sum = sum + n;
            if (sum>=0){
                list.add(n);
            }else {
                break;
            }
        }
        for (int num:list){
            System.out.println(num);
        }
    }
}
