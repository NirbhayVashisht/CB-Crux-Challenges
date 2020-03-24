//Delhi's Odd Even
/*Sample Input:
2
12345
12134
Sample Output:
Yes
No
 */
package FundamentalsAndPatterns;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        for (int num:arr){
            checkOddEven(num);
        }
    }

    public static void checkOddEven(int n) {
        int sOdd = 0, sEven = 0;
        int temp = 0;
        while (n > 0) {
            temp = n % 10;
            if (temp % 2 == 0) {
                sEven = sEven + temp;
            }else{
                sOdd = sOdd + temp;
            }
            n/=10;
        }

        if ((sEven % 4 == 0) || (sOdd % 3== 0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
