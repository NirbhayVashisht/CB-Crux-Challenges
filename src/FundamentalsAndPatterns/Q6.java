//Revising Quadratic Equations
package FundamentalsAndPatterns;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

        double d = (b * b) - (4 * a * c);
        if (d>0){
            double r1 = (-b + Math.sqrt(d))/(2*a);
            double r2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("Real and Distinct");
            System.out.println(r1 + ' ' + r2);
        }else if(d==0) {
            System.out.println("Real and Equal");
            double r1 = (-b + Math.sqrt(d))/(2*a);
            System.out.println(r1 + ' ' + r1);
        }else{
            System.out.println("Imaginary");
        }
    }
}
