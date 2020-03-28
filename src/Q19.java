import java.util.ArrayList;
import java.util.Scanner;

//Is Armstrong Number
public class Q19 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int nu=n;
        ArrayList<Integer> num = new ArrayList <>();
        while (n>0){
            num.add(n%10);
            n/=10;
        }
        int check=0;
        for (int i = num.size()-1;i>=0;i--){
            int temp =(int) Math.pow(num.get(i),num.size());
            check=check + temp;
        }
        if (nu == check){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
