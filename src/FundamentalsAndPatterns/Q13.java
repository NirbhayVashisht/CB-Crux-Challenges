//Check Prime

package FundamentalsAndPatterns;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();
        int flag = 0;

        for (int i = 2; i<=Math.sqrt(n);i++){
            if (n%i==0){
                flag=1;
                break;
            }
        }

        if (flag==0){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }

    }
}
